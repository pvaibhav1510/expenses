package com.expenses.app.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnector {

	public Connection openConnection() throws ClassNotFoundException,
			SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/expenses_app";
		Connection conn = DriverManager.getConnection(url, "root", "");
		return conn;
	}

	public void closeConnection(Connection conn) throws SQLException {
		conn.close();
	}

}
