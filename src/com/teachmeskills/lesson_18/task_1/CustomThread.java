package com.teachmeskills.lesson_18.task_1;

public class CustomThread extends Thread {

    String name;

    public CustomThread(String name) {
        this.name = name;
    }

    public void run(){

        for (int i = 0; i < 4; i++) {
            System.out.println("Custom thread " + name + " is running " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
