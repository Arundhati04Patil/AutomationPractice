package pyrimadprogram;

public class halfpyramid1 {

	private static final char A = 0;

	//private static final char  = 0;

	public static void main(String[] args) {
		for (int i =0; i<5; i++) {
			for(int j= 0;j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		for (int i =0; i<=5; i++) {
			for(int j=1;j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

		
		
      // char A;
		for (char i ='A'; i<='E'; i++) {
			for(char j=i; j<=i; j++) {
				System.out.print(j+"  ");
			}
			System.out.println();
		}

		
		
		for (int i=1; i<=5;i++)
		{
			int counter = 1;
			while(i>=counter)
			{
				System.out.print(i+" ");
				counter++;
			}
			System.out.println("");
		}
		
		//Reverse Pyramid
		char last = 'E', alphabet = 'A';
		for (int i=1; i<=(last - 'A'+ 1);i++) {
			for( int j=1; j<=i;j++) {
				System.out.print(alphabet+" ");
			}
			alphabet++;
			System.out.println();
		}
		

	}
	
	
	

}
   
