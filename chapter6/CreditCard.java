//6.31

package chapter6;
import java.util.Scanner;

public class CreditCard {

public static void main(String[] args) {

  //Setting up user input
  System.out.println("Enter your credit card number: ");
  Scanner input = new Scanner(System.in);
  long creditCardNumber = input.nextLong();

  //Calling valid method
  if (isValid(creditCardNumber)) {
    System.out.println(creditCardNumber + " is valid");
  }
  else {
    System.out.println(creditCardNumber + " is invalid");
  }
}

//Method to check if credit card is valid
public static boolean isValid(long number) {

    //check if the number has one of the correct prefixes
    if ((prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6)) && (getSize(number) >= 13 && getSize(number) <= 16)) {
        return (evenSum(number) + sumOdd(number)) % 10 == 0;
    }
    else {
      return false;
    }
}

//Method to double sum of even number
public static int evenSum (long number) {
	//Initialize variables
	int sum = 0;
	long digit;
	int numLength = getSize(number);

	//Loop for each digit
	for (int i = 1; i <= numLength; i++) {
		digit = number % 10;
		number /= 10;
		//Summing even digits
		if ((i) % 2 == 0) {
			sum += getDigit(2 * (int)digit);
		}
	}
  return sum;
}

//Returns each digit
public static int getDigit(int number) {

  int numLength = getSize(number);
  int digit;
  int sum = 0;

  if ((numLength) == 1) {
    return number;
  }
  else {
    for (int i = 0; i < numLength; i++) {
      digit = number % 10;
      number /= 10;

      sum += digit;
    }
    return sum;
  }
}

//Return sum of odd digits
public static int sumOdd (long number) {

  int sum = 0;
  long digit;
  int length = getSize(number);


  //Loop for each digit
  for (int i = 1; i <= length; i++) {
    digit = number % 10;
    number /= 10;
    if ((i-1) % 2 == 0) {
      sum += digit;
    }

  }
  return sum;
}

//return true if the number d is a prefix for the number
public static boolean prefixMatched (long number, int d) {

  //find the length of the prefix
  int prefixLength = getSize(d);

  //get the prefix of the number using the prefix length and compare it to the prefix
  return getPrefix(number, prefixLength) == d;

}

//return the number of digits in d
public static int getSize (long d) {

  //counter variable for the for loop to count length
  int length;

  //keep dividing the number until it reaches a value of 0 (integer division)
  for (length = 0; d > 0; length++) {
    d /= 10;
  }

  return length;
}

//Method for prefix check
public static long getPrefix (long number, int prefix) {
  int length = getSize(number);
  //Choice for prefix if length is less than prefix
  if (length <= prefix) {
    return number;
  }
  //Choice for prefix if length is greater than prefix
  else {
    for (int i = 0; i < length - prefix; i++) {
        number /= 10;
    }
    return number;
  }

}
}