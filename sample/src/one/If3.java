package one;

import java.util.Scanner;

public class If3 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number to check if even= ");
		int a=s.nextInt();
		if (a%2==0)
			System.out.print(a+" is even");
		else
			System.out.print(a+" is not even");
	}

}
