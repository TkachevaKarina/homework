package com.kuroo;

public class Snake extends Animal {
    @Override
    public String toString() {
        return "My Snake " + super.toString();
    }

    public Snake(int age, int weight, String color) {
        this.setAge(age);
        this.setWeight(weight);
        this.setColor(color);
    }

    @Override
    public String go() {
        return "Uses";
    }
}