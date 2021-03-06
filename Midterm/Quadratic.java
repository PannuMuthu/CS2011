package Midterm;
import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		//Setting up user inputs
		Scanner input = new Scanner(System.in);
		System.out.println("This program by Pratyush Muthukumar in CS 2011-05 will find the real zeros of a quadratic equation if they exist. Please enter the three coefficients for the quadratic (a,b,c in y= ax^2+bx+c): ");
		
		System.out.println("Please enter the first coefficient (a in y = ax^2+bx+c): ");
		double a = input.nextDouble();
		
		System.out.println("Please enter the second coefficient (b in y = ax^2+bx+c): ");
		double b = input.nextDouble();
		
		System.out.println("Please enter the third coefficient (c in y = ax^2+bx+c): ");
		double c = input.nextDouble();
		
		//Find cases where there are no roots
		if(Math.pow(b, 2)-(4*a*c)<0) {
			System.out.println("There are no real roots to this quadratic equation.");
			System.exit(1);
		} else if(2*a==0) {
			System.out.println("There are no real roots to this quadratic equation.");
			System.exit(1);
		}
		
		//Compute roots
		double rootOne = ((-b)+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
		double rootTwo = ((-b)-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
		
		//Print result for one and two roots
		if(rootOne==rootTwo) {
			System.out.printf("There is only one real root, which is %10.4f", rootOne);
		} else {
			System.out.printf("There are two real roots, which are %.4f and %.4f",rootOne, rootTwo);
		}
		
	}
}
