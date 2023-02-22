package basicTestng;

import org.testng.annotations.Test;

public class sample1 {

  int age=25;
	void display() {
		System.out.println("I am display...");
	}
@Test
public void testCase1() {
	  System.out.println("I am test case1....");
	  System.out.println("age: "+age);
	  display();
}
}
