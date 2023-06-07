package jdbc;

import java.util.Scanner;

import java.sql.*;

public class School {
	SchoolEncap se=new SchoolEncap();
	static Scanner s=new Scanner(System.in);
	String[] array={"English","Maths","Physics","Chemistry","Biology"};
	
	void register() {
		System.out.println("Teacher Registration: ");
		System.out.print("Enter name= ");
		se.setTname(s.next());
		System.out.print("Enter password= ");
		se.setTpass(s.next());
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select count(*) from teacher");
			int c=0;
			while(rs.next()) {
				c=rs.getInt("count(*)");
			}
			c++;
			PreparedStatement stmt1=con.prepareStatement("insert into teacher(ID,Password,Name)values('t"+c+"','"+se.getTpass()+"','"+se.getTname()+"')");
			stmt1.executeUpdate();
			System.out.println(se.getTname()+" registered succesfully.");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	void login() {
		int f1;
		do {
			f1=1;
			int f2=0;
			System.out.print("User ID= ");
			se.setUsername(s.next());
			System.out.print("Password= ");
			se.setPassword(s.next());
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("(select student.ID,student.Password,student.User_Type,student.name from student) union (select teacher.ID,teacher.Password,teacher.User_Type,teacher.name from teacher)");
				while(rs.next()) {
					if(se.getUsername().equals(rs.getString("ID")) && se.getPassword().equals(rs.getString("Password")) && rs.getInt("User_Type")==0) {
						System.out.println("Student Log-in Succefull. Welcome "+rs.getString("Name")+".");
						int f3=0;
						do {
							System.out.println("1. View Marks");
							System.out.println("2. Update Details");
							System.out.println("3. Log out");

							int ch1=s.nextInt();
							switch(ch1) {
								case 1:
									break;
									
								case 2:
									break;
									
								case 3:
									System.out.println("Logged out succesfully, "+rs.getString("Name")+".");
									f3=1;
									break;
									
								default:
									 System.out.println("Wrong input. Try again.");
									 continue;
							}
						}
						while(f3==0);
						f2=0;
						break;
					}
					
					else if(se.getUsername().equals(rs.getString("ID")) && se.getPassword().equals(rs.getString("Password")) && rs.getInt("User_Type")==1) {
						System.out.println("Teacher Log-in Succefull. Welcome "+rs.getString("Name")+".");
						se.setTid(se.getUsername());
						se.setTpass(se.getPassword());
						int f3=0;
						do {
							System.out.println("1. Add Student");
							System.out.println("2. Add Student Marks");
							System.out.println("3. View Student Marks");
							System.out.println("4. Update Student marks");
							System.out.println("5. Log out");
							int ch1=s.nextInt();
							switch(ch1) {
								case 1:
									System.out.print("Enter Student Name= ");
									se.setTname(s.next());
									System.out.print("Enter Student Password= ");
									se.setPassword(s.next());
									System.out.print("Enter Contact Number for Student= ");
									se.setNumber(s.nextInt());
									try {
										Class.forName("com.mysql.jdbc.Driver");
										Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
										Statement stmt1=con1.createStatement();
										ResultSet rs1=stmt1.executeQuery("select count(*) from student");
										int c=0;
										while(rs1.next()) {
											c=rs1.getInt("count(*)");
										}
										c++;
										PreparedStatement stmt2=con1.prepareStatement("insert into student(ID,Password,name,contact_number) values('lmc"+c+"','"+se.getPassword()+"','"+se.getTname()+"',"+se.getNumber()+")");
										stmt2.executeUpdate();
										con1.close();
									}
									catch(Exception e) {
										System.out.println(e);
									}
									System.out.println("Student "+se.getTname()+" added to records.");
									break;
									
								case 2:
									int f4=0;
									do {
										System.out.print("Enter Student ID= ");
										se.setSid(s.next());
										try { 
											Class.forName("com.mysql.jdbc.Driver");
											Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
											Statement stmt1=con1.createStatement();
											ResultSet rs1=stmt1.executeQuery("select ID,name from student");
											while(rs1.next()) {
												if (rs1.getString("ID").equals(se.getSid())) {
													f4=1;
													se.setSname(rs1.getString("Name"));
												}
											}
											con1.close();
										}
										catch(Exception e){
											System.out.println(e);
										}
										if (f4==0)
											System.out.println("Student does not exist. Try again.");
										}
									while (f4==0);
									

									System.out.println("Entering marks for "+se.getSname()+":");
									try {
										Class.forName("com.mysql.jdbc.Driver");
										Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
										PreparedStatement stmt1=con1.prepareStatement("insert into marklist(s_id,t_id)values('"+se.getSid()+"','"+se.getTid()+"')");
										stmt1.executeUpdate();
										for(int i=0;i<5;i++) {
											System.out.print(array[i]+"= ");
											PreparedStatement stmt2=con1.prepareStatement("update marklist set "+array[i]+"="+s.nextInt()+" where s_id='"+se.getSid()+"'");
											stmt2.executeUpdate();					
										}
										con1.close();							
									}
									catch(Exception e) {
										System.out.println(e);
									}
									System.out.println("Marks entered for "+se.getSname()+" succesfully.");
									break;
									
								case 3:
									int f5=0;
									do {
										System.out.print("Enter Student ID= ");
										se.setSid(s.next());
										try { 
											Class.forName("com.mysql.jdbc.Driver");
											Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
											Statement stmt1=con1.createStatement();
											ResultSet rs1=stmt1.executeQuery("select ID,name from student");
											while(rs1.next()) {
												if (rs1.getString("ID").equals(se.getSid())) {
													f5=1;
													se.setSname(rs1.getString("Name"));
												}
											}
											con1.close();
										}	
										catch(Exception e){
											System.out.println(e);
										}
										if (f5==0)
											System.out.println("Student does not exist. Try again.");
									}
									while(f5==0);
									System.out.println("Marks for "+se.getSname()+":");
									try {
										Class.forName("com.mysql.jdbc.Driver");
										Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
										Statement stmt1=con1.createStatement();
										ResultSet rs1=stmt1.executeQuery("select s_id,t_id,english,maths,physics,chemistry,biology from marklist where s_id='"+se.getSid()+"'");
										while (rs1.next()) {
											for(int i=0;i<5;i++) {
												System.out.println(array[i]+": "+rs1.getInt(array[i]));
											}
										}
										con1.close();							
									}
									catch(Exception e) {
										System.out.println(e);
									}
									break;
									
								case 4:
									int f6=0;
									int f7=0;
									do {
										System.out.print("Enter Student ID= ");
										se.setSid(s.next());
										try { 
											Class.forName("com.mysql.jdbc.Driver");
											Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
											Statement stmt1=con1.createStatement();
											ResultSet rs1=stmt1.executeQuery("select ID,name from student");
											while(rs1.next()) {
												if (rs1.getString("ID").equals(se.getSid())) {
													f6=1;
													se.setSname(rs1.getString("Name"));
												}
											}
											con1.close();
										}	
										catch(Exception e){
											System.out.println(e);
										}
										if (f6==0)
											System.out.println("Student does not exist. Try again.");
										
										try { 
											Class.forName("com.mysql.jdbc.Driver");
											Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
											Statement stmt1=con1.createStatement();
											ResultSet rs1=stmt1.executeQuery("select ID,name from marklist");
											while(rs1.next()) {
												if (rs1.getString("ID").equals(se.getSid())) {
													f7=1;
													se.setSname(rs1.getString("Name"));
												}
											}
											con1.close();
										}	
										catch(Exception e){
											System.out.println(e);
										}
										if (f7==0)
											System.out.println("Student marks not entered.");
									}
									while(f6==0); //CASE WRONG FROM HERE							
									System.out.println("Updating marks for "+se.getSname()+":");
									try {
										Class.forName("com.mysql.jdbc.Driver");
										Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
										for(int i=0;i<5;i++) {
											System.out.print(array[i]+"= ");
											PreparedStatement stmt1=con1.prepareStatement("update marklist set "+array[i]+"="+s.nextInt()+" where s_id='"+se.getSid()+"'");
											stmt1.executeUpdate();					
										}
										con1.close();							
									}
									catch(Exception e) {
										System.out.println(e);
									}
									System.out.println("Marks updated for "+se.getSname()+" succesfully.");									
									break;
									
								case 5:
									System.out.println("Logged out succesfully, "+rs.getString("Name")+".");
									f3=1;
									break;
									
								default:
									 System.out.println("Wrong input. Try again.");
									 continue;
							}
						}
						while(f3==0);
						f2=0;
						break;
					}
					else
						f2=1;
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
			if(f2==1) {
				f1=0;
				System.out.println("Incorrect User ID or Password.");
			}
		}
		while(f1==0);
	}
	
	public static void main(String[] args) {
		School sch=new School();
		int f=0;
			do {
			System.out.println("1.Register   2.Login");
			int ch=s.nextInt();
			switch(ch) {
				case 1:
					sch.register();
					break;
				case 2:
					sch.login();
					break;
				default:
					System.out.println("Wrong input.");
					continue;
			}
		}
		while(f==0);
	}

}
