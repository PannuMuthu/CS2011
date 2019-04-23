package chapter7;
import java.util.Scanner;

public class Primes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many primes would you like to find? ");
		int n = input.nextInt();
		final int NUMBER_OF_PRIMES = n+1;
		boolean[] flag = new boolean[NUMBER_OF_PRIMES];
		for (int i =0; i < NUMBER_OF_PRIMES; i++) {
			flag[i] = true;
		}
		
		for (int i=2; i < NUMBER_OF_PRIMES; i++) {
			if (flag[i]) {
				System.out.println(i);
			}
			for (int j = i+i; j < NUMBER_OF_PRIMES; j+=i) {
				flag[j]=false;
			}
		}
		
	}
}
