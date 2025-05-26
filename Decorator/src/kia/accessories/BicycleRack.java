package kia.accessories;

import kia.AccessoryDecorator;
import kia.Car;

public class BicycleRack extends AccessoryDecorator{
    Car car;

    public BicycleRack(Car car){
        this.car = car;
    }
    
    @Override
    public double cost(){
        return 810.000 + car.cost();
    }

    @Override
    public String getDescription() {
        return car.getDescription() +" BicycleRack";
    }
}
