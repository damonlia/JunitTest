package wej01;

import java.util.ArrayList;
import java.util.List;

public class Repository {
	List<Phone> phonesAll = new ArrayList<Phone>();
	private IMyList container;
	
	public Repository(IMyList container){
		super();
		this.container = container;
	}

	public void add(Phone p){
		container.add(p);
	}
	public void remove(Phone p){
		container.remove(p);
	}
	
	public IMyList getPhonesAll() {
		return container.getPhonesAll();
	}
//	public void setPhonesAll(ArrayList<Phone> phonesAll) {
//		this.phonesAll = phonesAll;
//	}
	
	public Phone getPhoneByName(String name) {
		for(Phone p: phonesAll)
		{
			if(p.getName()== name)
				return  p;
		}
		return container.getPhoneByName(name);
	}
}
