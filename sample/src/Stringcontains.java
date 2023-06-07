import java.util.Scanner;

public class Stringcontains {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 'a'= ");
		String a=s.next();
		System.out.print("Enter letter= ");
		String b=s.next();
		System.out.println(a.contains(b));
	}

}
