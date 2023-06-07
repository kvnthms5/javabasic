package method;

public class C extends A {
	
	void hidea() {
		System.out.println("This is hidden from 'B'");
	}
	
	void A() {
		
	}

	public static void main(String[] args) {
		C z=new C();
		z.hidea();
		

	}

}