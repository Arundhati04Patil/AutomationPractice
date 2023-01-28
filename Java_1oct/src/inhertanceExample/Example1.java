package inhertanceExample;

//public class Example1 {
	
	class A{
		static int a= 10;
		int b =20;
		double c = 13.45;
	}
	
	class B{
		 static int x =30;
		 int y = 40;
		 double Z= 53.45;
		 
	}
	
	class C {
		static int p =50;
		 int q = 41;
		 double r= 85.65;
		 
		
	
//public static class Example1 {

	public static void main(String[] args) {
		//access static member class A members****************
		
		System.out.println("class A static variable:"+A.a);
		
		
		
		//access static member class B members****************
		
				System.out.println("class B static variable:"+B.x);
				
				
				//access static member class c members****************
				
				System.out.println("class C static variable:"+C.p);
				
				
				
				//access non-static member class A members****************
				         A a1=new A();
				         System.out.println("class A non-static variable b:"+a1.b);
				         
				         System.out.println("class A non-static variable c:"+a1.c);
				         
				         //***********Access non-static member class B members*******************
				         
				         B b1=new B();
                         System.out.println("class B non-static variable b:"+b1.y);
				         
				         System.out.println("class B non-static variable c:"+b1.Z);
                      //********************Access non-static member class C member*********************
				         C c1=new C();
                         System.out.println("class C non-static variable b:"+c1.q);
				         
				         System.out.println("class C non-static variable c:"+c1.r);
				         
				         
							
							

				
				
				
				
		

	}

}
