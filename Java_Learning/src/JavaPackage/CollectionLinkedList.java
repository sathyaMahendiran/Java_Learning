package JavaPackage;

import java.util.*; 

public class CollectionLinkedList {
	public static void main(String args[]){  
	    LinkedList<String> al=new LinkedList<String>();  
	    al.add("Ram");  
	    al.add("Prahbu");  
	    al.add("Anjana");  
	    al.add("Sathya");  
	    Iterator<String> itr=al.iterator();  
	        while(itr.hasNext()){  
	            System.out.println(itr.next());  
	        }  
	    }  


}
