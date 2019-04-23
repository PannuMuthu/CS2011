package chapter6;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string: ");
		String inputString = input.nextLine();
		reverseInt(inputString);
	}
	public static void reverseInt(String inputString){
		for(int i = inputString.length()-1; i >= 0; i--){
			char character = inputString.charAt(i);
			System.out.print(character);
		}
	}
}