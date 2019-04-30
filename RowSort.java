package chapter8;
import java.util.Scanner;

public class RowSort {

	public static void main(String[] args) {
		//Setting up user input
		Scanner input = new Scanner(System.in);
				
		//Initialize array
		int array[][]= new int [4][4];
		System.out.println("Please enter the elements one by one: ");

		for (int row =0; row < array.length; row++) {
			for (int column = 0; column< array[row].length; column++) {
				array[row][column]=input.nextInt();
			}
		}
		
		//Call method
		sort(array);
		
		// Display sorted array
				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array[i].length; j++) {
						System.out.print(array[i][j] + ", ");
					}
				}
				
	}
	
	//Method to sort only rows
	 public static void sort(int arr[][]) { 
		 for (int i = 0; i < arr.length; i++) {
			 boolean changed = true;
			    do {
			      changed = false;
			      for (int j = 0; j < arr.length - 1; j++) {
			        if (arr[i][j] > arr[i][j+1]) {
			          //swap list[j] with list[j+1]
			          int temp = arr[i][j];
			          arr[i][j] = arr[i][j + 1];
			          arr[i][j + 1] = temp;
			          changed = true;
			        }
			      }
			    } while (changed);
			  }
		 }
		 
		
	 } 
	    
