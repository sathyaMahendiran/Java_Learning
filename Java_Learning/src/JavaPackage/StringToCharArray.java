package JavaPackage;

public class StringToCharArray {
	
	// Main method
    public static void main(String args[])
    {
 
        // Custom input string
        String str = "Welcome to CPGCoE";
 
        // Creating array of string length
        char[] ch = new char[str.length()];
 
        // Copying character by character into array
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
 
        // Printing the elements of array
        for (char c : ch) {
            System.out.println(c);
        }
    }


}
