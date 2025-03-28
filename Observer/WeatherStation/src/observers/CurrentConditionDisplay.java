/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observers;

import subject.Subject;

/**
 *
 * @author estudiantes
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }
   

    @Override
    public void display() {
        System.out.println("Display current measurements");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        display();
    }
    
}
