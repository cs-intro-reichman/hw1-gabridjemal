/* Feedback: 
 * The code is correct and efficiently sorts three random integers.
 * However , for clean coding practices it's important to add spacings around 
 * "sections" of code for better readability.
 */

// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * (lim+1));
		int b = (int)(Math.random() * (lim+1));
		int c = (int)(Math.random() * (lim+1));
		int min = Math.min(a, Math.min(b, c));
		int max = Math.max(a, Math.max(b, c));
		int mid = a + b + c - min - max;
		System.out.println(a+" "+b+" "+c);
		System.out.println(min + " " + mid + " " + max);
	}
}
