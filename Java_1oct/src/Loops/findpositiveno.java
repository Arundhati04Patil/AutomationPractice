package Loops;

public class findpositiveno {

	public static void main(String[] args) {
	int num1=-76;    //finding negative number
	{
		if(num1>0)
		{
			System.out.println("number is positive"+num1);
			System.out.println("**********************************");
		}
		else
		{
			System.out.println("Number is negative");
			System.out.println("******************************");
		}
		
		findpositivenum(45);
		findpositivenum(-35);
		findpositivenum(0);
		
	}}
	static void findpositivenum(int num)
	{
		if(num>0)
		{
			System.out.println("number is positive"+num);
			System.out.println("**********************************");
		}
		else
		{
			System.out.println("Number is negative");
			System.out.println("******************************");
		}
	}
	}
	
