//6.23
package chapter6;
import java.util.Scanner;

public class CharOccurances {
	public static void main(String[] args) {
		
		//Setting up user input
		System.out.println("Please enter a string: ");
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		
		System.out.println("Please enter a character: ");
		char charInput = input.next().charAt(0);
		
		//Print output
		System.out.println("There are " + count(text,charInput)+" occurances of "+ charInput + " in the string");
		
	}
	public static int count(String text, char character) {
		
		//Variable to count number of occurances
		int count = 0;
		
		//Loop for all characters in the string
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == character) {
				count++;
			} else {
				continue;
			}
		}
		return count;
	}
}
