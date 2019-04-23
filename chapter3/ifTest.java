package chapter3;
import java.util.Scanner;

public class ifTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a radius value: ");
		double radius = input.nextDouble();
		
		if (radius < 0) {
			System.out.println("Incorrect input");
		}
		else {
		double area = radius * radius * 3.14159;
		System.out.println("Area is " + area);
		}
	}

}
