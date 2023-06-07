package one;

import java.util.Scanner;

public class If1 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers= ");
		int a=s.nextInt();
		int b=s.nextInt();
		if (a>b)
			System.out.print(a+" is the largest number");
		if (b>a)
			System.out.print(b+" is the largest number");
		else
			System.out.print("Both are equal");
		
	}
	
}
