package Accessmodifires;

public class Accessprivatemembers {

	public static void main(String[] args) {
		privatemembers p1 = new privatemembers();
		System.out.println("Accessing private members from another class within same package");
		System.out.println(p1.accnum);
		     p1.dislpayAccnum();
	}

}
