package Finalstatement;

 class student {
	int rollno;
	float fee;
	student(int rollno, float fee)
	{
		rollno= rollno;
		fee = fee;
	}
	
	
	void dislpay()
	{
		System.out.println(rollno + " "+fee);
		
	}
 }
	
     class ThisKeyword1{
    	 
     
	public static void main(String[] args) {
		student s1 =new student(111,5000f);
		s1.dislpay();  //
		student s2 =new student(112,6000f);
		s2.dislpay();

}}
