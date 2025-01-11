package week1.day2assignment;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class PalindromeNumber {
	
	
public static void main (String[] args) {
	
	int input = 1221;
	int rem;
	int output =0;
	
	for (int i= input; i>0;i=i/10) {
		
		rem =i%10;
		output = output*10+rem;
		
	}
		
		if(output == input)
		{
			System.out.println("Given Number is Palindrome");
		}
		else
		{
			System.out.println("Given Number is not a palindrome");
		}
	
	}
	
	}


