package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int n = 97;
	    int count = 0;
	     if (n <= 1)
		    count++;
	    for (int i = 2; i <= n / 2; i++) {
	      
	      if (n % i == 0) {
	        count++;
	      }
	    }

	    if ( count > 0)
	      System. out.println("The number is not prime");
	    else
	      System. out.println("The number is prime");
	  }
	
	

}
