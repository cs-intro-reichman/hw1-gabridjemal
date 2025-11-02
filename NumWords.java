// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int NumWords = Integer.parseInt(args[0]);
		int thousands = NumWords / 1000;
		int hundreds = (NumWords % 1000) / 100;
		int tens = (NumWords % 100) / 10;
		int ones = NumWords % 10;
		System.out.println(thousands + " thousands, " + hundreds + " hundreds, " + tens + " tens, " + ones + " ones");
	}
}
