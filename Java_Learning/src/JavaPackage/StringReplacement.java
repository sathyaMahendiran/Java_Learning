package JavaPackage;

public class StringReplacement {
	//Main Method
    public static void main(String[] args) {
		//String with special characters
        String s = "Welcome?@ to,% CPG,*$ CoE ^ Team";
		
		// Removing special characters using replaceAll 
        String newString=s.replaceAll("[?@,^%*$]*", "");
		
        System.out.println("new string :"+newString);   
    }


}
