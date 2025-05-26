package kia.accessories;

import kia.AccessoryDecorator;
import kia.Car;


public class SafetyBolt extends AccessoryDecorator {
    Car car;

    public SafetyBolt(Car car){
        this.car = car;
    }
    
    @Override
    public double cost(){
        return 156.100 + car.cost();
    }

    @Override
    public String getDescription() {
        return car.getDescription() +" SafetyBolt";
    }

}
