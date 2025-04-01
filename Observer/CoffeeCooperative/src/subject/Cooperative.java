
package subject;

import java.util.ArrayList;
import java.util.List;
import observer.Observer;


public class Cooperative implements Subject{
    private List<Observer>observers;
    private double height;
    private String productorName;
    private String notesCata;
    private String origin;
    private int pounds;
    private String varietal;

    public Cooperative() {
        this.observers = new ArrayList<>();
    }
    

    public double getHeight() {
        return height;
    }
    public String getProductorName() {
        return productorName;
    }
    public String  getNotescata() {
        return notesCata;
    }
    public String getOrigin() {
        return origin;
    }

    public int getPounds() {
        return pounds;
    }
    public String getVarietal() {
        return varietal;
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
            observer.update(productorName, notesCata, origin, height, pounds, varietal);
        }
    
    }
    
    public void registerNewBatch(double height, String productorName, String notesCata, String origin, int pounds, String varietal){
        this.height = height;
        this.productorName = productorName;
        this.notesCata = notesCata;
        this.origin = origin;
        this.pounds = pounds;
        this.varietal = varietal;
        notifyObservers();
    }
}

