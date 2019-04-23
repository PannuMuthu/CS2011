//2.21
package chapter2;
import java.util.Scanner;

public class futureInvestment {
	public static void main(String[] args) {
		//Setting up user input
		Scanner input = new Scanner(System.in);
		System.out.println("This program will calculate your future investment value if you input your investment amount, annual interest rate, and number of years.");
		
		System.out.println("Enter your investment amount: ");
		double initialInvestment = input.nextDouble();
		
		System.out.println("Enter annual interest rate in decimal format: ");
		double interestRate = input.nextDouble();
		
		System.out.println("Enter number of years: ");
		double years = input.nextDouble();
		
		//Calculate future investment amount
		double futureInvestment = initialInvestment * (Math.pow(1+(interestRate/12),(years*12)));
		
		//Output future investment
		System.out.println("Your future investment amount will be $"+ (int)(futureInvestment * 100)/100.0);
	}
}
