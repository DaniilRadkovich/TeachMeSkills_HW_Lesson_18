package com.teachmeskills.lesson_18.task_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesForMorning {

    private String occupationName;
    private int priority;

    public PropertiesForMorning(String occupationName, int priority) {
        this.occupationName = occupationName;
        this.priority = priority;
    }

    public PropertiesForMorning() {
    }

    public String getName() {
        return occupationName;
    }

    public int getPriority() {
        return priority;
    }

    public void setProperties(String item) {

        Properties properties = new Properties();

        try (FileInputStream fis = new FileInputStream("C:\\Users\\mradk\\IdeaProjects\\TeachMeSkills_HW_Lesson_18\\src\\com\\teachmeskills\\lesson_18\\task_2\\morningProperties.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.occupationName = properties.getProperty("occupationNameT" + item);
        this.priority = Integer.parseInt(properties.getProperty("priorityT" + item));
    }
}



