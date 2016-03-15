package junittestdemo;

public class LiczbaRzymska {
	private int lrzymska;
	
	public LiczbaRzymska(int lrzymska){
		this.lrzymska = lrzymska;
	}
	
	@Override
	public String toString(){
		 if (lrzymska < 1 || lrzymska > 3999)
		        return "Invalid Roman Number Value";
		    String s = "";
		    while (lrzymska >= 1000) {
		        s += "M";
		        lrzymska -= 1000;        }
		    while (lrzymska >= 900) {
		        s += "CM";
		        lrzymska -= 900;
		    }
		    while (lrzymska >= 500) {
		        s += "D";
		        lrzymska -= 500;
		    }
		    while (lrzymska >= 400) {
		        s += "CD";
		        lrzymska -= 400;
		    }
		    while (lrzymska >= 100) {
		        s += "C";
		        lrzymska -= 100;
		    }
		    while (lrzymska >= 90) {
		        s += "XC";
		        lrzymska -= 90;
		    }
		    while (lrzymska >= 50) {
		        s += "L";
		        lrzymska -= 50;
		    }
		    while (lrzymska >= 40) {
		        s += "XL";
		        lrzymska -= 40;
		    }
		    while (lrzymska >= 10) {
		        s += "X";
		        lrzymska -= 10;
		    }
		    while (lrzymska >= 9) {
		        s += "IX";
		        lrzymska -= 9;
		    }
		    while (lrzymska >= 5) {
		        s += "V";
		        lrzymska -= 5;
		    }
		    while (lrzymska >= 4) {
		        s += "IV";
		        lrzymska -= 4;
		    }
		    while (lrzymska >= 1) {
		        s += "I";
		        lrzymska -= 1;
		    }    
		    return s;
	}
}
