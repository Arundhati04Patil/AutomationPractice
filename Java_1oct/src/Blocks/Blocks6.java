package Blocks;

public class Blocks6 {
	
	//static block or SIB
	static
	{
		System.out.println("running static-block-1 of class Blocks2....");
	}
	//non-static block or IIB
	{
		System.out.println("running non-static block1 of class blocks4...");
	}

	public static void main(String[] args) {
		System.out.println("main() starts");
		Blocks6 b1 = new Blocks6();
		System.out.println("...........................");
		Blocks6 b2 = new Blocks6();
		System.out.println("main() ends");

	}
	static
	{
		System.out.println("running static-block-2 of class Blocks2....");
	}
	{
		System.out.println("running static-block-2 of class Blocks4....");
	}
	
}