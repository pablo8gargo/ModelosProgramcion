/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duck;

import flyBehavior.FlyNoWay;
import quackBehavior.MuteQuack;
/**
 *
 * @author orlag_nzyjv2m
 */
public class DecoyDuck extends Duck {

    @Override
    public void swim() {
        
    }

    @Override
    public void display() {
        System.out.println("Im a Decoy Duck, my behaviors are:");
        
    }

    public DecoyDuck() {
        super();
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }
    
}
