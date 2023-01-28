package Superkeyword;

class Vehicles {  // class Vehicles extends Object {  // ==> Vehicles class inherits Object class directly
	Vehicles() {
		System.out.println("zero parameter parent class constructor");
	}

	Vehicles(int NumberOfWheels) {
		System.out.println("int parameter parent class constructor");
	}
}

class Car extends Object{  // ==> Car class inherits Object class directly
	Car() {
		System.out.println("zero parameter child class constructor");
	}

	Car(double fuleTankCapacity) {
		System.out.println("double parameter child class constructor");
	}
}

public class hashcosemethodpackage javaSuperKeyword;

class Vehicles {  // class Vehicles extends Object {  // ==> Vehicles class inherits Object class directly
	Vehicles() {
		System.out.println("zero parameter parent class constructor");
	}

	Vehicles(int NumberOfWheels) {
		System.out.println("int parameter parent class constructor");
	}
}

class Car extends Object{  // ==> Car class inherits Object class directly
	Car() {
		System.out.println("zero parameter child class constructor");
	}

	Car(double fuleTankCapacity) {
		System.out.println("double parameter child class constructor");
	}
}

public class SuperStatement1 {
	public void main(String[] args) {
		Vehicles obj = new Vehicles();
		obj.hashCode(); // here hashCode() gets inherited from Object class
		
		Car obj1 = new Car();
		obj1.hashCode(); // here hashCode() gets inherited from Object class
	}

} 

	public static void main(String[] args) {
		Vehicles obj = new Vehicles();
		obj.hashCode(); // here hashCode() gets inherited from Object class
		
		Car obj1 = new Car();
		obj1.hashCode(); // here hashCode() gets inherited from Object class
	}

}