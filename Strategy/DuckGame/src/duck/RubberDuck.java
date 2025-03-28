package duck;

import flyBehavior.FlyNoWay;
import quackBehavior.Squeak;

public class RubberDuck extends Duck{
    
    @Override
    public void display() {
        System.out.println("Im a Rubber Duck, my behaviors are:");
    }

    @Override
    public void swim() {
    }

    public RubberDuck() {
        super();
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }
    
    
}
