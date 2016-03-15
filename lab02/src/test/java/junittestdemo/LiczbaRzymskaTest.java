package junittestdemo;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class LiczbaRzymskaTest {
	LiczbaRzymska lrz = new LiczbaRzymska(1);
	LiczbaRzymska lrz2 = new LiczbaRzymska(-1);
	
	//String lrzUjemna = lrz2.toString();
	String lrzDodatnia = lrz.toString();
	
	@Ignore
	@Test
	public void toStringuj(){
		System.out.println("liczbaDodatnia: " + lrzDodatnia);
		assertSame("I", lrzDodatnia);
		System.out.println("I: " + lrz);
	}
	
	@Test
	public void toStringuj2(){
		assertSame("Invalid Roman Number Value", lrz2.toString());
		System.out.println("Invalid Roman Number Value:" + lrz2 + " ?");
	}
	
}
