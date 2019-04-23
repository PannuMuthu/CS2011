package chapter6;
import java.util.Scanner;

public class hexToDecimal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the hexadecimal value: ");
		String hex = input.nextLine();
		System.out.println("Decimal: " + getDecimal(hex));
	}
	public static int getDecimal(String hex){  
   		String digits = "0123456789ABCDEF";  
        hex = hex.toUpperCase();  
        int decimal = 0;  
        for (int i = 0; i < hex.length(); i++)  
            {  
                char c = hex.charAt(i);  
                int d = digits.indexOf(c);  
                decimal = 16*decimal + d;  
            }  
            return decimal;  
	}  
}