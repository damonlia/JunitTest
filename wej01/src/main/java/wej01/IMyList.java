package wej01;

import java.util.ArrayList;
import java.util.List;

public interface IMyList {
	public void add(Phone p);
	public void setPhonesAll(ArrayList<Phone> phonesAll);
	IMyList getPhonesAll();
	public Phone getPhoneByName(String name);
	public void remove(Phone p);
	int size();
}
