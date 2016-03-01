package zad01;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

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
		assertEquals(false,c.greater(2, 3));
		System.out.println("greater:" + c);
	}
 
 @Ignore
 @Test
	public void divZero(){
		
		System.out.println("Adding:" + c);
	}
}
