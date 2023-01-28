package Finalstatement;

public class NonStaticGobalVariable1 {
	//int empid= 25;
	
	
	public static void main(String[] args) {
		int age = 30;
		System.out.println("I am Local age: "+age);
		
		NonStaticGobalVariable1 b1 = new NonStaticGobalVariable1();
		  b1.display();	  
	}
	void display()
	{
		int empid =45;
		System.out.println("I am local empid:"+empid);
	}
	

}
