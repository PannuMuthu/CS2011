package chapter7;
import java.util.Scanner;

public class DescendingSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many elements: ");
		int elements = input.nextInt();
		int[] list = new int[elements];
		System.out.println("Type the elements: ");
		for (int i =0; i< list.length; i++) {
			list[i]=input.nextInt();
		}
		bubbleDown(list);
		for (int i =0; i< list.length; i++) {
			System.out.println(list[i]+" ");
		}
	}
	public static void bubbleDown(int[] list) {
		boolean swapped = true;
		do {
			swapped = false;
			for (int j = 0; j < list.length-1; j++) {
				if (list[j]<list[j+1]) {
					int temp = list[j];
					list[j]=list[j+1];
					list[j+1]= temp;
					swapped = true;
				}
			}
		}while(swapped);
	}
}
