package method;

import java.util.*;

public class One {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Two a=new Two();
		Two b=new Two();

		System.out.println("Enter name, age, place, fav numbers:");
		a.setName(s.next());
		a.setAge(s.nextInt());
		a.setPlace(s.next());		
		System.out.println("Enter name,age, place, fav numbers:");
		b.setName(s.next());
		b.setAge(s.nextInt());
		b.setPlace(s.next());
	
		System.out.println("Info for first:");
		System.out.print(a.getName()+", "+a.getAge()+", "+a.getPlace()+", [");

		System.out.println("Info for second:");
		System.out.print(b.getName()+", "+b.getAge()+", "+b.getPlace());
		
	}

}
