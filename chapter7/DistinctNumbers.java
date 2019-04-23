package chapter7;
import java.util.Scanner;

public class DistinctNumbers {
	public static void main(String[] args) {
		//Setting up user input
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter how many elements: ");
		int elements = input.nextInt();
		int list[] = new int[elements];
		System.out.println("Enter the numbers in one by one: ");
		for (int i = 0; i<list.length;i++) {
			list[i]= input.nextInt();
		}
        distinct(list, elements); 
	}
	
	//Method to check amount of distinct numbers
	public static void distinct(int[] list, int n) {
			int count = 0;
	        // Pick all elements one by one 
	        for (int i = 0; i < n; i++) 
	        { 
	            // Check if the picked element  
	            // is already printed 
	            int j; 
	            for (j = 0; j < i; j++) 
	            if (list[i] == list[j]) 
	                break; 
	      
	            // If not printed earlier,  
	            // then print it 
	            if (i == j) 
	            System.out.print( list[i] + " "); 
	            count++;
	        } 
	 
	        System.out.println("There are a total of " + count + " distinct numbers");
	}
}

