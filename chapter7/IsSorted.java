package chapter7;
import java.util.Scanner;

import java.util.Scanner;

public class IsSorted {
	 public static void main (String[] args) {
		    Scanner input = new Scanner(System.in);
		    
		    int[] myList = new int[10];
		    System.out.print("Enter 10 numbers: ");

		    for (int i = 0; i < myList.length; i++) {
		      myList[i] = input.nextInt();
		    }
		    if(isSorted(myList) == true) {
	            System.out.println("Your array is sorted!");
	        } else {
	            System.out.println("Your array is not sorted!");
	        }

	 }


	 public static boolean isSorted(int[] list) {
	        for (int i = 0; i < list.length - 1; i++) {
	            int currentMin = list[i];

	            for (int j = i + 1; j < list.length; j++) {
	                if (currentMin > list[j]) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
}
