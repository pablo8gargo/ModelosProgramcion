package duck;

import flyBehavior.FlyWithWings;
import quackBehavior.Quack;



public class MallardDuck extends  Duck {
    
    @Override
    public void display() {
        System.out.println("Im a Mallard Duck, my behaviors are:");
    }

    @Override
    public void swim() {
    }

    public MallardDuck() {
        super();
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
    
}
