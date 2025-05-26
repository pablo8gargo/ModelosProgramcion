/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import observers.CurrentConditionDisplay;
import observers.ForecastDisplay;
import observers.HeatIndex;
import observers.Observer;
import observers.StaticsDisplay;
import observers.ThirdPartyDisplay;
import subject.WeatherData;

/**
 *
 * @author estudiantes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer heatIndex = new HeatIndex(weatherData);
        Observer forecastDisplay = new ForecastDisplay(weatherData);
        Observer currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        Observer  StaticsDisplay= new StaticsDisplay(weatherData);
        Observer  thirdPartyDisplay  = new ThirdPartyDisplay(weatherData);
        
        weatherData.measurementsChanged(65, 22, 1013);
        System.out.println("\n");
        weatherData.measurementsChanged(95, 32, 113);
        
        
    }
    
}
