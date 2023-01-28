package Finalstatement;

public class Finalkeyword5 {
	int cube(final int a)      //final
	
	{
	int n= 5;
	System.out.println(n);
	n=n+2;          //cant be changed as n is final//value = 7
	
	return n*n*n;   // 7*7*7 = 343
	
	
	}
	
	

	public static void main(String[] args) {
		
		Finalkeyword5 b=new Finalkeyword5();
		System.out.println(b.cube(5));
		

	}

}
