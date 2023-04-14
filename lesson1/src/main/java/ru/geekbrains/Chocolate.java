package ru.geekbrains;

public class Chocolate extends Product {

    private int calories;

    public int getCalories() {
        return calories;
    }

    public Chocolate(String name, double price, int calories){
        super(name, price);
        this.calories = calories;
    }

    @Override
    String displayInfo() {
        return String.format("%s - %s - цена: %.2f - калории: %d", brand, name, price, calories);
    }
}