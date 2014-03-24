package poly;


public class Rational {
    
    int numerator;
    int denominator;
    
    Rational(){
        
    }
    
    Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
	
    /***
     * add the given rational number to
     * this rational number
     * @param r
     */
    void add(Rational r){
        this.numerator = this.numerator * r.denominator 
                + this.denominator * r.numerator;
        this.denominator = this.denominator * r.denominator;
     
    }
    
    void sub(Rational r){
        
    }
    
    void multiply(Rational r){
        
    }
    
    void divide(Rational r){
        
    }
    
    @Override
    public String toString() {
      return numerator + "/" + denominator;
    }
    
   
    
    public static void main(String[] args) {
       //we will worry about this later.
    }
    
}
