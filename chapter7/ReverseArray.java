package chapter7;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many elements are in your array: ");
		int elements = input.nextInt();
		int list[] = new int[elements];
		System.out.println("Please enter the values in one by one: ");
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
		reverse(list);
	}
	public static void reverse(int list[]) {
		int result[] = new int[list.length];
		int reverseIndex = list.length-1;
		for (int i = 0; i < list.length; i++) {
			result[i]=list[reverseIndex];
			reverseIndex--;
		}
		System.out.println("The reversed array is: ");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
}
