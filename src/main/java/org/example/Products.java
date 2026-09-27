package org.example;
import java.util.*;

//Task 1: 5 points
//Bir mağazanın məhsullarını saxla.
//Proqram:
//Bütün məhsulları göstərsin.
//Eyni məhsulun iki dəfə əlavə olunmasına imkan verməsin.
//Verilmiş məhsulun olub-olmadığını yoxlasın.
//Məhsul varsa silsin.
//Ümumi məhsul sayını göstərsin.
//Sual: Hansindan istifade etmek daha meqsede uygundur ve niye?(List, Map, Set)

// Hashset istifade etmek daha ok-dur,cunki esas olaraq sertde dublicate olunmamaq istenilib, set unikal deyerleri saxlayacaq deye hashset istifade edirik
public class Products {
    public static void main(String[] args) {
        Set<String> products = new HashSet<>();
        products.add("Laptop");
        products.add("Keyboard");
        products.add("Headphones");
        products.add("Wireless mouse");
        products.add("Laptop");

        System.out.println(products);
        System.out.println(products.contains("SmartWatch"));
        System.out.println(products.remove("Keyboard"));
        System.out.println(products.size());

        System.out.println("--- Task 2 ---");
    //Task 2 — Student Grades: 5 points
//siyahida tələbələrin adlarını və qiymətlərini saxla.
//Proqram:
//Bütün tələbə və qiymətləri göstərsin.
//Verilmiş tələbənin qiymətini tapsın.
// 70+ alan tələbələri göstərsin.
//Ən yüksək qiyməti tapan tələbəni göstərsin.
//Verilmiş tələbənin qiymətini dəyişsin.
// Tələbə yoxdursa, uyğun mesaj göstərsin.
        Map<String,Integer> students = new HashMap<>();
        students.put("Wanda",95);
        students.put("Tony",45);
        students.put("Loki",88);
        students.put("Natasha",75);
        System.out.println(students);
        System.out.println("70-den yuxari olanlar:");
        for (Map.Entry<String,Integer> entry: students.entrySet()){
            if(entry.getValue() > 70 ){
                System.out.println(entry.getKey());
            }}
            System.out.println("En yuksek qiymeti alan:");
            students.put("Loki",99);
            System.out.println("Qiymeti deyisdi: "+ students.get("Loki"));
            if (!students.containsKey("Peter")){
                System.out.println("Bele telebe yoxdur");
            }

        System.out.println("--- Task 3 ---");
//        Task 3 — Word Counter — Map + String : 5 points
//        İstifadəçidən bir cümlə al:
//        java selenium java api selenium java
//        Map<String, Integer> istifadə edərək hər sözün neçə dəfə təkrarlandığını tap.
//                Nəticə:
//        java -> 3
//        selenium -> 2
//        api -> 1
//        İstifadə etməlisən:
//        Map String
//        split()
//        loop
//        if/else
//        Bonus: Böyük və kiçik hərfləri eyni hesab et:
//        Java java JAVA
//        nəticə:
//        java -> 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cumleni daxil et");
        String sentence = scanner.nextLine();

        sentence = sentence.toLowerCase();
        String[] words = sentence.split(" ");

        Map <String,Integer> count = new HashMap<>();
        for (String word : words){
            if (count.containsKey(word)){
                count.put(word,count.get(word)+1);
            }else {
                count.put(word,1);
            }
        }
        for (String key : count.keySet()) {
            System.out.println(key + ": " + count.get(key));
        }






}
}
