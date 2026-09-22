package org.example;

public class Personn {
    public static void main(String[] args) {
        FoodItem item1 = new Pizza("Margarita",15,2,"small");
        FoodItem item2 = new Drink("BBQ Chicken",22,1,false);
        item1.displayInfo();
        System.out.println(item1.getTotalPrice());
        item2.displayInfo();
        System.out.println(item2.getTotalPrice());

    }
}

/*
4. main() daxilində
//Aşağıdakı kimi müxtəlif obyektlər yarat:
//FoodItem item1 = new Pizza(...);
//FoodItem item2 = new Drink(...);
//Sonra hər iki obyekt üçün:
// item1.displayInfo();
//System.out.println(item1.getTotalPrice());
//
// item2.displayInfo();
//System.out.println(item2.getTotalPrice());
//çağır.

*/