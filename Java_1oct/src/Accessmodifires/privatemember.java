package Accessmodifires;

public class privatemember {
	
	private int accnum=12345;
	private void displayAccnum() {
		System.out.println("Account number:"+accnum);	
	}

	public static void main(String[] args) {
		privatemember p1 =new privatemember();
        System.out.println(p1.accnum);
        p1.displayAccnum();
	}

}


 class Accessprivatemember2 {
	

	public static void main(String[] args) {
		privatemember p1 =new privatemember();
		//System.out.println("Account number:"+accnum);
		System.out.println(p1.accnum);
        p1.displayAccnum();
}}
