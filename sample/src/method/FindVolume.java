package method;

import java.util.Scanner;

public class FindVolume {

	void volume (int a) {
		System.out.println("Volume= "+(a*a*a));
	}
	
	void volume (int a, int b, int c) {
		System.out.println("Volume= "+(a*b*c));				
	}
	
	void volume (float a, int b) {
		System.out.println("Volume= "+(3.14*(a*a)*b));
	}
	
	void volume (float a) {
		System.out.println("Volume= "+(1.3333*3.14*(a*a*a)));		
	}
		
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		Test z=new Test();
		System.out.println("FIND THE VOLUME:");
		System.out.println("1. Cube  2. Cuboid  3. Cylinder  4. Sphere");
		int ch=s.nextInt();
		switch (ch) {
			case 1:
				System.out.println("Enter length= ");
				int l=s.nextInt();
				z.volume(l);
				break;
			case 2:
				System.out.println("Enter length, width, height= ");
				int l2=s.nextInt();
				int w2=s.nextInt();
				int h2=s.nextInt();
				z.volume(l2, w2, h2);
				break;
			case 3:
				System.out.println("Enter radius and height= ");
				float r3=s.nextInt();
				int h3=s.nextInt();
				z.volume(r3, h3);
				break;
			case 4:
				System.out.println("Enter radius= ");
				float r4=s.nextInt();
				z.volume(r4);
				break;
			default:
				System.out.println("WRONG INPUT!");	
		}
	}  
}
