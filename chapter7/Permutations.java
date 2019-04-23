//7.28
package chapter7;
import java.util.Scanner;

public class Permutations {
	public static void main(String[] args) {
		//Setting up user input
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter ten numbers");
		int list[] = new int[10];
		for(int i =0; i<list.length;i++) {
			list[i]=input.nextInt();
		}
		permute(list);
	}
	public static void permute(int[] list) {
		int count = 0;
		for(int i = 0; i < list.length-1; i++) {
			System.out.println();
			for (int j = i+1;j<list.length; j++) {
				System.out.print(list[i]+ ","+ list[j]);
				count++;	
			}
		}
		System.out.println();
		System.out.println("There are a total of " + count + " combinations.");
	}
	
}
