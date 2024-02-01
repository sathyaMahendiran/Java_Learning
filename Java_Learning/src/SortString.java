import java.util.Arrays;

public class SortString {
	public static void main(String[] args) {
	    // input string str
	    String str = "scaler";

	    // now convert the string into char array
	    char array[] = str.toCharArray();

	    // now sort the array using array.sort() method

	    Arrays.sort(array);
	    // making the string from the array
	    str = new String(array);

	    System.out.println(str);
	  }


}
