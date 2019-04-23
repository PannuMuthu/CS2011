package chapter7;

import java.util.Scanner;

public class hw43 {
	public static void main(String[] args) {
		//Initialize Scanner
		Scanner input = new Scanner(System.in);
		
		//Ask user to input text
		System.out.print("Enter a string: ");
		String text = input.nextLine();

		//Call sorting method
		sort(text);
	}

	/** sort sorts string */
	public static void sort(String text) {
		//Initialize array of each character in string
		char[] string = new char[text.length()];

		//Add characters of string to array
		for (int i = 0; i < string.length; i++) {
			string[i] = text.charAt(i); 
		}

		//For loop to sort array
		for (int i = 0; i < string.length - 1; i++) {
			//Initialize minimum
			char min = string[i];
			int minIndex = i;

			//Change minimum each time a term is lower than the firts
			for (int j = i + 1; j < string.length; j++) {
				if (min > string[j]) {
					min = string[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				string[minIndex] = string[i];
				string[i] =  min;
			}
		}
		
		//Print array
		for(int i = 0; i < text.length(); i++) {
			System.out.println(string[i]);
		}
	}
}
