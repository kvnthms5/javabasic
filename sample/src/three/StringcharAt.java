package three;

import java.util.Scanner;

public class StringcharAt {
		
	public static void main(String[] args) {
		StringcharAt z=new StringcharAt();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter word= ");
		String a=s.next();
		System.out.print("Enter position= ");
		int b=s.nextInt();
		System.out.println("Position "+b+" has "+a.charAt(b));
	}
}