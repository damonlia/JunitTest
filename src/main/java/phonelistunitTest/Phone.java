package phonelistunitTest;

import java.util.ArrayList;

public class Phone {
	ArrayList<Phone> phones = new ArrayList<Phone>();
	public String name;	
	public Phone(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
