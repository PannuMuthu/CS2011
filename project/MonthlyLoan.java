package project;
import java.util.Scanner;

public class MonthlyLoan {
	public static void main(String[] args) {
		
		System.out.println("This program by Pratyush Muthukumar in CS 2011-05 will compute your monthly interest rate, principal, and balance if you input your loan amount, number of years, and interest rate.");
		
		//Setting up user input
		Scanner input = new Scanner(System.in);
		
		//Prompting user-defined values
		System.out.println("Loan Amount: ");
		double loanAmount = input.nextDouble();
		
		System.out.println("Number of years: ");
		double yearLength = input.nextDouble();
		
		System.out.println("Interest rate (in decimal format): ");
		double interestRate = input.nextDouble();
		
		if (loanAmount <= 0) {
			System.out.println("Invalid input. ");
			System.exit(1);
		}
		if (yearLength <= 0) {
			System.out.println("Invalid input. ");
			System.exit(1);
		}
		if (interestRate <= 0 || interestRate >=1) {
			System.out.println("Invalid input. ");
			System.exit(1);
		}
		
		//Declaring variables that will be used for future use in the for loop
		double monthlyInterestRate = interestRate/12;
		double monthlyPayment = (loanAmount*monthlyInterestRate)/(1-((1)/(Math.pow(1+monthlyInterestRate,yearLength*12))));
		
		//Using a loop to print out a chart for x months
		System.out.println("Payment#     Interest     Principal     Balance");
		for (int i=0;i<(yearLength*12);i++) {
			
			//Computing interest column in chart
			double monthlyInterest = loanAmount*monthlyInterestRate;
			
			//Computing principal column in chart
			double principal = monthlyPayment-monthlyInterest;
			
			//Resetting loan amount to new amount for the next iteration
			loanAmount = loanAmount-principal;
			
			//Formatting the chart with spaces so it looks presentable 
			System.out.println("     "+(i+1)+"       "+(int)(monthlyInterest*100)/100.0+"        "+(int)(principal*100)/100.0 +"         "+(int)(loanAmount*100)/100.0);
			
		}
	}
}
