package one;

import java.util.Scanner;

public class Fact {
	
	public static void main(String[] args) {
		System.out.print("Enter number= ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int fact=1;
		System.out.print("Factorial= ");
		for (int i=n;i>=1;i--) {
			System.out.print(+i);
			if (i>1)
				System.out.print("x");
			else
				System.out.print("= ");
			fact=fact*i;
		}
		System.out.print(fact);
	}

}
