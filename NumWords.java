// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // getting number to separate the ones, tens and hundreds
		int number=Integer.parseInt(args[0]);
		
		//take out the ones to new variable
		int one= number %10;

		//divide the last number 
		number=number/10;
		//take out the tens to new variable

		int ten= number %10;

		//divide the last number 

		number=number/10;

		//take out the hundreds to new variable

		int hundreds=number;
		
		System.out.println(hundreds+" hundreds, "+ten+ " tens, "+"and "+ one +" ones.");
	}
}
