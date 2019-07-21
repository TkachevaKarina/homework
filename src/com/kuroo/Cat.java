package com.kuroo;

public class Cat extends Animal {
    public Cat(int age, int weight, String color) {
        this.setAge(age);
        this.setWeight(weight);
        this.setColor(color);
    }

    @Override
    public String toString() {
        return "My Cat " + super.toString();

    }

    @Override
    public String go() {
        return "Jump";
    }
}
