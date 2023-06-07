package method;

public class Class2  extends Class{
	
	void B() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		Class2 s=new Class2();
//		s.B();
/*		Class t=new Class();
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c); */
		s.A();
	}

}
