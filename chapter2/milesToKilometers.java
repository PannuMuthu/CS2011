package chapter2;
import java.util.Scanner;


public class milesToKilometers {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter a number of miles");
		double miles = input.nextDouble();
		double kilometers = 1.6*miles;
		System.out.println("The number of kilometers in "+miles+ " miles is "+ kilometers+ " kilometers.");
	}
}

