package com.kuroo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int defaultCountPotatosInToPackage = 30;
        System.out.println("Package capacity: "+defaultCountPotatosInToPackage);

        System.out.print("Please enter count potatos: ");
        int countPotatos=scanner.nextInt();

        System.out.print("Please enter count package: ");
        int countPackage=scanner.nextInt();

        int countPotatosInToPackages=defaultCountPotatosInToPackage*countPackage;
        if (countPotatosInToPackages > countPotatos){
            System.out.println("Count Potatos in to package: " + countPotatos);
        }else{
            System.out.println("Count Potatos in to package: "+countPotatosInToPackages);}
        System.out.println("Potato residue or (if negative meaning) empty bag space: "+(countPotatos-countPotatosInToPackages));
    }
}
