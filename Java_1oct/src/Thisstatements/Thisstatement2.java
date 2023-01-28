package Thisstatements;
class A10
{
	A10(){
		
		System.out.println("hello Zero");
	}
	A10(double d){
		this(10);
		System.out.println("Hello double..." +d);
		
	}
	A10(int x){
		System.out.println("Hello int" +x);
	}
}



public class Thisstatement2 {

	public static void main(String[] args) {
		A10 a1= new A10();
		A10 a2= new A10(10);
		A10 a3= new A10(10.23);
		//or
		//A1 a1 = new A1();

	}

}
