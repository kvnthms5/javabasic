package college;

public class Lmc {
	
	public static void main(String[] args) {
		Cse c=new Cse();
		Mech m=new Mech();
		System.out.print("Roy teaches: ");
		Department roy=new Department();
		roy.teachduty(c);
		System.out.println();
		System.out.print("Joy teaches: ");
		Department joy=new Department();
		joy.teachduty(m);
			
	}

}
