package chapter7;
import java.util.Scanner;

public class hw28 {
	public static void main(String[] args) {
		//Initialize Scanner
		Scanner input = new Scanner(System.in);
		
		//Initialize Array of Inputted Numbers
		int[] sequence = new int[10];
		
		//Add Inputs to Array
		System.out.println("Enter 10 numbers: ");
		for(int i = 0; i < 10; i++) {
			sequence[i] = input.nextInt();
		}
		
		//Double For Loop that prints each element of the array followed by the next
		for(int i = 0; i < sequence.length; i++) {
			for(int j = i + 1; j < sequence.length; j++) {
				System.out.print(i + "" + j + " ");
			}
			//Moves to next line after each combination is finished
			System.out.println("");
		}
	}
}
