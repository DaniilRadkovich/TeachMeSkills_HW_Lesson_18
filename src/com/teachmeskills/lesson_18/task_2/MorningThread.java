package com.teachmeskills.lesson_18.task_2;

public class MorningThread extends Thread {

    public MorningThread() {
    }

    public MorningThread(String occupationName, int priority) {
        setName(occupationName);
        setPriority(priority);
    }

    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("I'm " + getName()+ "... " + i + " ---> my priority is " + getPriority());
        }
    }
}
