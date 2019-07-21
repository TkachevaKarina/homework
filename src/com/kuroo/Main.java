package com.kuroo;

public class Main {

    public static void main(String[] args) { Dog myDog = new Dog(3, 5, "black");
        System.out.println(myDog.toString());
        Cat myCat = new Cat(2, 4, "grey");
        System.out.println(myCat.toString());
        Snake mySnake = new Snake(1, 2, "yellow");
        System.out.println(mySnake.toString());
        Bird myBird = new Bird(2, 2, "green");
        System.out.println(myBird.toString());
        myCat.go();
        myBird.go();
        mySnake.go();
        myDog.go();
    }
}