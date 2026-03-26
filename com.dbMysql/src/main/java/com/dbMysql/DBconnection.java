package com.dbMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

	public static Connection getConnection() throws SQLException{
		
		String url = "jdbc:mysql://localhost:3306/demo";
		String root = "root";
		String pas = "Prasanna098_14";
		
		return DriverManager.getConnection(url,root,pas);
			
	}
}
