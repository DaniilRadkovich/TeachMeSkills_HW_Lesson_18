package com.teachmeskills.lesson_18.task_2;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        PropertiesForMorning property = new PropertiesForMorning();

        property.setProperties("1");
        MorningThread breakfast = new MorningThread(property.getName(), property.getPriority());
        System.out.println(breakfast);

        property.setProperties("2");
        MorningThread coffee = new MorningThread(property.getName(), property.getPriority());
        System.out.println(coffee);

        property.setProperties("3");
        MorningThread news = new MorningThread(property.getName(), property.getPriority());
        System.out.println(news);

        news.start();
        coffee.start();
        breakfast.start();
    }
}
