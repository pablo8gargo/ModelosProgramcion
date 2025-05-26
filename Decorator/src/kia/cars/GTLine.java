package kia.cars;
import kia.Car;

public class GTLine extends Car  {
    
    public GTLine (){
        description = "GTLine ";
    }

    @Override
    public double cost() {
        return 76990000;
    }
}
