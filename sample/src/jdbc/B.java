package jdbc;

import java.util.Scanner;

import java.sql.*;

public class B {
	static Scanner s=new Scanner(System.in);
	Encap e=new Encap();
	
	void Add() {
		System.out.println("Enter name, department:" );
		e.setName(s.next());
		e.setDep(s.next());
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
			PreparedStatement stmt=con.prepareStatement("insert into student(name,department) values('"+e.getName()+"','"+e.getDep()+"')");
			int i=stmt.executeUpdate();
			System.out.println(i+" record inserted.");
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	void Remove() {
		System.out.println("Enter name, department: ");
		e.setName(s.next());
		e.setDep(s.next());
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
			PreparedStatement stmt=con.prepareStatement("delete from student where name='"+e.getName()+"' AND department='"+e.getDep()+"'");
			int i=stmt.executeUpdate();
			System.out.println(i+" record deleted.");
			con.close();			
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
	
	void update() {
		System.out.println("Enter student id: ");
		e.setId(s.nextInt());
		System.out.println("Update name, department: ");
		e.setName(s.next());
		e.setDep(s.next());
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
			PreparedStatement stmt=con.prepareStatement("update student set name='"+e.getName()+"', department='"+e.getDep()+"' where id='"+e.getId()+"'");
			int i=stmt.executeUpdate();
			System.out.println(i+" record updated.");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
	
	void view() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM school.student");
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		B a=new B();
		int e=0;
		do {
			System.out.println("1.Add Student  2.Remove Student  3.Update  4.View Record  5.Exit");
			int ch=s.nextInt();
			switch(ch) {
				case 1:
					a.Add();
					break;
				case 2:
					a.Remove();
					break;
				case 3:
					a.update();
					break;					
				case 4:
					a.view();
					break;				
				case 5:
					System.out.println("Exited.");
					e=1;
					break;				
				default:
					System.out.println("Wrong input.");
			}
		}
		while(e==0);
	}

}
