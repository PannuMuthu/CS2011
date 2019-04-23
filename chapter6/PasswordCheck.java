//6.18
package chapter6;
import java.util.Scanner;

public class PasswordCheck{	
public static void main(String[] args) {
    // Prompt the user to enter a password
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter a string for password: ");
    String password = input.nextLine();

    if (isValidPassword(password)) {
      System.out.println("Valid password");
    }
    else {
      System.out.println("Invalid password");
    }
  }

  // Check if a string is a valid password
  public static boolean isValidPassword(String password) {
    // Only letters and digits?
    for (int i = 0; i < password.length(); i++) {
      if (!Character.isLetter(password.charAt(i)) && 
          !Character.isDigit(password.charAt(i)))
        return false;
    }
    
    // Check length
    if (password.length() < 10)
      return false;
    
    // Count the number of digits
    int count = 0;
    for (int i = 0; i < password.length(); i++) {
      if (Character.isDigit(password.charAt(i)))
        count++;
    }
    
    if (count >= 3)
      return true;
    else 
      return false;
  }
}
