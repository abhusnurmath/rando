package cit590;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RationalTest {
	// Declare instance variables here
	Rational half, quarter, equivalentToHalf, threequarter;

	@Before
	public void setUp() throws Exception {
		// Initialize instance variables here
		half = new Rational(1, 2);
		quarter = new Rational(1, 4);
		threequarter = new Rational (3,4);
		equivalentToHalf = new Rational(32,64);
	}
	
	@Test
	public void testAdd() {
//		assertEquals(half.getDenominator(), quarter.add(quarter).getDenominator());
//		assertEquals(threequarter.getNumerator(), quarter.add(half).getNumerator());
//		Rational f1 = new Rational(1,1);
//		Rational f2 = new Rational(0,1);
//		assertEquals(1, f1.add(f2).getNumerator());
		
		/* making an assertion now with the new equals method */
		assertEquals(half, quarter.add(quarter));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(quarter.getDenominator(), half.multiply(half).getDenominator());
		assertEquals(8, half.multiply(threequarter).getDenominator());
		assertEquals(3, half.multiply(threequarter).getNumerator());
	}
	
	@Test
	public void testReduceToLowestTerms(){
		assertEquals(equivalentToHalf.reduceToLowestTerms().getDenominator(), half.getDenominator());
		assertEquals(equivalentToHalf.reduceToLowestTerms().getNumerator(), half.getNumerator());
	}
}

