//6.17
package chapter6;
import java.util.Random;
import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		
		//Setting up user input
		System.out.println("Enter n: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		//Calling method
		printMatrix(n);
		
	}
	//Method to display matrix
	public static void printMatrix(int n) {
		//Loop for the rows
		for (int i = 0; i < n; i++) {
				//Loop for the columns
				for (int j = 0; j < n; j++) {
					Random num = new Random();

					int element = num.nextInt(2);
					System.out.print(" "+ element);
				}
			System.out.println("");
		}
		
	}
}
