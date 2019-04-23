package chapter6;
import java.util.Scanner;

public class stringPalindrome {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String inputString = input.nextLine();
		System.out.println("The string is a palindrome: " + isPalindrome(inputString));
	}
	public static boolean isPalindrome(String inputString){
		int lowEnd = 0;
		int highEnd = inputString.length()-1;
		boolean isPalindrome = true;
		while (lowEnd < highEnd){
			if (inputString.charAt(lowEnd)!= inputString.charAt(highEnd)){
				 isPalindrome = false;
			}
			lowEnd++;
			highEnd--;
		}
		return isPalindrome;

	}
}