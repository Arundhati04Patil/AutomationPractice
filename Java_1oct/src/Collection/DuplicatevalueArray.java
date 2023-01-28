package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicatevalueArray {

	public static void main(String[] args) {
	//ArrayList<String> List = new ArrayList<String>();
	   
	//List.add("Arundhati");
	//List.add("Pooja");
	//List.add("Sara");
	//List.add("Sayli");
	//List.add("Arundhati");
	//List.add("Sara");
	//List.add("Rma");
	//List.add("Poonam");
	
	//Set<String> s1= new HashSet<String>();
		//for(String name: List) {
			//if(s1.add(name)== false);
			//System.out.println(name +"is duplicated");
	//for(int i =0; i<List.size();i++) {
		//if (List.contains(List.get(i))) {
		
	//System.out.println(List.get(i)+"is duplicated");
		
		int arr[] = {1,2,3,8,5,7,5,3,8,9};
		System.out.println("To find unique data in a array using Hashset method");
		Set<Integer> s = new HashSet<Integer>();
		
		
		//for iterating loop use for each loop
		for(int no:arr) {
			boolean B = s.add(no);//gives true falsesif itreating value is not same
			if(B==false) {
				System.out.println(no +"  ");
			}
			
		}
		
		
		}
		}

	
	
		
			
		
	
	

     
	


