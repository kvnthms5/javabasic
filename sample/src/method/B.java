package method;

public class B extends A {
	
	void hidea() {
		System.out.println("This is hidden from 'A");
	}
	
	void A() {
		System.out.println("This is not showing");
		
	}

	public static void main(String[] args) {
		B z=new B();
		z.hidea();
		z.show();
	}

}