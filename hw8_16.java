package chapter8;
import java.util.Scanner;

public class hw8_16 {
	public static void main(String[] args) {
		//Call Method Get Input
		int[][] array = getArray();
		
		//Display Sorted Array
		display(array);
	}
	//Method to Display Result
	public static void display(int[][] array) {
		//Initialize Sorted Array
		int[][] list = sort(array);
		
		//Rows
		for(int i = 0; i < list.length; i++) {
			
			//Columns
			for(int j = 0; j < list[i].length; j++) {
				
				//Print Each Element
				System.out.print(list[i][j] + " ");
				
			}
			
			//Next Line Each Time Row Changes
			System.out.println("");
			
		}
	}
	//Method to Get Array Inputs
	public static int[][] getArray() {
		//Initialize Scanner
		Scanner input = new Scanner(System.in);
		
		//Initialize Array
		int array[][] = new int[6][2];
		
		//Populate Array with Input
		System.out.println("Enter a 2 X 6 array");
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				
				array[i][j] = input.nextInt();
				
			}
			
		}
		
		//Return Populated Array
		return array;
	}
	//Method to Sort 2D array
	public static int[][] sort(int array[][]) {
		int[] currentMins = new int[2];
		for (int i = 0; i < array.length - 1; i++) {
			currentMins[0] = array[i][0]; 
			currentMins[1] = array[i][1]; 
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j][0] <= currentMins[0] && (array[j][0] < currentMins[1] || 
					array[j][1] < currentMins[0] || array[j][1] < currentMins[1])) { 
					currentMins[0] = array[j][0];
					currentMins[1] = array[j][1];
					minIndex = j;
				}
			}
			if (minIndex != i){
				array[minIndex][0] = array[i][0];
				array[minIndex][1] = array[i][1];
				array[i][0] = currentMins[0];
				array[i][1] = currentMins[1]; 
			}
		}
		return array;
	}
}
