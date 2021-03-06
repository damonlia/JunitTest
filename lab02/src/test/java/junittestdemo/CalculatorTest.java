package junittestdemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

		}
	 
	 @Test
		public void divDouble(){
		 assertEquals(1.88235294, c.divDouble(3.2, 1.7), 1e-8);
		 System.out.println("divDouble:" + c);
		}
}
