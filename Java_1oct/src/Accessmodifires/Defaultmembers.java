package Accessmodifires;

public class Defaultmembers {
	  int accnum=12345;
	  void displayAccNum() {
		  System.out.println("Account Number:"+accnum);
		  
	  }

	public static void main(String[] args) {
		Defaultmembers p1 = new Defaultmembers();
		System.out.println(p1.accnum);
		p1.displayAccNum();

	}

}


 class AccessDefaultmembers {
	  //int accnum=12345;
	  //void displayAccNum() {
		//  System.out.println("Account Number:"+accnum);
		  
	//  }

	public static void main(String[] args) {
		Defaultmembers p1 = new Defaultmembers();
		System.out.println("Accessing default member from child class");
		System.out.println(p1.accnum);
		p1.displayAccNum();

	}

}
 
 
 // default member will be having visibility up to package level