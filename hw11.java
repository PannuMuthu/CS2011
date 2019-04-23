package chapter7;
import java.util.Scanner;

public class hw11 {
	public static void main(String[] args) {
		//Initialize Scanner
		Scanner input = new Scanner(System.in);
		
		//Ask user how many numbers will be entered to initialize array
		System.out.println("How many numbers will you enter: ");
		int numOfNums = input.nextInt();
		
		//Initialize Array
		double[] nums = new double[10];
		
		//Add Inputs to Array
		System.out.println("Enter 10 numbers: ");
		for(int i = 0; i < numOfNums; i++) {
			nums[i] = input.nextDouble();
		}
		
		//Display Standard Deviation and Mean
		display(nums);
	}
	//Method to display quantities calculated
	public static void display(double[] x) {
		System.out.printf("The mean of the numbers you entered is: %3.2f"
				+ "\nThe standard deviation of the numbers you entered is: %7.5f", mean(x), deviation(x));
	}
	//Method to calculate standard deviation
	public static double deviation(double[] x) {
		//Initialize sum
		double innerValue = 0;
		
		//Add each following term to the total sum
		for(int i = 0; i < x.length; i++) {
			innerValue += Math.pow((x[i] - mean(x)), 2);
		}
		
		//Divide inner value by sample size and take square root
		double finalValue = Math.pow((innerValue/(x.length - 1)), 0.5);
		
		//Return value
		return finalValue;
	}
	//Method to calculate mean
	public static double mean(double[] x) {
		//Initialize Sum
		double sum = 0;
		
		//Add each term to the total sum
		for(int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		
		//Divide sum by sample size
		double avg = sum/x.length;
		
		//Return vale
		return avg;
	}
}
