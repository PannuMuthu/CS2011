package midterm2;
import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		//Setting up user input
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the guessing game.");
		String loopKey = "";
		//Looping the game given a user input
		do {
			//Calling game method
			game();
			System.out.println("Type y or n to play again: ");
			loopKey = input.nextLine();
		} while(loopKey.equalsIgnoreCase("Y"));
		
		}
	
	//Method to run guessing game
	public static void game(){
		
		//Setting up user input
		Scanner multiInput = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 1000: ");
		int guess = multiInput.nextInt();
		
		//Initializing variables
		int correct = (int)(Math.random()*1000 + 1);
		int numberOfTries = 1;
		System.out.println(correct);
		
		//Checking guess against the correct and responding
		while(guess != correct) {
			if (guess < correct) {
				System.out.println("Too Low");
				System.out.print("Try Again: ");
				guess = multiInput.nextInt();
				numberOfTries++;
			}
			else if (guess > correct){
				System.out.println("Too High");
				System.out.print("Try Again: ");
				guess = multiInput.nextInt();
				numberOfTries++;
			}
		}
		
		//Printing successful guess message
		System.out.println("Congratulations, you guessed the number!");
		
		//Checking number of tries before guess and printing message
		if (numberOfTries < 10) {
			System.out.println("Either you know the secret or you got lucky!");
		}
		else if (numberOfTries > 10) {
			System.out.println("You should be able to do better!");
		} else {
			System.out.println("Aha! You know the secret");
		}
	}
}
