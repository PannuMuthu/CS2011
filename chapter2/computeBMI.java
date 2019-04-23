//2.14
package chapter2;
import java.util.Scanner;

public class computeBMI {
	 public static void main(String[] args) {
		 //Setting up user input
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter your weight in pounds: ");
		 double lbWeight = input.nextDouble();
		 
		 System.out.println("Enter your height in feet and inches: ");
		 int ftHeight = input.nextInt();
		 
		 
		 //Changing user input (pounds/height) to computation(kilos/centimeters)
		 int inchHeight = input.nextInt();
		 int totalInchHeight= (ftHeight*12)+inchHeight;
		 
		 final double WEIGHT_IN_KILOS= lbWeight*0.45359237;
		 final double HEIGHT_IN_CM= totalInchHeight*0.0254;
		 
		 double bmi= WEIGHT_IN_KILOS/(Math.pow(HEIGHT_IN_CM, 2));
		 
		 //Outputting BMI value and BMI condition
		 if (bmi >= 30) {
			 System.out.println("Your BMI is "+ bmi+ " and you are obese.");
		 } else if (bmi >=25) {
			 System.out.println("Your BMI is "+ bmi+ " and you are overweight.");
		 } else if (bmi >=18.5) {
			 System.out.println("Your BMI is "+ bmi+ " and you are a healthy weight.");
		 } else if (bmi <= 0) {
			 System.out.println("Invalid input");
		 } else {
			 System.out.println("Your BMI is "+ bmi+ " and you are underweight.");
		 }
	 }
}
