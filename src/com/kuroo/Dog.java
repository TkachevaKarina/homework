package com.kuroo;

public class Dog extends Animal {
    public Dog(int age, int weight, String color) {
        this.setAge(age);
        this.setWeight(weight);
        this.setColor(color);
    }

    @Override
    public String toString() {
        return "My Dog " + super.toString();
    }

    @Override
    public String go() {
        return "Run";
    }
}
