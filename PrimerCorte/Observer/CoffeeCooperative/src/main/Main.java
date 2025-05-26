package main;

import observer.Barista;
import observer.Observer;
import subject.Cooperative;

/**
 *
 * @author estudiantes
 */
public class Main {

    public static void main(String[] args) {
        Cooperative coperative = new Cooperative();
        Observer barista = new Barista(coperative);
        coperative.registerNewBatch(0, "Name", "N", "a", 0, "N");
        
        
    }
    
}

