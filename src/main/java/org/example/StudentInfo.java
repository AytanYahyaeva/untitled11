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

        age=66;
        System.out.println(age);


        int a1=4;
        float a2=4;
        System.out.println(a1+a2);


        String name11="Aytan";
        int agee=22;
        System.out.println(name11+": "+agee);

    }
}
