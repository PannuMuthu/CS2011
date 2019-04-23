//3.18
package chapter3;
import java.util.Scanner;

public class ShippingCosts {
	 public static void main(String args[]) {
		 	//Setting up user input
		    Scanner input = new Scanner(System.in);
		    System.out.print("Enter package weight: ");
		    double w = input.nextDouble();
		    
		    //Calculating shipping costs
		    if (w <= 2) {
		      System.out.println("The shipping cost is $2.50");
		    }
		    else if (w <= 4) {
		      System.out.println("The shipping cost is $4.50");
		    }     
		    else if (w <= 10) {
		      System.out.println("The shipping cost is $7.50");
		    }     
		    else if (w <= 20) {
		      System.out.println("The shipping cost is $10.50");
		    }     
		    else {
		      System.out.println("The package cannot be shipped");
		    }
	}
}
	 
