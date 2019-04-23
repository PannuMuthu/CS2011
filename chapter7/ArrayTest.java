package chapter7;
import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int myList[] = new int[10];
		System.out.println("Enter "+ myList.length + " Values: ");
		for (int i = 0; i < myList.length; i++) {
			myList[i]=input.nextInt();
		}
		
		double randomList[] = new double[10];
		for (int i = 0; i < randomList.length; i++) {
			randomList[i] =  (int)(Math.random()*100);
		}
		System.out.println("Your array is ");
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		System.out.println();
		System.out.println("Random array is ");
		for (int i = 0; i < randomList.length; i++) {
			System.out.print( randomList[i] + " ");
		}
		int sum = 0;
		for (int i = 0; i < myList.length; i++) {
			sum += myList[i];
		}
		System.out.println("The sum of the values in your list is " + sum);
		
		int max = 0;
		int indexOfMax = 0;
		for (int i = 0; i < randomList.length; i++) {
			if (randomList[i] > max) {
				max = (int) randomList[i];
				indexOfMax = i;
			}
		}
		System.out.println("The max of the values in the random list is " + max + " The index is " + indexOfMax);
		
		for(int i = 0; i < myList.length; i++) {
			int j  = (int)(Math.random()*myList.length);
			int temp = myList[i];
			myList[i]=myList[j];
			myList[j]=temp;
		}
		System.out.println("Shuffled array is ");
		for (int i = 0; i < myList.length; i++) {
			System.out.print( myList[i] + " ");
		}
		
	}
}
