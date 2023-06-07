package tcs;

public class Tcs {
	
	public static void main(String[] args) {
		Computer desk=new Desktop();
		Computer lap=new Laptop();
		Developer rohan=new Developer();
		rohan.devapps(desk);
		Developer kevin=new Developer();
		kevin.devapps(lap);
		Developer l3=new Developer();
		l3.devapps(desk);
		
	}

}
