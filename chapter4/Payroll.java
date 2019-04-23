//4.23
package chapter4;
import java.util.Scanner;

public class Payroll {
	public static void main(String[] args) {
	//Setting up user input
	System.out.println("This program by Pratyush Muthukumar in CS 2011-05 will compute your payroll");
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter Employee's Name: ");
	String name = input.nextLine();
	
	System.out.println("Enter number of hours worked in a week: ");
	double hoursWorked = input.nextInt();
	
	System.out.println("Enter hourly pay rate: ");
	double payRate = input.nextDouble();
	
	System.out.println("Enter federal tax withholding rate in decimal: ");
	double fedTaxRate = input.nextDouble();
	
	System.out.println("Enter state tax withholding rate in decimal: ");
	double stateTaxRate = input.nextDouble();
	
	//Compute final values
	double grossPay = hoursWorked * payRate;
	double fedTax = grossPay * fedTaxRate;
	double stateTax = grossPay * stateTaxRate;
	double netPay = grossPay - (fedTax + stateTax);
	
	//Print output
	System.out.println("Employee Name: "+name);
	System.out.println("Hours Worked: "+ hoursWorked);
	System.out.printf("Pay Rate: $%5.2f", payRate);
	System.out.printf("\nGross Pay: $%5.2f \n", grossPay);
	System.out.println("Deductions: ");
	System.out.printf("\t Federal Withholding (%3.1f%%): $%5.2f", (fedTaxRate*100.0), fedTax);
	System.out.printf("\n \t State Withholding (%3.1f%%): $%5.2f", (stateTaxRate*100.0), stateTax);
    System.out.printf("\n \t Total Deduction: $%5.2f", (fedTax+stateTax));
	System.out.printf("\nNet Pay: $%5.2f \n", netPay);
	
	} 
}
