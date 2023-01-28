package Castingexamples;

class Parent{
	//Function
	void show() {
		//print message for this class
		System.out.println("parent show method is called");
	}
	void callme() {
		System.out.println("Parent callme method is called");
	}
}

class child extends Parent {
	void readme() {
		System.out.println("Child readme method is called");
	}
	
}

public class DerivedCasting1 {
	//Main driver method 
	public static void main(String[] args) {
		System.out.println("******************Ref and Object both of child************");
		//object of child class and reference of child class
		  child c1 = new child();
		  c1.readme();
		  c1.callme();
		  c1.show();
System.out.println("************Ref and Object both of Parent******************");
  //Object of parent class and reference of parent class
Parent P1 = new Parent();
P1.show();
P1.callme();
 System.out.println("**********************Ref parent and object*********************");
 //creating a parent class object but referencing it to a child class
      Parent obj = new child();  //auto-up /implicit up casting
      obj.show();
      obj.callme();
      //obj.readme();
      
      System.out.println("********************Ref and object both are of child***************");
      child c2 =new child();
      c2.readme();
      c2.callme();
      c2.show();
      System.out.println("**************************Ref parent and object of child******************");
      Parent P2= (Parent)c2;   //expilcit up casting 
      //or Parent P2 = c2; //implicit up casting
      //Parent p2 = (parent)new child();   //explicit up casting
      
      P2.show();
      P2.callme();
      //P2.readme();


		

	}

}
