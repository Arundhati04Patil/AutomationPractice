package Thisstatements;
class student102
{
	int rollno;
	float fee;
	student102(int rollno)
	{
		this.rollno = rollno;	
	}
	student102(int rollno, float fee)
	{
		this(rollno);   //C.T. error
		this.fee = fee;	
	}
	void display()
	{
		System.out.println(rollno + " " +fee);
	}
}

public class Thisstatements4 {

	public static void main(String[] args) {
		student102 s1 = new student102(111);
		student102 s2 = new student102(112,6000f);
		s1.display();
		s2.display();

	}

}		
