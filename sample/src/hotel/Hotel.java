package hotel;

public class Hotel {
	
	public static void main(String[] args) {
		 Chef rohan=new Chef();
		 Chef kevin=new Chef();
		 Dish nv=new Nonveg();
		 Dish v=new Veg();
		 System.out.print("Rohan cooks: ");
		 rohan.cooking(nv);
		 System.out.println();
		 System.out.print("Kevin cooks: ");
		 kevin.cooking(v);
		 
	}

}
