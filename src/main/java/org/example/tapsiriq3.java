package org.example;

import java.util.Locale;
import java.util.Scanner;

public class tapsiriq3 {
    public static void main(String[] args) {

/*
Tapşırıq 1 - Tələbə adlarından ibarət String massivi yaradın:
Proqram aşağıdakıları etməlidir:

Massivin uzunluğunu göstərsin.
"Ali" adının neçə simvoldan ibarət olduğunu String metodu ilə tapsın.
"Murad" adını böyük hərflərlə ekrana çıxarsın.
"Aysel" adını kiçik hərflərlə ekrana çıxarsın.
 */

        String[] Telebeler ={"Ali","Murad","Aysel"};
        System.out.println("1-CI TAPSIRIQ");

        System.out.println(Telebeler.length);
        System.out.println(Telebeler[0].length());
        System.out.println(Telebeler[1].toUpperCase());
        System.out.println(Telebeler[2].toLowerCase());

 /*
Tapşırıq 2 - İstifadəçidən adını və soyadını daxil etməsini istəyin.
Proqram aşağıdakıları etməlidir:
Ad və soyadı birləşdirib tam adı ekrana çıxarsın(String metodu istifadə edin).
Tam adın neçə simvoldan ibarət olduğunu tapsın.
Tam adı böyük hərflərlə ekrana çıxarsın.
Tam adı kiçik hərflərlə ekrana çıxarsın.
Adın ilk hərfini ekrana çıxarsın.
Soyadın son hərfini ekrana çıxarsın.
 */
        System.out.println("2-CI TAPSIRIQ");
        Scanner input = new Scanner(System.in);
        System.out.println("Adinizi daxil edin: ");
        String ad=input.next();

        System.out.println("Soyadinizi daxil edin: ");
        String soyad=input.next();

        System.out.println(String.join(" ",ad,soyad ));
        System.out.println(ad.length()+soyad.length()+1);
        System.out.println(ad.toUpperCase()+" "+soyad.toUpperCase());
        System.out.println(ad.toLowerCase()+" "+soyad.toLowerCase());
        System.out.println(ad.charAt(0));
        System.out.println(soyad.substring(soyad.length()-1));

        // Qeyd- her defe ad+soyad yerine ayrica String butovad = String.join(" ",ad,soyad) yaradaraq da istifade ede bilerik
    }
}



