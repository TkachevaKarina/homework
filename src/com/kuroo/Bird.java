package com.kuroo;

public class Bird extends Animal {
    public Bird(int age, int weight, String color) {
        this.setAge(age);
        this.setWeight(weight);
        this.setColor(color);


    }

    @Override
    public String toString() {
        return "My Bird " + super.toString();

    }

    @Override
    public String go() {
        return "Fly";
    }
}