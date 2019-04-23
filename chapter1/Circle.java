package chapter1;
import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		
		final double PI = 3.14159;
		
		Scanner input=new Scanner(System.in);
		System.out.println("What is the circle's radius");
		double radius= input.nextDouble();
		
		double area = radius*radius*PI;
		
		System.out.println("A circle with radius "+ radius+ " is "+ area);
		
	}
}
