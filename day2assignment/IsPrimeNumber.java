package week1.day2assignment;

import java.util.Iterator;
import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int n = scanner.nextInt();
		
		if(n<2)
		{
		
			System.out.println("The given number is less than 2 : Not a prime Number");
		}
		else {
			boolean isPrime = true;
			
		
		
	for (int i = 2; i < n; i++) {
		
		if(n%2==0) {
			 isPrime = false;
			break;
		
		}
	}
		if(isPrime) {
			
			System.out.println("The number is prime");
		}
		else {
			System.out.println("The number is not a prime");
			
		}
		}
		scanner.close();
	}
}
	
		




