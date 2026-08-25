package org.example;

import java.util.Scanner;

public class tapsiriq2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1-ci məhsulun qiymətini daxil edin:");
        double p1=input.nextDouble();

        System.out.println("2-ci məhsulun qiymətini daxil edin:");
        double p2=input.nextDouble();

        System.out.println("3-cü məhsulun qiymətini daxil edin:");
        double p3=input.nextDouble();

        double p=p1+p2+p3;
        System.out.println("Ümumi məbləğ: "+ p);


        // 2-ci tapsiriq

        System.out.println("Uzunluğu daxil edin:");
        int a=input.nextInt();

        System.out.println("Eni daxil edin:");
        int b=input.nextInt();

        int Sahe=a*b;
        int Perimetr=2*(a+b);

        System.out.println("Sahe: "+Sahe +" "+"Perimetr: "+Perimetr);




        }
    }