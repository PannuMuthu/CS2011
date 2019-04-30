package chapter7;
import java.util.Scanner;

public class TriangleArr {
	public static void main(String[] args) {
		//Setting up user input
		Scanner input = new Scanner(System.in);
		double arr[][]= new double [3][2];
		System.out.println("Please enter the points one by one: ");
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				arr[row][column]=input.nextDouble();
			}
		}
		System.out.println("The area of the triangle is "+triangle(arr));
	}
	public static double triangle(double arr[][]) {
		double area = 0;
		double s1 = Math.pow((Math.pow((arr[0][0] - arr[1][0]), 2) + Math.pow((arr[0][1] - arr[1][1]), 2)), 0.5);
		double s2 = Math.pow((Math.pow((arr[1][0] - arr[2][0]), 2) + Math.pow((arr[1][1] - arr[2][1]), 2)), 0.5);
		double s3 = Math.pow((Math.pow((arr[2][0] - arr[0][0]), 2) + Math.pow((arr[2][1] - arr[0][1]), 2)), 0.5);
		double p = (s1+s2+s3)/2;
		area = Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));
		return area;
	}
}
