package AbstractAndInterfaceExamples;
//abstract class
abstract class animal{
	//abstract method(does not ha ea body)
	public abstract void animalsound();
	//Regular method
	public void sleep() {
		System.out.println("zzzzzz");
		
	}
	
}
//subclass (inherit from animal)
class pig extends animal{
	public void animalsound() {
		//the body of animalsound provided here
		System.out.println("the pig says weee");
	}
}
//subclass (inherit from animal)
class Dog extends animal{
	public void animalsound() {
		//the body of animalsound provided here
		System.out.println("the dog says buuuuuuw");
	}
}



public class abstractionexample2 {

	public static void main(String[] args) {
		pig mypig = new pig();   //create a pig object
		mypig.animalsound();
		mypig.sleep();
		Dog d1= new Dog();
		d1.animalsound();
		d1.sleep();
		
	}

}
