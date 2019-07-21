package com.kuroo;

public class Animal {
    private int age;
    private int weight;
    private String color;


    public String go(){
        return "";
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
    public String toString() {
        return "{" +
                "age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}'+ go();
    }
}