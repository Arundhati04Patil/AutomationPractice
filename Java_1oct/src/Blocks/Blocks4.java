package Blocks;

public class Blocks4 {
	Blocks4(){
		System.out.println("Zero-param cons.....");
	}
	
	//non-static block or IIB
	{
		System.out.println("running non-static block1 of class blocks4...");
	}

	public static void main(String[] args) {
		System.out.println("main() starts");
		Blocks4 b1 = new Blocks4();
		System.out.println("...........................");
		Blocks4 b2 = new Blocks4();
		System.out.println("main() ends");

	}
	{
		System.out.println("Running non-ststic-block2 of class Blocks4....");
	}

}