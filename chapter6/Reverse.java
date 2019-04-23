
package chapter6;
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		reverseInt(n);
	}
	public static void reverseInt(int n){
		while (n != 0){
			System.out.print(n%10);
			n = n/10;
		}
	}
}