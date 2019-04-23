//5.16
package chapter5;

public class Factor {
	  // Main method
	  public static void main(String[] args) {
	    java.util.Scanner input = new java.util.Scanner(System.in);

	    // Prompt the user to enter a positive integer
	    System.out.print("Enter an integer: ");
	    int number = input.nextInt();

	    // Find all the smallest factors of the integer
	    System.out.print("The factor(s) for " + number + " is");
	    int factor = 2;
	    while (factor <= number) {
	      if (number % factor == 0) {
	        number = number / factor;
	        System.out.print(" "+factor);
	      }
	      else {
	        factor++;
	      }
	    }
	    System.out.println();
	  }
}
