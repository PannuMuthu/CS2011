package chapter2;
import java.util.Scanner;


public class drivingCost {
	public static void main(String[] Args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter distance of trip in miles: ");
		double distance = input.nextDouble();
		System.out.println("Enter miles per gallon of car: ");
		double mpg = input.nextDouble();
		System.out.println("Enter cost of one gallon: ");
		double gallonCost = input.nextDouble();
		
		double finalCost = (distance/mpg)*gallonCost;
		System.out.println("The total cost for driving "+ distance+" miles on "+mpg +" miles per gallon with cost per gallon of "+ gallonCost+" is "+ finalCost);
	}
}
