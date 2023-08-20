package recipes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import recipes.exception.DBException;

public class DBConnection {
	
	//class for creating connection
	private static final String SCHEMA = "recipes";
	private static final String USER = "recipes";
	private static final String PASSWORD = "recipes";
	private static final String HOST = "localhost";
	private static final int PORT = 3306;
	
	public static Connection getConnection() {
		// replaces %values with the parameters in order
		String url = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false"
				,HOST, PORT, SCHEMA, USER, PASSWORD);
		
		System.out.println("connecting with url=" + url);
		
		// return a connection
		// create a connection by asking DriverManager, which is class in the JDBC library, to give a connection
		
		try {
			Connection conn = DriverManager.getConnection(url);
			System.out.println("Successfully obtained connection!");
			return conn;
		} catch (SQLException e) {
			System.out.println("Getting an Error.");
			throw new DBException(e);
			
		}
		
	}
	

}
