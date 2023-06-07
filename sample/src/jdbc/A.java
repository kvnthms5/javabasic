package jdbc;

import java.util.Scanner;

import java.sql.*;

public class A {
	static Scanner s=new Scanner(System.in);
	String name;
	String dep;
	
	void Add() {
		System.out.println("Enter name, department:" );
		name=s.next();
		dep=s.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
			PreparedStatement stmt=con.prepareStatement("insert into student(name,department) values('"+name+"','"+dep+"')");
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
		name=s.next();
		dep=s.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
			PreparedStatement stmt=con.prepareStatement("delete from student where name='"+name+"' AND department='"+dep+"'");
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
		int id=s.nextInt();
		System.out.println("Update name, department: ");
		name=s.next();
		dep=s.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
			PreparedStatement stmt=con.prepareStatement("update student set name='"+name+"', department='"+dep+"' where id='"+id+"'");
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
		A a=new A();
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
