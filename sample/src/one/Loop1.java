package one;

import java.util.Scanner;

public class Loop1 {
	
	public static void main(String[] args) {
		
		int l;
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number to check if Palindrome= ");
		int a=s.nextInt();
		int check=a;
		for (;a>0;) {
			l=a%10;
			sum=(sum*10)+l;
			a=a/10;
		}
		if (check==sum)
			System.out.println(check+" is Palindrome");
		else
			System.out.println(check+" is NOT Palindrome");
		
	}

}
