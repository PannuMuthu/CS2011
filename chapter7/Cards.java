package chapter7;
import java.util.Scanner;

public class Cards {
	public static void main(String[] args) {
		System.out.println("How many cards do you want to pick out of this shuffled deck? ");
		Scanner input = new Scanner(System.in);
		int pick = input.nextInt();
		String rank[] = {"Ace", "Two", "Three", "Four","Five","Six","Seven","Eight","Nine", "Ten", "Jack","Queen","King"};
		String suit[] = {"Spades", "Clubs","Diamonds","Hearts"};
		int cardDeck[] = new int[52];
		for (int i = 0; i < cardDeck.length;i++) {
			cardDeck[i]=i;
		}
		for (int i = 0; i < cardDeck.length; i++) {
			int index = (int) (Math.random()*cardDeck.length);
			int temp = cardDeck[i];
			cardDeck[i]= cardDeck[index];
			cardDeck[index]=temp;
		}
		for (int i = 0; i < pick; i++) {
			int cardNumber = cardDeck[i];
			System.out.print("Card number " +  cardNumber + " : ");
			String printRank = rank[(int)(cardNumber % 13)];
			String printSuit =  suit[cardNumber / 13];
			System.out.print(printRank+" of " + printSuit);
			System.out.println();
		}
	}
}
