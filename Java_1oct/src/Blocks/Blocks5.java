package Blocks;

public class Blocks5 {
	
	//static block or SIB
	static
	{
		System.out.println("running static-block-1 of class5....");
	}
	//non-static block or IIB
	{
		System.out.println("running non-static block1 of class blocks5...");
	}

	public static void main(String[] args) {
		System.out.println("main() starts");
		Blocks5 b1 = new Blocks5();
		System.out.println("...........................");
		Blocks5 b2 = new Blocks5();
		System.out.println("main() ends");

	}
	
}