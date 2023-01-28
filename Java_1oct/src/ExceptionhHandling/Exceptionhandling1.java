package ExceptionhHandling;
public class Exceptionhandling1 {
	public static void main(String[] args) {
		System.out.println("program starts from here...");
		//1. abnormal statements
		int i = 10;
		int j = i/0;//ArithmeticException
		System.out.println("res: "+j);
		System.out.println("Programs ends here...");
	}
}