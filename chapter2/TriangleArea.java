//2.19
package chapter2;
import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		//Setting up user input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the coordinates of the three points (x_1, y_1, x_2, y_2, x_3, y_3): ");
		double firstXCoordinate = input.nextDouble();
		double firstYCoordinate = input.nextDouble();
		double secondXCoordinate = input.nextDouble();
		double secondYCoordinate = input.nextDouble();
		double thirdXCoordinate = input.nextDouble();
		double thirdYCoordinate = input.nextDouble();
		
		//Finding side lengths of the triangle with the distance formula
		double sideOne = Math.pow(Math.pow(secondXCoordinate - firstXCoordinate, 2.0)+Math.pow(secondYCoordinate - firstYCoordinate, 2.0),0.5);
		double sideTwo = Math.pow(Math.pow(thirdXCoordinate - secondXCoordinate, 2.0)+Math.pow(thirdYCoordinate - secondYCoordinate, 2.0),0.5);
		double sideThree = Math.pow(Math.pow(firstXCoordinate - thirdXCoordinate, 2.0)+Math.pow(firstYCoordinate - thirdYCoordinate, 2.0),0.5);
		double sideAverage = (sideOne+sideTwo+sideThree)/2;
		
		
		//Computing area of the triangle and outputting results
		double area = Math.pow(sideAverage*(sideAverage-sideOne)*(sideAverage-sideTwo)*(sideAverage-sideThree),0.5);
		System.out.println("The area of the triangle is "+(int)(area*100)/100.0);
	}

}
