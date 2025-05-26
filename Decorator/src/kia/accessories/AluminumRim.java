package kia.accessories;

import kia.AccessoryDecorator;
import kia.Car;

public class AluminumRim extends AccessoryDecorator {
    Car car;

    public AluminumRim(Car car){
        this.car = car;
    }
    
    @Override
    public double cost(){
        return 500.000 + car.cost();
    }

    @Override
    public String getDescription() {
        return car.getDescription() +" AluminumRim";
    }
}
