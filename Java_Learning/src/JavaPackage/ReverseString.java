package JavaPackage;

public class ReverseString {
	//Main Method
	   public static void main(String args[]) {
	       String str1  =  "Rockwell Automation";
	       System.out.println("Original string: "+str1);
		   // caclulate length of String
	       int n = str1.length(); 
	 
	       String Reverse_String ="";
	       char ch;
	       for(int i=0;i<n;i++) {
	           //fetch each character
	           ch = str1.charAt(i);
	 
	          //concatenates each character in front of the new string
	           Reverse_String = ch + Reverse_String;
	       }
		   //  Display the reversed String
	       System.out.println("Reversed string: "+Reverse_String); 
	   }


}
