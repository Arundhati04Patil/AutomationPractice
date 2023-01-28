package Castingexamples;
class sample1
{
	double x =10;
	double test1 ()
	{
		System.out.println("Running test1");
		return 4;  //
		
	}
}
public class primitiveCasting {

	public static void main(String[] args) {
		System.out.println("Program starts");
		sample1 s= new sample1();
		int res=(int)s.test1();
		System.out.println("return value = "+res);
		
		System.out.println("Program ends");

	}

}
