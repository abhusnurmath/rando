package shopping;

import java.util.Observer;

/***
 * we define this interface so that
 * any class that wants to manage a list 
 * of observers can implement this interface 
 * and provide some common methods for other classes
 * to use.
 * @author Arvind
 *
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
