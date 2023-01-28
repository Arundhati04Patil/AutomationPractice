package Castingexamples;
class pune{
	void Deccan() {
		System.out.println("You are in Deccan");
		
	}
}
class Mumbai extends pune {
	    void kurla() {
	    	 System.out.println("You are in Kurla");
	    	 
	    }
	
}

public class upcastingExample extends Mumbai {
	void mycity() {
		System.out.println("You in city");
		
	}

	public static void main(String[] args) {
		upcastingExample u1 = new upcastingExample();
		Mumbai m1 = new upcastingExample();
		Mumbai m2 = u1;
		pune p1 = new upcastingExample();
		pune p2 = u1;
		Mumbai m3=(Mumbai)new upcastingExample();
		Mumbai m4=(Mumbai)u1;
		pune p3 =(pune)new upcastingExample();
		pune p4=(pune)u1;
		//Mumbai m3= (Mumbai)new upcastingExample();
		//Mumbai m4 = (Mumbai)u1;
		//pune p3 = (pune)new upcastingExample();
		//pune p4 = (pune)u1;
		
		pune p5 = new Mumbai();
		
		pune p6= (pune)new Mumbai();
			

	}

}
