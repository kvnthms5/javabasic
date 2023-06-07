package one;

public class subtraction {
	
	String one() {
		String a="I am";
		String b=" 123";
		return a+b;
	}
	
	String two() {
		String a="32";
		String b="1";
		return a+b;
	}
	
	public static void main(String[] args) {
		subtraction abc= new subtraction();
		String a=abc.one();
		System.out.println(a+" and "+abc.two());
	}

}
