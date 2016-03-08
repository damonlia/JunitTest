package junittestdemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class CalculatorTest {
	Calculator c = new Calculator();
	 
	 @Test
		public void adding(){
			assertEquals(5,c.add(2, 3));
			System.out.println("Adding:" + c);
		}
	 
	 @Test
		public void multi(){
			assertEquals(9,c.mul(3, 3));
			System.out.println("mul:" + c);
		}
}
