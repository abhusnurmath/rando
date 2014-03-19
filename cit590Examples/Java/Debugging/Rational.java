package poly;


public class Rational {
    
    int numerator;
    int denominator;
    
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
        this.numerator += r.numerator;
        this.denominator += this.denominator;
    }
    
    @Override
    public String toString() {
      return numerator + "/" + denominator;
    }
    
    public static void main(String[] args) {
        Rational r1 = new Rational(3,4);
        Rational r2 = new Rational(4,5);
        r1.add(r2);
        System.out.println("upon adding r2 to r1 we get " + r1);
        //create an array of rationals and add them all up
        //reduce to lowest terms
    }
    
}
