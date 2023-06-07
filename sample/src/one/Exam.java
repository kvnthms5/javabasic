package one;

class Exam {
	String name="Kevin"; //instance variable

	void A() {
		String name="Arooooo";
		String name1="Thomas"; //local variable initialization
		System.out.println(name1);
		System.out.println(name);
		
	}
	
	void B() {
		System.out.println(name); //output instance variable
	}
	
	public static void main(String[] args) {
		Exam a=new Exam();
		a.A();
		a.B();
	}
}