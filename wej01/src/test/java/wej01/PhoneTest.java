package wej01;

import static org.junit.Assert.*;

import java.util.ArrayList;

import static org.easymock.EasyMock.*;

import org.easymock.EasyMockRule;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

public class PhoneTest {
	@Rule
	public EasyMockRule mocks = new EasyMockRule(this);
	
	@Mock
	private IMyList mock;
	
	@TestSubject
	private Repository r =  new Repository(mock);
	
	
	@Test
	public void addTest(){
		Phone p = new Phone("HTC");
		mock.add(p);
		expectLastCall();
		expect(mock.size()).andReturn(1);
		expect(mock.getPhonesAll()).andReturn(mock);
		replay(mock);
		r.add(p);
		assertEquals(1, r.getPhonesAll().size());
	}
	
	
//	//private Repository r;
//	private Phone pho;
//	@Before
//	public void startWith(){
//		pho = new Phone("HTC");
////		r= new Repository(mock);
//		r.addP(pho);
//		
//	}
//	@Test
//	public void testAdd() {
//		int dlugoscPrzedDodaniem = r.getPhonesAll().size();
//		
//		Phone p = new Phone("LG");
//		r.addP(p);
//		
//		int dlugoscPoDodaniu = r.getPhonesAll().size();
//		assertEquals(dlugoscPoDodaniu, dlugoscPrzedDodaniem + 1);
//}
//	
//	@Test
//	public void get(){
//		
//		Phone phoneWithName = new Phone();
//		phoneWithName = r.getPhoneByName("HTC"); 
//		
//		assertSame(pho,phoneWithName);
//	}
//	
//	@Test 
//	public void getAll(){
//		ArrayList<Phone> phones2 = new ArrayList<Phone>();
//		phones2.add(pho);
//		assertEquals(phones2, r.getPhonesAll());
//	}
//	
//	@Test
//	public void testRemove(){
//		int dlugoscPrzedUsunieciem = r.getPhonesAll().size();
//	
//		r.removeP(pho);
//		
//		int dlugoscPoUsunieciu = r.getPhonesAll().size();
//		assertEquals(dlugoscPoUsunieciu, dlugoscPrzedUsunieciem-1);
//	}
}
