package com.teachmeskills.lesson_18.task_1;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {

        CustomThread t1 = new CustomThread("T1");
        CustomThread t2 = new CustomThread("T2");
        CustomThread t3 = new CustomThread("T3");

        t3.start();
        t3.join();

        t2.start();
        t2.join();

        t1.start();
        t1.join();
    }
}
