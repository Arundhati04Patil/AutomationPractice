package Blocks;

public class Blocks3 {
	Blocks3(){
		System.out.println("Zero-param");
	}
	Blocks3(int i)
	{
		System.out.println("int-param");
	}
	//non-static block or IIB
	{
		System.out.println("running non-static block1 of class blocks3...");
	}

	public static void main(String[] args) {
		System.out.println("main() starts");
		Blocks3 b1 = new Blocks3();
		System.out.println("...........................");
		Blocks3 b2 = new Blocks3(10);
		System.out.println("main() ends");

	}

}