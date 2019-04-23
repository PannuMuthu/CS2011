package chapter3;
import java.util.Scanner;

public class dayOfWeek {
	public static void main(String[] args) {
		//Input setup and variable prompt
		Scanner input=new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = input.nextInt();
		System.out.println("Enter Month: ");
		int month = input.nextInt();
		System.out.println("Enter Day of Month: ");
		int day = input.nextInt();
		
		//Variables used for Zeller's Conjecture.
		int j = year/100;
		int century = year % 100;
		int mFrac = 26*(day+1)/10;
		int weekDay = day + mFrac + century + (century/4)+(j/4)+5*j;
		
		//Switch for output
		switch (weekDay % 7) {
			case 0: System.out.println(day+"/"+month+"/"+year+" is Saturday"); break;
			case 1: System.out.println(day+"/"+month+"/"+year+" is Sunday"); break;
			case 2: System.out.println(day+"/"+month+"/"+year+" is Monday"); break;
			case 3: System.out.println(day+"/"+month+"/"+year+" is Tuesday"); break;
			case 4: System.out.println(day+"/"+month+"/"+year+" is Wednesday"); break;
			case 5: System.out.println(day+"/"+month+"/"+year+" is Thursday"); break;
			case 6: System.out.println(day+"/"+month+"/"+year+" is Friday");
		}
	}
}
