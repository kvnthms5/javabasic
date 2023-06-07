package bankdetails;

import java.util.Scanner;

public class BankMenu {
	static Scanner s=new Scanner(System.in);
	Data d=new Data();
	
	int bankDetail(int check) {
		System.out.print("Name= ");
		d.setName(s.next());
		System.out.print("Account ID= ");
		d.setAccnum(s.nextInt());
		System.out.print("Bank Name= ");
		d.setBankname(s.next());
		System.out.print("IFSC Code= ");
		d.setIfcscode(s.next());
		System.out.println("Bank Details entered succesfully.");
		check=1;
		return check;		//returns check variable to check if bank details have been entered
	}
	
	void depositAmount() {
		System.out.print("Enter amount to deposit= ");
		int dep=s.nextInt();
		d.setBalance(d.getBalance()+dep);
		System.out.println("Dear "+d.getName()+", your account "+d.getAccnum()+" has been credited with rs. "+dep);
		System.out.println("Your balance now is rs. "+d.getBalance());	
		System.out.println();
	}
	
	void withdrawAmount() {
		for (int wch=0;wch==0;) {		//For loop loop till withdraw amount can be withdrawn. Minimum balance is rs. 1000
			System.out.print("Enter amount to withdraw= ");
			int wit=s.nextInt();
			if (d.getBalance()-wit>=1000) {		//If balance after withdrawal is not less than 1000, withdrawal will be succesful
				d.setBalance(d.getBalance()-wit);
				System.out.println("Dear "+d.getName()+", your account "+d.getAccnum()+" has been debited with rs. "+wit);
				System.out.println("Your balance now is rs. "+d.getBalance());
				System.out.println();
				wch=1;
			}
			else {		//If balance after withdrawal is less than 1000, show message and ask for withdrawal amount again
				System.out.println("Cannot withdraw rs. "+wit+" due to insufficeint balance.");
				System.out.println();
			}
		}
	}
	
	void balanceAmount() {
		System.out.println("Dear "+d.getName()+", your balance is rs. "+d.getBalance());		//Balance of user can be checked
		System.out.println();
	}
	
	public static void main(String[] args) {
		int ch=0;
		int z=0;
		BankMenu bm=new BankMenu();
		System.out.println("  WELCOME");
		System.out.println("-----------");
		do {
			System.out.println("1. Enter Bank Details");		//Menu that is repeated until user exits
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Balance Enquiry");
			System.out.println("5. Exit");
			System.out.println();
			System.out.print("Select Option: ");
			int o=s.nextInt();
			switch (o) {		//Switch for the user to select their option
				case 1:
					if (z==0) {
						ch=bm.bankDetail(ch);		//Entering users bank details
						System.out.println();
						z=1;
					}
					else {
						System.out.println("You have already entered your Bank Details.");
						System.out.println();
					}
					break;
				case 2:{
					if (ch!=1) {
						System.out.println("You need to enter Bank Details before continuing.");		//If user hasnt entered bank details before selecting option 2
						System.out.println();
						continue;
					}
					bm.depositAmount();		//Deposit method is called
					break;
				}
				case 3:
					if (ch!=1) {
						System.out.println("You need to enter Bank Details before continuing.");		//If user hasnt entered bank details before selecting option 3
						System.out.println();
						continue;
					}
					bm.withdrawAmount();		//Withdraw method is called
					break;
				
				case 4:
					if (ch!=1) {
						System.out.println("You need to enter Bank Details before continuing.");		//If user hasnt entered bank details before selecting option 4
						System.out.println();
						continue;
					}
					bm.balanceAmount();		//Balance Method is called
					break;				
				case 5:
					System.out.println("Thank you for using.");		//Thank you message when exiting
					ch=-1;
					break;
				
				default:
					System.out.println("Wrong input. Try again.");		//If user gives wrong input, give user another chance
					System.out.println();
					continue;
			}
		}
		while(ch>=0);		//ch only changes from 0 if user selects exit. Until then the loop will run.
	}
}
	