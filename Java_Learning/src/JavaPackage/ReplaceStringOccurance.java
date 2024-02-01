package JavaPackage;

public class ReplaceStringOccurance {
	public static void main(String[] args) {
	    String str1 = "abc cba";

	    // all occurrences of 'a' is replaced with 'z'
	    System.out.println(str1.replace('a', 'z'));  // zbc cbz

	    // all occurences of 'L' is replaced with 'J'
	    System.out.println("Lava".replace('L', 'J'));  // Java

	    // character not in the string
	    System.out.println("Hello".replace('4', 'J'));  // Hello

	  }


}
