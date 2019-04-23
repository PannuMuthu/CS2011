package chapter6;

public class TriangleList {
	  public static void main(String[] args) {
		    java.util.Scanner input = new java.util.Scanner(System.in);
		    System.out.print("Enter line number: ");
		    int lineNumber = input.nextInt();

		    displayPattern(lineNumber);
		  }

		  public static void displayPattern(int n) {
		    for (int row = 1; row <= n; row++) {
		      // Print numbers
		      for (int i = 1; i <= row; i++)
		        System.out.print(" " + i);

		      System.out.println();
		    }
		  }

}
