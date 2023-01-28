package Forloop;

public class Naturalno {
	
	static int naturalnumbersum(int n)   //static method return the sum of natural no
	{
		int sum = 0;
		for(int i =1; i<=n;i++)
			sum = sum+i;
		return sum;
	}
		

	public static void main(String[] args) {
		int i, num =10, sum = 0;
		for(i =1; i<=num; ++i)
		{
			sum=sum+i;
		}
			System.out.println("Sum of first 10 natural number is="+sum);
			System.out.println("**********************************************");
			
	
			{
          int n = 50;   //calling method and print the sum
          System.out.println("Sum of first 50 natural number is="+naturalnumbersum(n));
          
	}

}}
