package home;

import java.util.ArrayList;


public class Burguer {
    private String name;
    private Meat meat;
    private Bread bread;
    private Cheese cheese;
    private ArrayList<Topping> toppings = new ArrayList();

    public void setName(String name) {
        this.name = name;
    }
    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

     @Override
    public String toString() {
        StringBuilder burguerdescription = new StringBuilder();
        burguerdescription.append(name).append("\n").append("Build Burger with Bread:").append(bread.getType()).append("\n")
                .append("Meat: ").append(meat.getName()).append("\n")
                .append("Cheese: ").append(cheese.getName()).append("\n")
                .append("Toppings: ").append("\n");


        for (Topping topping : toppings) {
            burguerdescription.append(topping.getName()).append("\n");

        }
        return burguerdescription.toString();
}   }