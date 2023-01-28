package Collection;

//import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class sortedList {

	public static void main(String[] args) {
		ArrayList<String> sList = new ArrayList<String>();  
		sList.add("m");  
		sList.add("k");  
		sList.add("a");  
		sList.add("p");  
		sList.add("d");  
		Collections.sort(sList);    //sorts array list  
		for(String str: sList)   
		System.out.print(" "+str);  
	}

}
