package Finalstatement;

 class student002{
	int rollno;
	float fee;
	student002(int rollno, float fee)
	{
		System.out.println("Local variable:"+rollno);
		System.out.println("Local variable:"+fee);
		System.out.println("Global variable:"+this.rollno);
		System.out.println("Global variable:"+this.fee);
		
		//global variable= local variable
		this.rollno = rollno;
		this.fee = fee;
		System.out.println("Local variable:"+rollno);
		System.out.println("Local variable:"+fee);
		System.out.println("Global variable:"+this.rollno);
		System.out.println("Global variable:"+this.fee);
	}
	
	
	void dislpay()
	{
		System.out.println(rollno + " "+fee);
		
	}
 }
     class ThisKeyword2{
    	 
     
	public static void main(String[] args) {
		student002 s1 =new student002(111,5000f);
		s1.dislpay();  //
		student002 s2 =new student002(112,6000f);
		s2.dislpay();	

}}
//this keyword is predefined keyword also knownas intance of current class
    // *ideally used to differentiate local and global variable(NSGV)when they are having same name
     //*this should be used only for non-static member and inside non-static