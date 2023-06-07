package method;

public class Class4 {
	
	String name="Kevin thomas";
	int age=20;
	
	void show() {
		String name="Kev";
		System.out.println(name);
		System.out.println(this.name);
		int age=10;
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(age);
	}

	public static void main(String[] args) {
		Class4 s=new Class4();
		s.show();
	

	}
	
}
