package zad01;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {
 Calculator c = new Calculator();
 
 @Test
	public void adding(){
		assertEquals(5,c.add(2, 3));
		System.out.println("Adding:" + c);
	}
 
 @Test
	public void substr(){
		assertEquals(1,c.sub(5, 4));
		System.out.println("Sub:" + c);
	}
 
 @Test
	public void multi(){
		assertEquals(9,c.multi(3, 3));
		System.out.println("mul:" + c);
	}
 
 @Test
	public void div(){
		assertEquals(1,c.div(2, 2));
		System.out.println("div:" + c);
	}
 
 @Test
	public void great(){
		assertTrue(c.greater(3, 2));
		System.out.println("greater:" + c);
	}
 
 @Rule
 public ExpectedException thrown= ExpectedException.none();
 
 @Test
	public void divZero(){
	 System.out.println("przed");
	 thrown.expect(ArithmeticException.class);
	 	c.div(1, 0);
	 	System.out.println("po");
		System.out.println("wywalono wyj¹tek");
	}

}
