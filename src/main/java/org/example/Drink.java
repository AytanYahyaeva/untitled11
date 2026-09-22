package org.example;

public class Drink extends FoodItem{
    private boolean isCold;
    public Drink(String name,double price,int quantity,boolean isCold){
        this.isCold = isCold;
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }
    @Override
    public double getTotalPrice(){
        double total = getPrice() * getQuantity();
        if(isCold){
            total = total + 1;
        }
        return total;
    }
}