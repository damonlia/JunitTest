package wej01;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

public class PhoneTest {
	private Repository r;
	Phone pho = new Phone();
	@Test
	public void testAdd() {
		r= new Repository();
		int dlugoscPrzedDodaniem = r.getPhonesAll().size();
		
		Phone p = new Phone("Kasia");
		r.addP(p);
		
		int dlugoscPoDodaniu = r.getPhonesAll().size();
		assertEquals(dlugoscPoDodaniu, dlugoscPrzedDodaniem + 1);
}
	
	@Test
	public void get(){
		r= new Repository();
		pho.setName("HTC2");
		r.addP(pho);
		Phone phonesFromAll = new Phone();
		phonesFromAll = r.getPhoneName("HTC2"); 
		
		assertSame(pho,phonesFromAll);
	}
}
