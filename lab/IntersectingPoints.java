package lab;
import java.util.Scanner;

public class IntersectingPoints {
	public static void main(String[] args) {
		//Setting up user input
		Scanner input = new Scanner(System.in);
		System.out.println("This program by Pratyush Muthukumar in the CS 2011-05 class and it will figure out at which point that two lines intersect. Just enter the coordinates of the four points that make up the two lines(x1, y1, x_2, y_2, x_3, y_3, x_4, y_4)");
		
		//Gather user-defined variables
		System.out.println("Please enter the coordinates of the four points in the form x_1 y_1 x_2 y_2 x_3 y_3 x_4 y_4:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		//Calculate variables that will be used in Cramer's rule calculation.
		double a = y1 - y2;
		double b = x1 - x2;
		double c = y3 - y4;
		double d = x3 - x4;
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		
		if (a * d - b * c == 0) {
			System.out.println("The two lines are parallel.");
			System.exit(1);
		}
		else { 
			double xCoordinate = (e * d - b * f)/( a * d - b * c);
			double yCoordinate = (a * f - e * c)/( a * d - b * c);
			System.out.println("The intersecting point is at (" + (int) (xCoordinate * 10000)/10000.0 + "," + (int) (yCoordinate * 10000)/10000.0+").");
		}
	}
}
