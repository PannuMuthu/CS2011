package chapter8;

import java.util.Scanner;

public class hw8_32 {
	public static void main(String[] args) {
		double[][] array = getArray();
		
		System.out.printf("The area of the traingle is: %4.2f", area(array));
	}
	public static double[][] getArray() {
		//Initialize Scanner
		Scanner input = new Scanner(System.in);
		
		//Initialize Array
		double array[][] = new double[3][2];
		
		//Populate Array with Input
		System.out.println("Enter the coordinates of the vertices of a triangle: ");
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				
				array[i][j] = input.nextDouble();
				
			}
			
		}
		
		//Return Populated Array
		return array;
	}
	public static double area(double[][] array) {
		double side1 = Math.pow((Math.pow((array[0][0] - array[1][0]), 2) + Math.pow((array[0][1] - array[1][1]), 2)), 0.5);
		double side2 = Math.pow((Math.pow((array[1][0] - array[2][0]), 2) + Math.pow((array[1][1] - array[2][1]), 2)), 0.5);
		double side3 = Math.pow((Math.pow((array[2][0] - array[0][0]), 2) + Math.pow((array[2][1] - array[0][1]), 2)), 0.5);
		double s = (side1 + side2 + side3)/2;
		double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
		
		return area;
	}
}
