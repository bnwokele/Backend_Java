package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;


public class DbConnection {

	//class for creating connection
		private static final String SCHEMA = "projects";
		private static final String USER = "projects";
		private static final String PASSWORD = "projects";
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
				throw new DbException(e);
				
			}
			
		}

}
