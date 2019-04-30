package chapter8;

import java.util.Scanner;

public class hw8_26 {
	public static void main(String[] args) {
		int[][] array = getArray();
		
		display(array);
	}
	public static void display(int[][] list) {
		int[][] array = sortRows(list);
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j] + " ");
			}
			System.out.println("");
		}
	}
	public static int[][] getArray() {
		//Initialize Scanner
		Scanner input = new Scanner(System.in);
		
		//Initialize Array
		int array[][] = new int[4][4];
		
		//Populate Array with Input
		System.out.println("Enter a 4 X 4 matrix");
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				
				array[i][j] = input.nextInt();
				
			}
			
		}
		
		//Return Populated Array
		return array;
	}
	public static int[][] sortRows(int arr[][]) { 
		for (int i = 0; i < arr.length; i++) {
			boolean changed = true;
			do {
				changed = false;
				for (int j = 0; j < arr.length - 1; j++) {
					if (arr[i][j] > arr[i][j+1]) {
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
