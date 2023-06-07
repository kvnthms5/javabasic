package one;

public class addition {
	
	void sum() {
		int a=2;
		int b=3;
		int c=a+b;
		System.out.println("Addition = "+c);
	}
	
	void div() {
		int a=8;
		int b=2;
		int c=a/b;
		System.out.println("Division = "+c);
	}
	
	int sub() {
		int a=7;
		int b=5;
		int c=a-b;
		return c;
	}
	
	String str() {
		String a="hello";
		String b=" 123";
		System.out.println(a);
		return (a+b);
		
	}
	
	public static void main(String[] args){
		addition abc=new addition();
		addition abc1=new addition();
		abc.sum();
		abc.div();
		int c=abc1.sub();
		System.out.println("Subtraction = "+c);
		System.out.println(abc1.str());
	}

}
