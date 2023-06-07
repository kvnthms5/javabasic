package jdbc;

import java.sql.*;

public class Test {
	
	void A() {
		try {
			Con1.con12();
			Statement stmt=Con1.con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from details");
			while (rs.next()) {
				System.out.println(rs.getString(1)+", "+rs.getString(2)+", "+rs.getInt(3));
			}
			Con1.con.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		t.A();
	}
}