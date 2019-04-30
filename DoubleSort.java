//8.16
package chapter8;
import java.util.Scanner;

public class DoubleSort {
	public static void main(String[] args) {
		//Setting up user input
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of rows: ");
		int rowLength  = input.nextInt();
		System.out.println("Please enter the number of columns: ");
		int columnLength  = input.nextInt();
		
		//Initialize array
		int array[][]= new int [rowLength][columnLength];
		System.out.println("Please enter the elements one by one: ");

		for (int row =0; row < array.length; row++) {
			for (int column = 0; column< array[row].length; column++) {
				array[row][column]=input.nextInt();
			}
		}
		//Call Method
		sort(array);

		// Display sorted array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + ", ");
			}
		}
		
	}

	//Method to sort rows first then columns
	public static void sort(int arr[][]) {
		int[] min = new int[2];
		for (int row = 0; row < arr.length - 1; row++) {
			min[0] = arr[row][0]; 
			min[1] = arr[row][1]; 
			int index = row;
			for (int i = row + 1; i < arr.length; i++) {
				if (arr[i][0] <= min[0] && (arr[i][0] < min[1] || 
					 arr[i][1] < min[0] || arr[i][1] < min[1])) { 
					min[0] = arr[i][0];
					min[1] = arr[i][1];
					index = i;
				}
			}
			if (index != row){
				arr[index][0] = arr[row][0];
				arr[index][1] = arr[row][1];
				arr[row][0] = min[0];
				arr[row][1] = min[1]; 
			}
		}
	}
}
