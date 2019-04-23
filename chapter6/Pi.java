//6.14
package chapter6;

public class Pi {
	public static void main(String[] args) {
		//Print header
	    System.out.printf("%-20s%-20s\n", "i", "p(i)");
	    //Loop calculation
	    for (int i = 1; i <= 1000; i += 100)
	      System.out.printf("%-20d%-20.4f\n", i, p(i));
	  }

	  public static double p(int i) {
	    double pi = 0;
	    double sign = 1;
	    
	    for (int j = 1; j <= i; j++) {
	      pi += sign / (2 * j - 1.0);
	      
	      //Switch sign every loop
	      sign = -1 * sign;
	    }

	    return 4 * pi;
	  }
}
