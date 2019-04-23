package chapter3;
import java.util.Random;
import java.util.Scanner;

public class mathTest {
	public static void main(String[] args) {
		Random num = new Random();
		Scanner input = new Scanner(System.in); 
		int number1= num.nextInt(2);
		int number2= num.nextInt(2);
		System.out.println("What is "+number1+" plus "+number2+"?");
		int response = input.nextInt();
		if (number1+number2==response) {
			System.out.println(number1+" + " +number2+" = "+response+ " is correct");
		} else {
			System.out.println(number1+" + " +number2+" = "+response+ " is incorrect");
		}
		
		
	}
}
