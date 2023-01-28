package WhileLoop;

public class CountnoOfDigit {

	public static void main(String[] args) {
	int count = 0,num=12345;
	while(num!=0)
	{
		num/=10;
		++count;
	}
	System.out.println("Number of digit:"+count);

	}

}
