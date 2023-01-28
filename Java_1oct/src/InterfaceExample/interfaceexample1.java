package InterfaceExample;
interface Bank{
	float rateofinterest();   //by default.........public abstract
	
}
 class SBI1 implements Bank{
	 public float rateofinterest() {
		 return 9.15f;
	 }
 }
 
 class PNB1 implements Bank{
	 public float rateofinterest() {
		 return 8.5f;
	 }
	 
 }

 class interfaceexample1 {

	public static void main(String[] args) {
	SBI1 s1=new SBI1();
	System.out.println("SBI ROI:"+s1.rateofinterest());
	PNB1 p1=new PNB1();
	System.out.println("PNB ROI:"+p1.rateofinterest());
	
	Bank b=new PNB1();
	System.out.println(" ROI:"+b.rateofinterest());
	
	}

}
