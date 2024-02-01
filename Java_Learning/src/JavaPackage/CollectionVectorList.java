package JavaPackage;

import java.util.*; 

public class CollectionVectorList {
	public static void main(String args[])
    {  
    Vector<String> v=new Vector<String>();  
    v.add("Anjana");  
    v.add("Ram");  
    v.add("Sathya");  
    v.add("Prabhu");  
    Iterator<String> itr=v.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  
    } 
}
