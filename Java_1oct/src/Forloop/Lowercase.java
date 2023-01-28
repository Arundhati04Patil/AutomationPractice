package Forloop;

public class Lowercase {

	public static void main(String[] args) {
	char c;
	for(c='a';c<='z';c++)
		System.out.println("    "+c);
	
	System.out.println("*********************************");
		
      lowercase('a');
	}
	static void lowercase(char A) {

		for(A='a';A<='z';A++)
			System.out.println("    "+A);
		
	}
}
