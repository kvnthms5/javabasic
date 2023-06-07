package company;

public class Company {
	static Employee e=new Employee();
	
	public static void main(String[] args) {
		System.out.println(e.getDomain());
		e.setDomain("Python");
		System.out.println(e.getDomain());
//		System.out.println(e.name);
//		System.out.println(e.domain);
//		System.out.println(e.designation);
	}
}