package one;

import java.util.Scanner;

public class Swaptwonum {
	
	public static void main(String[] args) {
		System.out.println("Enter two numbers a and b");
		Scanner s=new Scanner(System.in);
		System.out.print("a= ");
		int a=s.nextInt();
		System.out.print("b= ");
		int b=s.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a= "+a+" and b= "+b);
	}

}
