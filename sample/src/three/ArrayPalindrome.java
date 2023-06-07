//Java Program to check if the array is palindrome
package three;

import java.util.Scanner;

public class ArrayPalindrome {
	
	public static void main(String[] args) {
		System.out.print("Enter length of array: ");
		Scanner s=new Scanner (System.in);
		System.out.println();
		int arrlen=s.nextInt();
		int last=arrlen-1;
		int c=0;
		int a[]=new int[arrlen];
		for (int i=0;i<arrlen;i++) {	//Array Initialization
			System.out.println("Enter number to add to array: ");
			a[i]=s.nextInt();			
		}

		for(int i=0;i<arrlen/2;i++) {	//Array checking
			if (a[i]==a[last]) {
				c++;	//Count added
			}
			last--;
		}
		if (c==arrlen/2)	//Check palindrome or not
			System.out.println("The array is Palindrome.");
		else
			System.out.println("The array is NOT Palindrome.");
	}
}