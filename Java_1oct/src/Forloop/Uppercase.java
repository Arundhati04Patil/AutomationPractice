package Forloop;

public class Uppercase {

	public static void main(String[] args) {
		char c;
		for(c='A';c<='Z';c++)
			System.out.println("    "+c);
		
		System.out.println("*********************************");
			
	      uppercase('A');
		}
		static void uppercase(char a) {

			for(a='A';a<='Z';a++)
				System.out.println("    "+a);
			
		

	}

}
