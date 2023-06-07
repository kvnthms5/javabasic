package one;

import java.util.Scanner;

public class If4 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to check if odd= ");
		int a=s.nextInt();
		if (a%2==0)
			System.out.print(a+" is not odd");
		else
			System.out.print(a+" is odd");
	}
}
