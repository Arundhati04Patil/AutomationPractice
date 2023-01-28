package Collection;
import java.util.ArrayList;
import java.util.HashSet;
public class uniqueElementArray {

	public static void main(String[] args) {
		ArrayList<String> Array1 = new ArrayList<String>();
		
		Array1.add("a");
		Array1.add("b");
		Array1.add("c");
		Array1.add("d");
		Array1.add("a");
		Array1.add("b");
		Array1.add("e");
		Array1.add("c");
		Array1.add("f");
		Array1.add("a");
	
		System.out.println("Original Array list Is: "+Array1);
		
		HashSet<String> hset = new HashSet<String>(Array1);
        
		System.out.println("ArrayList unique element is:"+hset);
	}

}
