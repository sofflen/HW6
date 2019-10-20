package interfaces.impl;

import interfaces.Animals;

public class Dog implements Animals {

    private int id;
    private int age;
    private int weight;
    private String color;
    private String name;

    public Dog(int id, int age, int weight, String color, String name) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Hello, my name is " + this.getName() + ". Woof.");
    }

    @Override
    public boolean isWild() {
        return false;
    }

    @Override
    public boolean isVaccinated() {
        return true;
    }

    @Override
    public boolean isPredator() {
        return false;
    }
}
