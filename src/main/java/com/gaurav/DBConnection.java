package com.gaurav;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	
	
	public static Connection DBConnect() throws SQLException, ClassNotFoundException {
//		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ytspringbootjdbc","root","root");
		
		return con;
	}

}
