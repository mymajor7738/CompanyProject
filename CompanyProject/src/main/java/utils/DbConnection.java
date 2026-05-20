package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static void main(String[] args) {
	   System.out.println(new DbConnection().getDb());

	}
	public static Connection getDb()
	{
		String sql="jdbc:mysql://localhost:3306/company";
		String user="root";
		String password="1234";
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(sql, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("No Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("No Connection");
		}
		return conn;
		
	}

}
