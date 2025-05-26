package kia.accessories;

import kia.AccessoryDecorator;
import kia.Car;

public class ThreePieceCarpet extends AccessoryDecorator{
    Car car;

    public ThreePieceCarpet(Car car){
        this.car = car;
    }
    
    @Override
    public double cost(){
        return 92.000 + car.cost();
    }

    @Override
    public String getDescription() {
        return car.getDescription() +" ThreePieceCarpet";
    }
}
