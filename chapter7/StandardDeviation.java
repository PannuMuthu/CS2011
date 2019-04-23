//7.11
package chapter7;
import java.util.Scanner;

public class StandardDeviation {
	public static void main(String[] args) {
		//Setting up user input
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers do you want to input?");
		int elements=input.nextInt();
		double list[] = new double[elements];
		System.out.println("Please enter the numbers one by one: ");
		for (int i = 0; i < list.length; i++) {
			list[i]=input.nextDouble();
		}
		
		System.out.println("The mean is "+ mean(list)+ " and the standard deviation is "+ deviation(list));
	}
	
	//Method to compute mean of double values
	public static double mean(double[] list) {
		double mean = 0;
		for (int i = 0; i < list.length; i++) {
			mean += list[i];
		}
		mean = mean/(list.length);
		return mean;
	}
	
	//Method to compute deviation of double values
	public static double deviation(double[] list) {
		double meanError = 0;
		
		for (int i = 0; i < list.length; i++) {
			meanError += Math.pow((list[i]-mean(list)), 2);
		}
		double deviation = Math.pow((meanError/(list.length-1)),2);
		return deviation;
	}

}

