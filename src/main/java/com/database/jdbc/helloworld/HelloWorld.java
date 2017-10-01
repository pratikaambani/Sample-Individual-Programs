package com.database.jdbc.helloworld;

import java.sql.*;

/**
 * The Class HelloWorld.
 */
public class HelloWorld {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws ClassNotFoundException the class not found exception
	 * @throws SQLException the SQL exception
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Loads the drive from the JDBC driver in Cache
		Class.forName("org.postgresql.Driver");
		// Creates connection with database with the credentials provided such as Database URL, username and password
		Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "admin");
		Statement createStatement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet resultSet = createStatement.executeQuery("select id from test");
		while (resultSet.next()) {
			Integer i = resultSet.getInt("id");
			System.out.println(i);
		}
		resultSet.close();
		connection.close();
	}
}
