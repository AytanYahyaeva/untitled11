package org.example;

//Tapşırıq 1 — Food Delivery System(10 xal)
//Bir yemək çatdırılma sistemi hazırlayın.
//        Tələblər
//FoodItem adlı class yaradın:
//        • name
//• price
//• quantity
//Field-lər private olmalıdır.
//Constructor vasitəsilə məlumatları qəbul et.
//Aşağıdakı methodları yarat:
//double getTotalPrice() void displayInfo()
//getTotalPrice():
//price × quantity
//hesablamalıdır.
//2. Pizza class-ı yarat
//FoodItem-dan inherit etsin.
//Əlavə field:
//size
//getTotalPrice() methodunu override et.
//Əgər pizza large ölçüdürsə, qiymətə 20% əlavə etsin.
//Məsələn:
//price = 10
//quantity = 2
//size = large
//
//        total = 24
//
//3. Drink class-ı yarat
//FoodItem-dan inherit etsin.
//Əlavə field:
//isCold
//Əgər isCold == true olarsa, qiymətə 1 AZN əlavə et.
//getTotalPrice() methodunu override et.
//
//        4. main() daxilində
//Aşağıdakı kimi müxtəlif obyektlər yarat:
//FoodItem item1 = new Pizza(...);
//FoodItem item2 = new Drink(...);
//Sonra hər iki obyekt üçün:
//        item1.displayInfo();
//System.out.println(item1.getTotalPrice());
//
//        item2.displayInfo();
//System.out.println(item2.getTotalPrice());
//çağır.


public class FoodItem {
    private String name;
    private double price;
    private int quantity;
    public FoodItem(String name,double price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public FoodItem(){

    }
    public double getTotalPrice(){
        return price * quantity;
    }
    public void displayInfo(){
        System.out.println("Food: " + name + " price: " + price + " quantity: " + quantity);
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}