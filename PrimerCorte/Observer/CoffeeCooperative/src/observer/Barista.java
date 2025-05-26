/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import subject.Cooperative;
import subject.Subject;

/**
 *
 * @author estudiantes
 */
public class Barista implements Observer, DisplayElement{
     
    private  Subject coperative;
    
    public Barista(Subject coperative) {
        this.coperative = coperative;
        this.coperative.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("El barista quedo notificado");
    }
    
    @Override
    public void update(String productorName, String notesCata, String origin, double height, int pounds, String varietal) {
        display();
    }

}
