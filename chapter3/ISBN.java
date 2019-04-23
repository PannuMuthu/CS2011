//3.9
package chapter3;
import java.util.Scanner;

public class ISBN {
	public static void main(String[] args) {
		System.out.println("This program will take a 9-digit ISBN number and will change it to a 10-digit ISBN number.");
		
		//Setting up user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 9-digit ISBN Number");
		int allNineDigits = input.nextInt();
		
		//Splitting to each digit
		int firstDigit = allNineDigits%10;
		allNineDigits = allNineDigits/10;
		
		int secondDigit = allNineDigits%10;
		allNineDigits = allNineDigits/10;
		
		int thirdDigit = allNineDigits%10;
		allNineDigits = allNineDigits/10;
		
		int fourthDigit = allNineDigits%10;
		allNineDigits = allNineDigits/10;
		
		int fifthDigit = allNineDigits%10;
		allNineDigits = allNineDigits/10;
		
		int sixthDigit = allNineDigits%10;
		allNineDigits = allNineDigits/10;
		
		int seventhDigit = allNineDigits%10;
		allNineDigits = allNineDigits/10;
		
		int eighthDigit = allNineDigits%10;
		allNineDigits = allNineDigits/10;
		
		int ninthDigit = allNineDigits%10;
		allNineDigits = allNineDigits/10;
		
		int tenthDigit = (ninthDigit*1+eighthDigit*2+seventhDigit*3+sixthDigit*4+fifthDigit*5+fourthDigit*6+thirdDigit*7+secondDigit*8+firstDigit*9)%11;
		
		//Printing out 10-digit ISBN 
		if (tenthDigit != 10) {
			System.out.println("The 10-digit ISBN Number is "+ninthDigit+""+eighthDigit+""+seventhDigit+""+sixthDigit+""+fifthDigit+""+fourthDigit+""+thirdDigit+""+secondDigit+""+firstDigit+""+tenthDigit);
		} else {
			System.out.println("The 10-digit ISBN Number is "+ninthDigit+""+eighthDigit+""+seventhDigit+""+sixthDigit+""+fifthDigit+""+fourthDigit+""+thirdDigit+""+secondDigit+""+firstDigit+"X");
		}
	}
}
