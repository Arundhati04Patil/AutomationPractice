package Superkeyword;

class Mobile {
	int ram = 4;//non-static glowble variable

	public String displayType() {
		return "Touch Screen type display";
	}
}

class Samsung extends Mobile {
	int ram = 6;  //local variable

	public String displayType() {
		return "Amoled touch screen full hd display";
	}

	public void display() {
//		here parent and child class are having variables and methods with same name
//		now to differentiate between them we can use super keyword
		super.ram = 8;
		System.out.println("Mobile RAM : " + super.ram);
		System.out.println("Samsung RAM : " + ram);
		System.out.println("Display type of Mobile : " + super.displayType());
		System.out.println("Display type of Samsung : " + displayType());
	}
}

public class superexample2 {

	public static void main(String[] args) {
		Samsung obj = new Samsung();
		obj.display();
	}

}