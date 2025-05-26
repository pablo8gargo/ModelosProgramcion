package PizzaFactory.PizzaType;

import PizzaFactory.Pizza;

public class ClamPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing clam pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking clam pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting clam pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing clam pizza");
    }

}
