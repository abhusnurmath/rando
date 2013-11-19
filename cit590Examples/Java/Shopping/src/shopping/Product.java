package shopping;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Product extends Observable implements Subject{

	private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String productName;
    private String productType;
    String availability;
    
    
	public Product(String productName, String productType,String availability) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.availability=availability;
	}
	
	public ArrayList<Observer> getObservers() {
		return observers;
	}
	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
		notifyObservers();
	}

	/***
	 * we need to do an override since every registered observer (in this case user)
	 * needs to be notified.
	 * In this particular program the goal is for every user to now get a notification
	 * saying XYZ product has now become available.
	 */
	public void notifyObservers() {
		System.out.println("Notifying to all the subscribers when product became available");
		 for (Observer ob : observers) {
             ob.update(this, this.availability );
      }

	}

	public void registerObserver(Observer observer) {
		 observers.add(observer);
		
	}

	public void removeObserver(Observer observer) {
		 observers.remove(observer);
		
	}

}
