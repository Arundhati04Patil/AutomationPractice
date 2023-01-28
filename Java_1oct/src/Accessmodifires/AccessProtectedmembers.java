package Accessmodifires;

public class AccessProtectedmembers {

	public static void main(String[] args) {
		Protectedmembers p1 = new Protectedmembers();
		System.out.println("Accessing private members from another class within same package");
		System.out.println(p1.accnum);
		     p1.dislpayAccnum();
	}
	}


