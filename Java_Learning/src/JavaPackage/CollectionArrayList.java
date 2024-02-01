package JavaPackage;

import java.util.*; 

public class CollectionArrayList {
	public static void main(String args[]){  
	    
	    //Creating arraylist  
	    
	    ArrayList<String> list=new ArrayList<String>();
	    //Adding object in arraylist
	    list.add("Ram");  
	    list.add("Prabhu");  
	    list.add("Sathya");  
	    list.add("Anjana");  
	    //Traversing list through Iterator  
	    Iterator<String> itr=list.iterator();  
	        while(itr.hasNext()){  
	            System.out.println(itr.next());  
	        }  
	    }  


}
