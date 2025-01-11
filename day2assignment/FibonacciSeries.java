package week1.day2assignment;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//series of number in which each number is the sum of two preceding numbers.
		
		int n1 =0 ; int n2=1; int sum= 0;
		System.out.print(n1+ " " +n2);
		
		for (int i = 2; i < 8; i++) {
			
			sum = n1+n2;
			System.out.print(" "+sum);
			n1= n2;
			n2 = sum;
			
			
			
		}
		
		
}
}
