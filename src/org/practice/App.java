package org.practice;

class MyCounter extends Thread{
    private int threadNo;

    public MyCounter(int threadNo){
        this.threadNo = threadNo;
    }

    @Override
    public void run(){
        countMe();
    }
    public void countMe(){
        for( int i = 1; i<=9; i++){
            try {
                sleep(500);
            }catch(InterruptedException e){
              e.printStackTrace();
            }
            System.out.println("The value of i is:"+i+" and the thread number is: " +threadNo);
        }
    }

}
public class App {
    public static void main(String[] args) throws InterruptedException {
        MyCounter counter1 = new MyCounter(1);
        MyCounter counter2 = new MyCounter(2);

        long startTime = System.currentTimeMillis();
        counter1.start();
        System.out.println("*****************");
        counter2.start();
        Thread.sleep(4505);
        long endtime = System.currentTimeMillis();
        System.out.println("The total time required to process " +(endtime-startTime));

    }

}
