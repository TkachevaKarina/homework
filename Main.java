package com.kuroo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter count potatos: ");
        int countPotatos=scanner.nextInt();

        System.out.print("Enter count package: ");
        int countPackage=scanner.nextInt();

        int countPotatosInPackages;
        countPotatosInPackages = countPotatos/countPackage;

        System.out.println("Count potatos in package:" + countPotatosInPackages);
        System.out.println("Remainder potatos:" + (countPotatos - (countPackage * countPotatosInPackages)));
    }
}
