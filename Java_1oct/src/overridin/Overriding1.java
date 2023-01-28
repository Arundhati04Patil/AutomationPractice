package overridin;
class Animal1{
	 public void move() {
		 System.out.println("Animals can move");
	 }
}
class Dog extends Animal1 {
	public void move() {
		System.out.println("Gogs can walk and run");
	}
	public void bark() {
		System.out.println("Dogs can bark");
	}
}

public class Overriding1 {

	public static void main(String[] args) {
		
		Animal1 a =new Animal1(); // Animal reference and object
		a.move();
		Dog b = new Dog();  //Animal reference and object
		a.move();
		b.move();  //runs the method in Dog class
		b.bark(); // runs the method in Dog class 
		  System.out .println("*********************************************");
		    
		  Animal1 a1 = new Animal1();  // you will get dog class move(), bark(), 
		  
		  a1.move();  //Dogs can walk and run 
		  
		  //a1.bark();    a1 complie time error since b is reference type animal doesnot
		  
	}



		  
		
		

	}


