package com.kuroo;

import java.util.Scanner;

public class Home {

    public static void main(String[] args) {
        int numberCycle = 1;
        while (true) {
            System.out.println("Number cycle: " + numberCycle);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter count potatos: ");
            int countPotatos = scanner.nextInt();

            System.out.print("Enter count package: ");
            int countPackage = scanner.nextInt();


            char[] array = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
            for (int numberPackage = 1; numberPackage <= countPackage; numberPackage++) {
                if (numberPackage <= array.length) {
                    System.out.println(numberPackage + "" + array[numberPackage - 1]);
                } else {
                    System.out.println(numberPackage + "Fiasko");
                }

            }
            int countPotatosInPackage = countPotatos / countPackage;
            if (countPotatosInPackage <= 200) {
                System.out.println("Count potatos in package " + countPotatosInPackage);
            } else {
                System.out.println("You should take more packages");
            }

            numberCycle ++;
        }
    }
}