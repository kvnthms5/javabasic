package jdbc;

import java.util.Scanner;

import java.sql.*;

public class BankDetail {
	static Scanner s=new Scanner(System.in);
	BankDetailEncap be=new BankDetailEncap();
	
	void register() {
		System.out.println("Name= ");
		be.setName(s.next());
		System.out.println("Account Number= ");
		be.setAccNum(s.nextInt());
		System.out.println("PIN= ");
		be.setPin(s.nextInt());
		System.out.println("IFSC Code= ");
		be.setIfsc(s.next());
		System.out.println("Bank= ");
		be.setBank(s.next());		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
			PreparedStatement stmt=con.prepareStatement("insert into customer(Acc_Num,Ifsc_Code,Bank,Name,Balance,Pin)values("+be.getAccNum()+",'"+be.getIfsc()+"','"+be.getBank()+"','"+be.getName()+"',"+1000+","+be.getPin()+")");
			int i=stmt.executeUpdate();
			System.out.println(i+" account added.");
			con.close();	
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	void login() {
		int z=0;
		while(z==0) {
			System.out.println("Account number= ");
			be.setAccNum(s.nextInt());
			System.out.println("PIN= ");
			be.setPin(s.nextInt());		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
				Statement stmt=con.createStatement();
//				ResultSet rs=stmt.executeQuery("SELECT * FROM customer where acc_num=567 AND pin=777");
				ResultSet rs=stmt.executeQuery("SELECT * FROM customer where acc_num='"+be.getAccNum()+"' AND pin='"+be.getPin()+"'");
				while (rs.next()) {
					if (be.getAccNum()==rs.getInt(1) && be.getPin()==rs.getInt(6)) {
						z=1;
						be.setBalance(rs.getInt(5));
						be.setName(rs.getString(4));
						System.out.println("Log-in succefull. Welcome "+rs.getString(4));
						int y=0;
						do {
							System.out.println("1. Deposit");
							System.out.println("2. Withrdraw");
							System.out.println("3. View Balance");
							System.out.println("4. Exit");
							int ch=s.nextInt();
							switch(ch) {
								case 1:
									this.deposit(be.getAccNum());
									break;
								case 2:
									this.withdraw(be.getAccNum());
									break;
								case 3:
									this.balance(be.getAccNum());
									break;
								case 4:
									y=1;
									System.out.println("Thank you for using, "+be.getName());
									break;
								default:
									System.out.println("Wrong input.");
							}
						}
						while(y==0);						
					}
					else {
						System.out.println("Log-in failed. Wrong Log-in ID or Password.");
						continue;
					}
				}
				con.close();	
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	void deposit(int id) {
		System.out.println("Enter amount to deposit= ");
		int m=s.nextInt();
		be.setBalance(be.getBalance()+m);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
			PreparedStatement stmt=con.prepareStatement("update customer set balance="+be.getBalance()+" where acc_num="+be.getAccNum());
			stmt.executeUpdate();
			System.out.println("Rs. "+m+" deposited.");
			con.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	void withdraw(int id) {
		int w=0;
		System.out.println("Enter amount to withdraw= ");
		do {
			int m=s.nextInt();
			if((be.getBalance()-m)>=1000) {
				be.setBalance(be.getBalance()-m);
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
					PreparedStatement stmt=con.prepareStatement("update customer set balance="+be.getBalance()+" where acc_num="+be.getAccNum());
					stmt.executeUpdate();
					System.out.println("Rs. "+m+" withdrawed.");
					con.close();
				}
				catch (Exception e) {
					System.out.println(e);
				}
				w=1;
			}
			else
				System.out.println("Minimum balance is Rs. 1000");
			continue;
		}
		while(w==0);		
	}
	
	void balance(int id) {
		System.out.println("Current balance is "+be.getBalance());		
	}
	
	public static void main(String[] args) {
		BankDetail a=new BankDetail();
		int f=0;
		do {
			System.out.println("1. Register");
			System.out.println("2. Login");
			int ch=s.nextInt();
			switch(ch) {
				case 1:
					a.register();
					break;				
				case 2:
					a.login();
					break;					
				default:
					System.out.println("Wrong input.");
					continue;
			}
		}
		while(f==0);
	}
}
