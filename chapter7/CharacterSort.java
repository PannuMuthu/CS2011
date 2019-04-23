package chapter7;
import java.util.Scanner;

public class CharacterSort {
	public static void main (String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    
	    System.out.print("Enter string: ");
	    String bruh = input.nextLine();
	    char[] myList = bruh.toCharArray();

	    
	    bubbleSort(myList);

	    //prints the sorted list
	    System.out.println("My list after sort is: ");
	    printList(myList);
	  }

	  static void printList(char[] list) {
	    for (int i = 0; i < list.length; i++)
	      System.out.println(list[i]);
	  }

	  static void bubbleSort(char[] list) {
	    boolean changed = true;
	    do {
	      changed = false;
	      for (int j = 0; j < list.length - 1; j++)
	        if (list[j] > list[j+1]) {
	          //swap list[j] with list[j+1]
	          char temp = list[j];
	          list[j] = list[j + 1];
	          list[j + 1] = temp;
	          changed = true;
	        }
	    } while (changed);
	  }
}
