package chapter2;
import java.util.Scanner;

public class pointDistance {
	public static void main(String[] args) {
		
		System.out.println("This program will figure out the distance between two points (x_1,x_2) and (y_1,y_2). You will be prompted to input the two points.");
		
		//Setting up and prompting user input
		Scanner input = new Scanner(System.in);
		
		//Getting coordinates of first point
		System.out.println("Please enter the coordinates of the first point");
		double firstXCoordinate = input.nextDouble();
		double firstYCoordinate = input.nextDouble();
		
		
		
		//Getting coordinates of second point
		System.out.println("Please enter the coordinates of the second point");
		double secondXCoordinate = input.nextDouble();
		double secondYCoordinate = input.nextDouble();
		
		
		
		//Calculating distance between points and printing output
		double distance = Math.pow(Math.pow(secondXCoordinate - firstXCoordinate, 2.0)+Math.pow(secondYCoordinate - firstYCoordinate, 2.0),0.5);
		System.out.println("The distance between ("+firstXCoordinate+","+firstYCoordinate+") and ("+secondXCoordinate+","+secondYCoordinate+") is "+ (int)(1000*distance)/1000.0);
	}
	
}
