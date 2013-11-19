package shopping;

public class ShoppingMain {

    public static void main(String[] args) {
        Person arvindPerson=new Person("Arvind");
        Person davePerson=new Person("Dave");
        
        Product samsungMobile=new Product("Samsung", "Mobile", "Not available");
        
        //When you opt for option "Notify me when product is available".Below registerObserver method
        //get executed        
        samsungMobile.registerObserver(arvindPerson);
        samsungMobile.registerObserver(davePerson);
        
        //Now product is available
        samsungMobile.setAvailability("Available");
        
    }
}
