package Superkeyword;

class Parent {
	int parentAge = 45;//glowble varible

	void home() {//method do not return anything
		System.out.println("This is parent's home");
	}
}

class Child extends Parent { //child class inherit parent class
	void display() {
//		let's access the parent class variable and method using super keyword
		System.out.println(super.parentAge);
		super.home();
//		super keyword is the reference variable for immediate parent class object
	}
}

public class superexample1 {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();
	}

}