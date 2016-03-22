package wej01;

import java.util.ArrayList;

public interface IRepository {
	public void addP(Phone p);
	public void setPhonesAll(ArrayList<Phone> phonesAll);
	public Phone getPhoneName(String name);
	
}
