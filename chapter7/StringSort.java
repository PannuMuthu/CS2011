package chapter7;
import java.util.Scanner;

public class StringSort {
	public static void main(String[] args) {
		//Setting up user input
		Scanner input =  new Scanner(System.in);
		System.out.println("Please enter the string that you want sorted: ");
		String strIn = input.nextLine();
		char list[] = strIn.toCharArray();
		for (int i = 0; i < list.length; i++) {
			System.out.println(sort(list)[i]+"");
		}
	}
	public static char[] sort(char list[]) {
		char result[] = new char[list.length];
		boolean changed = true;
		do {
			changed = false;
			for(int j=0;j<list.length-1;j++) {
				if (list[j]>list[j+1]) {
					//Swap list[j] with list[j+1]
					char temp = list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
					changed = true;
				}
			}
		}while(changed);
		for (int i= 0; i< list.length; i++) {
			result[i]=list[i];
		}
		return result;
	}
}
