package phonelistunitTest;

import java.awt.List;
import java.util.ArrayList;

public class Repository {
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


}
