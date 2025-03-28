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
public class HeatIndex implements Observer, DisplayElement{
     
    private Subject weatherData;
    private float heatIndex;
    
    public HeatIndex(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Heat index: " + heatIndex + " C");
    }
    
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.heatIndex = computeHeatIndex(temperature, humidity);
        display();
    }
    private float computeHeatIndex(float temperature, float humidity) {

        double c1 = -8.78469475556;
        double c2 = 1.61139411;
        double c3 = 2.33854883889;
        double c4 = -0.14611605;
        double c5 = -0.012308094;
        double c6 = -0.0164248277778;
        double c7 = 0.002211732;
        double c8 = 0.00072546;
        double c9 = -0.000003582;

        double hi = c1 + (c2 * temperature) + (c3 * humidity) + (c4 * temperature * humidity) + (c5 * temperature * temperature) + (c6 * humidity * humidity)+ (c7 * temperature * temperature * humidity)+ (c8 *temperature * humidity * humidity)+ (c9 * temperature * temperature * humidity * humidity);

        return (float) hi;
    }
}
