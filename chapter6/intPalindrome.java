package chapter6;
import java.util.Scanner;

public class intPalindrome {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		System.out.println("Your number is a palindrome: " + isPalindrome(n));

	} 
	public static boolean isPalindrome(int n) {
		String intString = Integer.toString(n);
		int lowEnd = 0; 
		int highEnd = intString.length()-1;
		boolean isPalindrome = true;
		while(lowEnd < highEnd) {
			if (intString.charAt(lowEnd) != intString.charAt(highEnd)) {
				isPalindrome = false;
				break;
			}
			lowEnd++;
			highEnd--;
		}
		return isPalindrome;		
	}

}
