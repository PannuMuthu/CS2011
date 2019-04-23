/*Tuition program that calculates total monthly cost based on tuition,
 * textbook, transportation, housing, and food.
 */
package lab;
import java.util.Scanner;

public class Tuition {
	public static void main(String[] args) {
		
		System.out.println("Hello my name is Pratyush Muthukumar, and this program will get information on your yearly tuition and calculate your monthly cost for education.");
		
		//Setting up and prompting user input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the school tuition for one year: ");
		double tuition = input.nextDouble();
		
		System.out.println("Please enter the total textbook prices for one year: ");
		double textbooks = input.nextDouble();
		
		System.out.println("Please enter the total transportation cost for one year: ");
		double transportation = input.nextDouble();
		
		System.out.println("Please enter the total housing cost for one year: ");
		double housing = input.nextDouble();
		
		System.out.println("Please enter the total food cost for one year: ");
		double food = input.nextDouble();
		
		//Calculating total monthly cost and printing output
		double monthlyCost = (tuition + textbooks + transportation + housing + food)/12.0;
		System.out.println("Your average monthly cost for your total tuition is: " + monthlyCost + " dollars.");
	}
}
