package Forloop;

public class FactorsofNegativeno {

	public static void main(String[] args) {
		int number = -60;
		System.out.println("factors of" +number);
		for(int i =number;i<=Math.abs(number);++i)
		{
			if(i == 0)
			{
				continue;
				
			}
			else
			{
				if(number%i==0)
				{
					System.out.println("   "+i);
				}
			}
		}

	}

}
