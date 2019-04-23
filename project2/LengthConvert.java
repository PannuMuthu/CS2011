package project2;
import java.util.Scanner;

public class LengthConvert {
	public static void main(String[] args) {
		//Setting up user input
		System.out.println("This program by Pratyush Muthukumar in CS 2011-05 will calculate from imperical to metric or metric to imperical units.");
		loop();
	}
	
	//Method for feet to meters
	public static double ftToMeters(double ft, double in) {
		double totalInches = (ft * 12.0) + in;
		//Conversion from inches to centimeters
		double centimeterOut = totalInches * 2.54;
		return centimeterOut;
	}
	
	//Method for meters to feet
	public static double metersToFeet(double meter, double cm) {
		double totalCentimeters = (meter * 100.0) + cm;
		//Conversion for centimeters to inches
		double inchOut = totalCentimeters * 0.393701;
		return inchOut;
	}
	
	//Displaying result
	public static void display(int directions) {
		if (directions == 1) {
			//Setting up user input within method
			Scanner disInput = new Scanner(System.in);
			
			//Gathering input data for method
			System.out.println("Please enter number of feet: ");
			double feet = disInput.nextDouble();
	
			System.out.println("Please enter number of inches: ");
			double inches = disInput.nextDouble();
			
			//Calculating result in meters and centimeters
			double methodResult = ftToMeters(feet,inches);
			int formatMeters = (int)(methodResult/100.0);
			double formatCentimeters =(methodResult % 100.0);
			System.out.printf("For %5.2f feet and %5.2f inches, \n"
					+ "There are:  %2d meters and %5.2f centimeters \n", feet, inches, formatMeters, formatCentimeters);
		}
		else {
			//Setting up user input within method
			Scanner disInput = new Scanner(System.in);
			
			//Gathering input data for method
			System.out.println("Please enter number of meters: ");
			double meters = disInput.nextDouble();
	
			System.out.println("Please enter number of centimeters: ");
			double centimeters = disInput.nextDouble();
			
			//Calculating result in feet and inches
			double methodResult2 = metersToFeet(meters, centimeters);
			int formatFeet = (int)(methodResult2/12.0);
			double formatInches = (methodResult2 % 12.0);
			System.out.printf("For %5.2f meters and %5.2f centimeters, \n"
					+ "There are: %2d feet and %5.2f inches \n", meters, centimeters, formatFeet, formatInches);
		}
	}
	
	//Method for looping program
	public static void loop() {
		//Initializing user input 
		Scanner loopInput = new Scanner(System.in);
		String convertAgain = "Y";
		//Loop to continually run program
		do {
			System.out.println("Please enter 1 for conversion from feet and inches to meters and centimeters. Or enter 2 for conversion from meters and centimeters to feet and inches. (1 or 2): ");
			int direction = loopInput.nextInt();
			//Using choose statements to decide direction of conversion
			if (direction == 1) {
				display(1);
				convertAgain = loopInput.nextLine();
			} else if (direction == 2){
				display(2);
				convertAgain = loopInput.nextLine();
			} else {
				System.out.println("Invalid Input.");
				convertAgain = loopInput.nextLine();
			}
			//Prompt the user for new run
			System.out.println("Do you want to convert something else? Type (y) for yes, (n) for no (y or n): ");
			convertAgain = loopInput.nextLine();
		} while(convertAgain.equalsIgnoreCase("Y")); 
	}
	
}
