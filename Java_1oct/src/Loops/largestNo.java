package Loops;

public class largestNo {

	public static void main(String[] args) {
	    int num1=12;
	    int num2=18;
	    int num3=56;
	
	
	if((num1>num2) && (num1>num3))
	{
		System.out.println("Largest no is"+num1);
		System.out.println("**********************************");
	}
	if((num2>num3) && (num2>num1))
	{
		System.out.println("Largest no is"+num2);
		System.out.println("********************************************");
		}
	if((num3>num1) && (num3>num2))
			
	{
		System.out.println("Largest no is"+num3);
		System.out.println("******************************");
	}
		
		findlargestnum(2,8,6);
		findlargestnum(29,78,66);
		findlargestnum(25,88,16);
			
	}
	static void findlargestnum(int num1,int num2,int num3) {
		
		if((num1>num2) && (num1>num3))
		{
			System.out.println("Largest no is"+num1);
			System.out.println("**********************************");
		}
		if((num2>num3) && (num2>num1))
		{
			System.out.println("Largest no is"+num2);
			System.out.println("********************************************");
			}
		if((num3>num1) && (num3>num2))
				
		{
			System.out.println("Largest no is"+num3);
			System.out.println("******************************");
		}
		
	}
}

	


