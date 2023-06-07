package one;

import java.util.Scanner;

public class If2 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three numbers= ");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d;
		if (a>b && a>c)
			System.out.print(a+" is the largest");
		else if (b>a && b>c)
			System.out.print(b+" is the largst");
		else if (c>a && c>b)
			System.out.print(c+" is the largest");
		else
			System.out.print(a+" is the largest");
	}

}
