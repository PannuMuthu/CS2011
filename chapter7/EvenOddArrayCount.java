//7.5
package chapter7;
import java.util.Scanner;

public class EvenOddArrayCount {
    public static void main(String[] args) {
    	
    	//Setting up user input
    	Scanner input = new Scanner(System.in);
    	
    	//Initialize array and variables
    	int[] values = new int[100];
    	int inputValue;
    	int count = 0;
    	
    	//Looping input prompt until input = 0
    	do {
    		inputValue = input.nextInt();
    		values[count] = inputValue;
    		count++;
    	} while (inputValue != 0);
    	
    	//Call method
    	countEven(values,count);
    }
    
    //Method to check how many even and odd numbers are in an array
    public static void countEven(int[] values, int count) {
    	//Initialize even and odd count
    	int evenCount = 0;
    	int oddCount = 0;

    	for (int i=0; i < (count-1); i++) {
    		if (values[i] % 2 == 0) {
    			evenCount++;
    		} else {
    			oddCount++;
    		}
    	}
    	//Print result
    	System.out.println("There are " + evenCount + " even numbers and " + oddCount + " odd numbers in this list.");
    }
    
}

