package main;

import duck.DecoyDuck;
import duck.Duck;
import flyBehavior.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck decoy = new DecoyDuck();
            System.out.println("Decoy Duck with original behavior:");
            decoy.display();
            decoy.performQuack();
            decoy.performFly();

            System.out.println("\nChanging the decoy duck's flying behavior at runtime:");
            decoy.setFlyBehavior(new FlyRocketPowered());
            decoy.display();
            decoy.performFly();
    }
}
