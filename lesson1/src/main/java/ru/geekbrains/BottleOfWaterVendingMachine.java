package ru.geekbrains;

import java.util.List;

public class BottleOfWaterVendingMachine {

    private final List<Product> products;

    public BottleOfWaterVendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, int volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                if (product.getName().equals(name) && ((BottleOfWater)product).getVolume() == volume){
                    return (BottleOfWater)product;
                }
            }
        }
        return null;
    }

    public BottleOfMilk getBottleOfMilk(String name, int volume){
        for (Product product : products){
            if (product instanceof BottleOfMilk){
                if (product.getName().equals(name) && ((BottleOfMilk)product).getVolume() == volume){
                    return (BottleOfMilk)product;
                }
            }
        }
        return null;
    }

    public Chocolate getChocolate(String name){
        for (Product product : products){
            if (product instanceof Chocolate){
                if (product.getName().equals(name)){
                    return (Chocolate)product;
                }
            }
        }
        return null;
    }
}