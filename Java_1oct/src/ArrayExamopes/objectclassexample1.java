package ArrayExamopes;

class print extends Object{
	int a =10;
	//@override
	public int hashcode() {
		return 101;
	}
	//@override
	public String toString() {
		return "I am right class tostring";
		
	}
	//@override
	public boolean equals(Object Obj) {   //object obj= p2=new print();//auto upcasting
		print p = (print)Obj;   // explicit down casting
		return (this.a==p.a);   //10==10
	}
}



public class objectclassexample1 {
	static int last_roll = 100;
	int roll_no;
	objectclassexample1(){//constructer
		roll_no = last_roll;
		last_roll++;
		
	}

	public static void main(String[] args) {
		
		objectclassexample1 s1= new objectclassexample1();
		System.out.println("s1:toString of objectclass4:" +s1);
		System.out.println("s2:hashcode of objectclass4:" +s1.hashCode());
		
		
		
		
		objectclassexample1 s2= new objectclassexample1();
		System.out.println("s2:toString of objectclass4:" +s2);
		System.out.println("s2:hashcode of objectclass4:" +s2.hashCode());
		System.out.println("s1&s2 compare:" +s1.equals(s2));
		
	
		objectclassexample1 s3= s2;
		System.out.println("s3&s2 compare:" +s3.equals(s2));
		print p1= new print();
		System.out.println("toString of print :" +p1);
		System.out.println("hashcode of print :" +p1.hashcode());
		
		print p2= new print();
		System.out.println("toString of print :" +p2);
		System.out.println("hashcode of print :" +p2.hashcode());
		
		
		System.out.println("comparing Print class object p1 & P2 with overriden equals():"+p1.equals(p2));
			
	}

}

//compare two values
//d1.equals(d2)-----> compare two object based on there address.
