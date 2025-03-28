package duck;

import flyBehavior.FlyBehavior;
import quackBehavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck(){
        
    }
    public abstract void swim();
    
    public abstract void display();
    
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    
    
    
}
