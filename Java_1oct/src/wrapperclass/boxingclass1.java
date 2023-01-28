package wrapperclass;

public class boxingclass1 {

	public static void main(String[] args) {
		
		char c1='A';
	
		Character charObj1=new Character(c1);// explicit boxing opration
		System.out.println(c1==charObj1);//
		Character charObj2=new Character('Z');//
		
		Character charObj3='H';//implicit boxing or auto boxing
		
		System.out.println("c1: "+c1);//
		System.out.println("charObj1: "+charObj1);
		System.out.println("charObj2: "+charObj2);
		System.out.println("charObj3: "+charObj3);
		
		boolean b=true;//
		Boolean bObj=new Boolean(b);//explicit boxing
		System.out.println(bObj==b);
	}
}