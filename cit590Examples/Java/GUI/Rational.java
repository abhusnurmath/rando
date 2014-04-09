// Kevin Lee

package guiprograms;
import java.util.*;

public class Rational {
	
	private int num;
	private int den;
	
	public static void main(String[] args){
		
		Rational r = new Rational(1, 4);
		Rational r1 = new Rational(1, 4);
		Rational r2 = r.add(r1);
		r2.reduceToLowestForm();
		System.out.println(r1.toString() + " added to " + r.toString() + " = " + r2.toString());
		Rational r3 = new Rational(2, 3);
		Rational r4 = new Rational(3, 2);
		Rational r5 = r3.mul(r4);
		r5.reduceToLowestForm();
		System.out.println(r5);
		
	}
	
	
	public Rational(int num, int den){
	/**
	 * 
	 * Constructor for Rational class
	 * 
	 * @param num = num
	 * @param den = den. Cannot be 0.
	 * 
	 */
		this.num = num;
		this.den = den;
		if (den == 0){
			
			throw new ArithmeticException("Denominator cannot be 0");
			
		}

	}

	public int getNumerator(){
		/**
		 * 
		 * Get numerator for Rational
		 * 
		 */
		return this.num;
		
	}
	
	public int getDenominator(){
		/**
		 * 
		 * Get denominator for Rational
		 * 
		 */
		return this.den;
		
	}
	
	public void setNumerator(int num){
		/**
		 * 
		 * @param num - new numerator
		 * 
		 * Setter for the numerator for the Rational
		 * 
		 */
		this.num = num;
		
	}
	
	public void setDenominator(int den){
		/**
		 * 
		 * @param den - new denominator
		 * 
		 * Setter for the denominator for the Rational
		 * 
		 */
		if (den == 0){
			
			throw new ArithmeticException("Denominator cannot be 0");
			
		}
		this.den = den;
		
	}	
	
	public double decimal(){
		/**
		 * Implement the float() conversion function.
		 * 
		 */
		double result = (double)(this.num) / (double)(this.den);
		
		return result;
		
	}
	
	
	public Rational reduceToLowestForm(){
		/**
		 * 
		 * Cancel out common factors
           between numerator and denominator
		 * 
		 */
		int maxPossibleFactor = Math.min(this.num, this.den);
		for (int i = 2; i < maxPossibleFactor + 1; i++){
			
			while (this.num % i == 0 && this.den % i == 0){
				
				this.num = this.num / i;
				this.den = this.den / i;
				
			}
			
		}
		Rational result = new Rational(this.num, this.den);
		return result;
	}
	
	
	public Rational sqr(){
		/**
		 * 
		 * Implement squaring of this Rational
		 * 
		 */
		
		Rational result = mul(this);
		return result;
		
	}
	
	
	public Rational div(Rational other){
		/**
		 * 
		 * @param other - the other Rational that you want to divide
		 * Divide other by this Rationals. Returns a Rational
		 * 
		 */
		int newNum = this.num * other.den;
		int newDen = this.den * other.num;
		Rational result = new Rational(newNum, newDen);
		return result.reduceToLowestForm();
		
	}
    
	
	public Rational mul(Rational other){
		/**
		 * 
		 * @param other - the other Rational that you want to multiply
		 * Multiply two Rationals. Returns a Rational
		 * 
		 */
		int newNum = this.num * other.num;
		int newDen = this.den * other.den;
		Rational result = new Rational(newNum, newDen);
		
		return result.reduceToLowestForm();
	}
	
	
	public Rational sub(Rational other){
		/**
		 * 
		 * @param other - the other Rational that you want to subtract
		 * Subtract other (Rational) from this (Rational). Returns a Rational
		 * 
		 */
		int newNum = ((this.num * other.den) - (other.num * this.den));
		int newDen = other.den * this.den;
		Rational result = new Rational(newNum, newDen);
		
		return result.reduceToLowestForm(); 
		
	}
	
	
	public Rational add(Rational other){
		/**
		 * 
		 * @param other - the other Rational that you want to add
		 * Add two Rationals. Returns a Rational
		 * 
		 */
		
		int newNum = ((other.num * this.den) + (this.num * other.den));
		int newDen = other.den * this.den;
		Rational result = new Rational(newNum, newDen);
		return result.reduceToLowestForm(); 
				
	}
	


	public String toString(){
		if (den!=1){
		return Integer.toString(num) + '/' + Integer.toString(den);
		}
		else{
			return "" + num;
		}
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getDen() {
		return den;
	}


	public void setDen(int den) {
		this.den = den;
	}
	
}