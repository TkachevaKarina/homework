package com.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter count package: ");
        int countPackage=scanner.nextInt();
        System.out.print("Please enter count package in to potatos: ");
        int countPackageInToPotatos=scanner.nextInt();
        int countPotatos;
        countPotatos=countPackage/countPackageInToPotatos;
        System.out.println("Count  potatos: "+countPotatos);
        System.out.println("Reminder package: "+(countPackage-(countPackageInToPotatos*countPotatos)));
    }
}
