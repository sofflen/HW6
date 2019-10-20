package interfaces.impl;

import interfaces.Animals;

public class Giraffe implements Animals {

    private int id;
    private int age;
    private int weight;
    private String color;

    public Giraffe(int id, int age, int weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public void voice() {
        System.out.println("Hello. I am wild animal.");
    }

    @Override
    public boolean isWild() {
        return true;
    }

    @Override
    public boolean isVaccinated() {
        return false;
    }

    @Override
    public boolean isPredator() {
        return false;
    }
}
