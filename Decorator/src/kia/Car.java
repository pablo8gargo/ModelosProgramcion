package kia;
public abstract class Car {
    public String description = "Unknown Car";

    public String getDescription(){
        return description;
    }
    
    public abstract double cost();


}
