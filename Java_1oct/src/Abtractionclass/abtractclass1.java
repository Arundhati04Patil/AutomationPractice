package Abtractionclass;

abstract class bike1{
	abstract void run();
	void speed(int spd) {
		System.out.print("bike speed:" +spd);
	}
}


class honda4 extends bike1{
	void run() {
		System.out.println("running safely");
	}
	void speed(int spd) {
		System.out.println("Honda4 speed:"+spd);
		super.speed(120);	
		}
	
	
	void colour() {
		System.out.println("Honda4 colour is blue:");
	}
}


public class abtractclass1 {

	public static void main(String[] args) {
	honda4 obj=new honda4();
	obj.run();
	obj.speed(60);
	obj.colour();
	//bike1 b1= new Bike1()
	
	bike1 b2= new honda4();
	b2.run();
	b2.speed(20);
	//b2.color();
	
	}

}
