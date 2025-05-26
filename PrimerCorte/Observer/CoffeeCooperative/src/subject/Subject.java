package subject;

import observer.Observer;

/**
 *
 * @author estudiantes
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}

