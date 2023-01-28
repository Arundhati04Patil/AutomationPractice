package Forloop;

public class Reversenumber {

	public static void main(String[] args) {
		int num = 12345, reverse =0;
		for(;num!=0;num=num/10)
		{
			int remainder= num%10;
			reverse= reverse*10+remainder;
		}
		System.out.println("The reverse of the given number is:"+reverse);

	}

}
