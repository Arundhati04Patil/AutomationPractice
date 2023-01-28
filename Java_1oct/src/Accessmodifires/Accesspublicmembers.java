package Accessmodifires;

public class Accesspublicmembers {

	public static void main(String[] args) {
		publicmembers p1 = new publicmembers();
		System.out.println("Accessing private members from another class within same package");
		System.out.println(p1.accnum);
		     p1.dislpayAccnum();
	}

}
