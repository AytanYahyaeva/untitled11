package org.example;

public class StudentInfo {
    public static void main(String[] args){
        //StudentInfo adlı bir class yaradın.
        //Bu class-da aşağıdakı primitive dəyişənləri elan edin və dəyərlər verin:
        //
        //Dəyişən adı    Tipi    Təsviri
        //name    String    tələbənin adı (Məsələn: Əli)
        //age    byte    tələbənin yaşı (Məsələn: 21)
        //grade    char    tələbənin qiyməti (‘A’, ‘B’, ‘C’ və s.)
        //isActive    boolean    tələbənin aktiv olub-olmaması
        //averageScore    float    orta balı(Məsələn: 87.2)

        String name="Əli";
        byte age=21;
        char grade='F';
        boolean isActive=false;
        float averageScore=87.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(grade);
        System.out.println(isActive);
        System.out.println(averageScore);


    }
}
