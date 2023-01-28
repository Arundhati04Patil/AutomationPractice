package Castingexamples;
class A{
	void test1() {
		System.out.println("Running test 1()");
		
	}
}
class B extends A{
	void test2() {
		System.out.println("Running test 2()");
	}
}
class C extends B{
	void test3() {
		System.out.println("Running test 3()");
	}
}


public class explicitUpcasting {

	public static void main(String[] args) {
		System.out.println("Program starts");
		C c1 = new C();
		B b1 = (B)c1;      // (B)new c();  explicit up-casting
		b1.test1();
		b1.test2();
		//b1.test3()
		System.out.println("Programs ends");	

	}

}
