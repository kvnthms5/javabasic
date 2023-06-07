package three;

import java.util.Scanner;

public class Stringconcat {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 'a'= ");
		String a=s.next();
		System.out.print("Enter 'b'= ");
		String b=s.next();
		String c="abc";
		System.out.println(a.concat(b));


	}

}
