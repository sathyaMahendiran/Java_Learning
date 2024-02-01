/**
 * 
 */
package JavaPackage;

/**
 * @author autorock
 *
 */
public class VowelsCheck {
	
	public static void main(String[] args) {    
        
        //Counter variable to store the count of vowels   
        int vCount = 0;    
            
        //Declare a string    
        String str = "Welcome to Rockwell";    
            
        //Converting entire string to lower case to reduce the comparisons    
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) {    
            //Checks whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' 
			   || str.charAt(i) == 'i' || str.charAt(i) == 'o' 
			   || str.charAt(i) == 'u') {    
                //Increments the vowel counter    
                vCount++;    
            }    
        }    
        System.out.println("Vowels Count: " + vCount);        
    }   


}
