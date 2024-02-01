package JavaPackage;

public class toStringOverRiding {
	// Main driver method
		public static void main(String[] args) {
			
			// Creating object of class1 
			// inside main() method
			Complex c1 = new Complex(10, 15);
			
			// Printing the complex number
			System.out.println(c1);
		}
}

//Class 2
//Helper class
class Complex {
	
	// Attributes of a complex number
	private double re, im;

	// Constructor 2: Parameterized
	public Complex(double re, double im) {
		
		// This keyword refers to 
		// current complex number
		this.re = re;
		this.im = im;
	}
	// Getters
	public double getReal() {
		return this.re;
	}
	public double getImaginary() {
		return this.im ;
	}
	// Setters
	public void setReal(double re) {
		this.re = re;
	}
	public void setImaginary(double im) {
		this.im = im;
	}
	// Overriding toString() method of String class
	@Override
	public String toString() {
		return this.re + " + " + this.im + "i";
	}
}

