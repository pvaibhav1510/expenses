package com.expenses.app.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.expenses.app.models.User;
import com.mysql.jdbc.PreparedStatement;

public class SqlExecutor {

	private DBConnector dbc;
	private Connection conn;

	public SqlExecutor() {
		this.dbc = new DBConnector();
	}

	public void execute(String sql) throws Exception {
		try {
			conn = dbc.openConnection();
			Statement statement = conn.createStatement();
			System.out.println(sql + ": " + statement.execute(sql));
			statement.close();
		} finally {
			dbc.closeConnection(conn);
		}
	}

	public User getTable(String tableName, Long id) throws Exception {
		try {
			conn = dbc.openConnection();
			String sql = "select * from ? where id=?";
			PreparedStatement statement = (PreparedStatement) conn
					.prepareStatement(sql);
			statement.setString(1, tableName);
			statement.setLong(2, id);
			ResultSet res = statement.executeQuery();

			return new User()//
					.id(res.getLong("id"))//
					.email(res.getString("email"))//
					.passHash(res.getString("password"));

		} finally {
			dbc.closeConnection(conn);
		}
	}

	public static void main(String[] args) throws Exception {
		SqlExecutor sql = new SqlExecutor();

		User user = sql.getTable("users", 1l);
		System.out.println(user.toString());
	}
}
