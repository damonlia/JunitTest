package phonelistunitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class PhoneTest {
	private Repository r;

	@Test
	public void testAdd() {
		r= new Repository();
		int dlugoscPrzedDodaniem = r.getPhonesAll().size();
		
		Phone p = new Phone("Kasia");
		r.addP(p);
		
		int dlugoscPoDodaniu = r.getPhonesAll().size();
		assertEquals(dlugoscPoDodaniu, dlugoscPrzedDodaniem + 1);
}
}