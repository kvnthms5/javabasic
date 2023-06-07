package three;

import java.util.Scanner;

public class StringcompareTo {
		
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 'a'= ");
		String a=s.next();
		System.out.print("Enter 'b'= ");
		String b=s.next();
		System.out.println(a.compareTo(b));
	}
}