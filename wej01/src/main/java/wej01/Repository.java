package wej01;

import java.util.ArrayList;

public class Repository implements IRepository{
	ArrayList<Phone> phonesAll = new ArrayList<Phone>();
	public void addP(Phone p){
		phonesAll.add(p);
	}
	public ArrayList<Phone> getPhonesAll() {
		return phonesAll;
	}
	public void setPhonesAll(ArrayList<Phone> phonesAll) {
		this.phonesAll = phonesAll;
	}
	
	public Phone getPhoneName(String name) {
		for(Phone p: phonesAll)
		{
			if(p.getName()== name)
				return  p;
		}
		return null;
	}
}
