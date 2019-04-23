//4.24
package chapter4;
import java.util.Scanner;

public class CountryOrder {
	  public static void main(String[] args) {
		  
		  	//Setting up user input
		    Scanner input = new Scanner(System.in);
		    System.out.print("Enter the first country: ");
		    String s1 = input.nextLine();    
		    System.out.print("Enter the second country: ");
		    String s2 = input.nextLine(); 
		    System.out.print("Enter the third country: ");
		    String s3 = input.nextLine(); 
		    String s4 = input.nextLine();
		    
		    
		    
		    //Comparing strings for descending order
		    if (s1.compareTo(s2) > 0) {
		      // Swap s1 with s2
		      String temp = s1;
		      s1 = s2;
		      s2 = temp;
		    }
		  
		    if (s2.compareTo(s3) > 0) {
		      // Swap s2 with s3
		      String temp = s2;
		      s2 = s3;
		      s3 = temp;
		    }  
		  
		    if (s1.compareTo(s2) > 0) {
		      // Swap s1 with s2
		      String temp = s1;
		      s1 = s2;
		      s2 = temp;
		    }
		  
		    //Printing outputs
		    System.out.print("The three country in descending order are " 
		      + s3 + " " + s2 + " " + s1);
		  }
}
