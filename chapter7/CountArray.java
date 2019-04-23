//7.3
package chapter7;
import java.util.Scanner;

public class CountArray {
	public static void main(String[] args) {
		
		//Setting up user input
		Scanner input = new Scanner(System.in);
		
		//Initialize the array and variables
		int[] values = new int[100];
		int inputVal;
		int count = 0;
    	System.out.print("Enter the integers between 1 and 100: ");
    	
    	//Loop input prompt until input = 0
    	do
    	{
    		inputVal = input.nextInt();
        	values[count] = inputVal;
        	count += 1;
    	}
    	while (inputVal != 0);
    	
    	//Call method
    	countOccurence(values);
}	
	
	//Method to count 
	public static void countOccurence(int[] list) {
		for (int i = 1; i <= list.length; i++) {
			int count = 0;
			for (int j = 0; j < list.length - 1; j++) {
				if (list[j] == i)
					count += 1;
			}
			if (count != 0)
				System.out.printf("%d occurs %d times \n", 
						i, count);
		} 
}
}
