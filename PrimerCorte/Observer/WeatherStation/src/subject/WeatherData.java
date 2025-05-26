package subject;

import java.util.ArrayList;
import java.util.List;
import observers.Observer;


/**
 *
 * @author estudiantes
 */
public class WeatherData implements Subject{
    private float humidity;
    private float temperature;
    private float pressure;
    private List<Observer>observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    
    
    @Override
    public void registerObserver(Observer o) {
    observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(temperature, humidity, pressure);
        }
    
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }
    
    
    public void measurementsChanged(float humidity, float temperature, float pressure){
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
        
    }
}
   
