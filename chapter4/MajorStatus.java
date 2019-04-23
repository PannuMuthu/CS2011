//4.18
package chapter4;
import java.util.Scanner;

public class MajorStatus {
	  public static void main(String[] args) {
		  
		    //Setting up user input
		    Scanner input = new Scanner(System.in);
		    System.out.print("Enter two characters: ");
		    String s = input.nextLine();
		    
		    
		    //Choice statements for different string inputs
		    if (s.charAt(0) == 'I')
		      System.out.print("Information Management ");
		    else if (s.charAt(0) == 'C')
		      System.out.print("Computer Science ");
		    else if (s.charAt(0) == 'A')
		      System.out.print("Accounting ");
		    else 
		    {
		      System.out.println("Invalid input");
		      System.exit(1);
		    }
		    
		    //Choice statements for different char inputs
		    if (s.charAt(1) == '1')
		      System.out.println("Freshman");
		    else if (s.charAt(1) == '2')
		      System.out.println("Sophomore");
		    else if (s.charAt(1) == '3')
		      System.out.println("Junior");
		    else if (s.charAt(1) == '4')
		      System.out.println("Senior");
		    
		    //Exit clause
		    else 
		    {
		      System.out.println("Invalid input");
		      System.exit(2);
		    }
		  }
}



