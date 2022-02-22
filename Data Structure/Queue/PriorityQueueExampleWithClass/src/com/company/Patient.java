package com.company;

public class Patient {
    private int id;
    private int priority;
    private String name;

    public Patient(int id, int priority, String name) {
        this.id = id;
        this.priority = priority;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", priority=" + priority +
                ", name='" + name + '\'' +
                '}';
    }
}
