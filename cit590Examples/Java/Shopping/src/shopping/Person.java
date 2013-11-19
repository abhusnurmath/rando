package shopping;

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer{

	String personName;

	public Person(String personName) {
		this.personName = personName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		try{
			if (arg0 instanceof Product) {
				Product p = (Product) arg0;
				System.out.println("Hello "+ personName+ ", Product " + ((Product)arg0).getProductName() + " is now " +arg1.toString()+" on amazon");
			}
		}
		catch(Exception e){
			System.out.println("unexpected type observed");
		}
	}
}
