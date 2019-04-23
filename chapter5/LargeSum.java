//5.35
package chapter5;

public class LargeSum {

	public static void main(String[] args) {
		System.out.println("This program will find the solution to the large sum in 5.35.");
		
		//Initialize looped calculations
		double answer = 0;
		for (int i = 1; i < 1001; i++) {
			answer += (1)/(Math.sqrt(i)+Math.sqrt(i+1));
		}
		
		//Print Output
		System.out.println("The answer is "+ answer);
	}

}
