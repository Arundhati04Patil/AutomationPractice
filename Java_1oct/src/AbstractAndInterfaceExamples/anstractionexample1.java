package AbstractAndInterfaceExamples;
//creating interface that has 4 methods
interface A11{
	void a(); //default,public,and abstract
	void b();
	void c();
	void d();
}

//creating abstract class that provide implementation of 'c' method of A11 Interface

abstract class B11 implements A11{
	//public abstract void a();      //inherited method of interface A11
	//public abstract void b();      //inherited method of interface A11
	//public abstract void d();      //inherited method of interface A11
	
	
	public void c()
	{
		System.out.println("I am c");
	}
	
	
	public void e()
	{
		System.out.println("I am e");
	}
	
	
}
//creating subclass of abstract class B11,now we need to provide the implementation of rest of the method
class M11 extends B11{
	public void a()
	{
		System.out.println("I am a");
	}
	
	
	public void b()
	{
		System.out.println("I am b");
		
	}
	public void d()
	{
		System.out.println("I am d");
	}
	
	
	
}

//creating a test class that calls the method of A interface

public class anstractionexample1 {

	public static void main(String[] args) {
		A11 a = new M11();
		a.a();
		a.b();
		a.c();
		a.d();
	

}}
