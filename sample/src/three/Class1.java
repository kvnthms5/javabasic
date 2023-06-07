package three;

public class Class1 {
	String ans="Answer= ";
	String c="Hello";
	int b=98;
	
	void A() {
		int a=10;
		System.out.println(ans);
		System.out.println(a+b);
	}
	
	void B() {
		System.out.println(c);
	}
	
	public static void main(String[] args ) {
		Class1 a=new Class1();
		a.A();
		a.B();
		System.out.println(a.b+" + 2 = "+(a.b+2));
	}

}
