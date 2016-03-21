package wej01;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class PhoneTest {
	private Repository r;
	private Phone pho;
	@Before
	public void startWith(){
		pho = new Phone("HTC2");
		r= new Repository();
		r.addP(pho);
		
	}
	@Test
	public void testAdd() {
		int dlugoscPrzedDodaniem = r.getPhonesAll().size();
		
		Phone p = new Phone("LG");
		r.addP(p);
		
		int dlugoscPoDodaniu = r.getPhonesAll().size();
		assertEquals(dlugoscPoDodaniu, dlugoscPrzedDodaniem + 1);
}
	
	@Test
	public void get(){
		
		Phone phonesFromAll = new Phone();
		phonesFromAll = r.getPhoneName("HTC2"); 
		
		assertSame(pho,phonesFromAll);
	}
	
	@Test 
	public void getAll(){
		ArrayList<Phone> phones2 = new ArrayList<Phone>();
		phones2.add(pho);
		assertEquals(phones2, r.getPhonesAll());
	}
}
