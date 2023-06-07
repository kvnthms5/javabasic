//Program to find palindrome from list of numbers using method
package method;

import java.util.Scanner;

public class ArrayPalindrome {
	
	void Pal(int a) {
		int sum=0;
		int check=a;
		for (;a>0;) {
			int d=a%10;
			sum=(sum*10)+d;
			a=a/10;
		}
		if (check==sum)
			System.out.println(sum);
	}
	
	public static void main(String[] args) {
		ArrayPalindrome z= new ArrayPalindrome();
		Scanner s=new Scanner (System.in);
		System.out.print("Enter array size= ");		//Array size
		int arrl=s.nextInt();
		int arr[]=new int [arrl];
		System.out.println("Enter numbers to check if palindrome= ");		//Entering numbers to check
		for (int i=0;i<arrl;i++)
			arr[i]=s.nextInt();
		System.out.println();
		System.out.println("Palindrome numbers are:");
		for (int i=0;i<arrl;i++)
			z.Pal(arr[i]);		//Pal method outputs the Palindrome numbers
	}
}