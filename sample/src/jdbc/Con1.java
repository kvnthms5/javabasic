package jdbc;

import java.sql.*;

public class Con1 {
	
	static Connection con;
	static void con12() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");	
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}