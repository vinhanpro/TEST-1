package com.company;

public class Student {
    public synchronized  void printPoint() {
        for (int i=0; i< 10;i++) {
            System.out.println(i+ " of " + Thread.currentThread().getName() );
        }try {
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
