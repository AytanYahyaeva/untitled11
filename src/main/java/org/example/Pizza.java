package org.example;

public class Pizza extends FoodItem {
    private String size;

    public Pizza(String name,double price,int quantity,String size) {
        this.size = size;
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    @Override
    public double getTotalPrice() {
        double total = getPrice() * getQuantity();
        if (size.equalsIgnoreCase("large")){
            total = total * 1.2;
        }
        return total;
    }
}