package chapter3;
import java.util.Scanner;

public class calculateGrade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your grade in percentage value: ");
		int percentage= input.nextInt();
		if(percentage >=100) {
			System.out.println("That is not a valid grade");
		}else if (percentage >=90) {
			System.out.println("Your grade is an A");
		}else if (percentage >=80) {
			System.out.println("Your grade is a B");
		}else if (percentage >=70) {
			System.out.println("Your grade is a C");
		}else if (percentage >=60) {
			System.out.println("Your grade is a D");
		}else if (percentage <= 0) {
			System.out.println("That is not a valid grade");
		}else {
			System.out.println("Your grade is an F");
		}
	}
}
