package chapter7;
import java.util.Scanner;

public class AscendingSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many elements");
		int elements = input.nextInt();
		int[] list = new int[elements]; 
		for (int i = 0; i<list.length; i++) {
			list[i] = input.nextInt();
		}
		sort(list);
		for (int i =0; i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
	}
	public static void sort(int[] list){
		for (int i =0; i < list.length-1; i++) {
			int currentMin = list[i];
			int currentMinIndex = i;
			for (int j = i+1; j < list.length;j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				list[currentMinIndex]=list[i];
				list[i]=currentMin;
			}
		}
		

	}

}
