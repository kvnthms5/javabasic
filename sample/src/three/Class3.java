package three;

public class Class3 {
	String str1=" Method A";
	
	void A() {
		System.out.print("This is Class 3.");	
	}
	
	public static void main(String[] args) {
		Class2 b=new Class2();
		b.A();
		Class1 a=new Class1();
		a.A();
		Class3 c=new Class3();
		c.A();
}
}