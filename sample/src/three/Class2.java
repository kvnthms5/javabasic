package three;

public class Class2 {
	int a=50;
	int b=10;
	int c=a+b;
	String str1="50 + 10 = ";
	
	void A() {
		System.out.println(str1+c);
	}
	
	void B() {
		int a=40;
		System.out.println(a/b);
	}
	
	public static void main(String[] arg) {
		Class2 a=new Class2();
		a.A();
		a.B();
		int b=a.a;
		System.out.println(b);
	}

}
