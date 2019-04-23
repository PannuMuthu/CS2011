package chapter3;
import java.util.Scanner;
import java.util.Random;

public class Lottery {
	public static void main(String[] args) {
		// Initialize Scanner and Random utils
		Scanner input = new Scanner(System.in);
		Random num = new Random();
		
		//Variable declaration for lottery and guess
		System.out.println("Let's play a game! I am thinking of a two-digit number. If you can guess it exactly, you will win $10,000. If your guess has two digits in common with my number, you will win $3,000. If your guess has one digit in common with my number, you will get $1,000.");
		int lottery = num.nextInt(100);
		System.out.println("Enter a two-digit number for your guess: ");
		int guess = input.nextInt();
		
		//Splitting into individual digits
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		//Boolean Statements
		if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2) {
			System.out.println("Congratulations, exact match: you won $10,000!");
		} else if (guessDigit1==lotteryDigit2 && guessDigit2==lotteryDigit1) {
			System.out.println("Congratulations, double digit match: you won $3,000!");
		} else if (guessDigit1==lotteryDigit1 || guessDigit2==lotteryDigit2 || guessDigit1==lotteryDigit2 || guessDigit2==lotteryDigit1) {
			System.out.println("Congratulations, single digit match: you won $1,000!");
		} else {
			System.out.println("Sorry, no digits matched. Better luck next time!");
		}
		System.out.println("For reference, the random number was " + lottery);
		
	}
}
