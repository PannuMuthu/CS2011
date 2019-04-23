package chapter3;
import java.util.Scanner;

public class doubleTest {
	public static void main(String[] Args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter fahrenheit value: ");
		double fahrenheit = input.nextDouble();
		double celsius = (5.0/9)* (fahrenheit-32);
		System.out.println(celsius);
		
	}
}
