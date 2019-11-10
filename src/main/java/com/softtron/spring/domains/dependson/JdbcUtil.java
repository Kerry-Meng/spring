package com.softtron.spring.domains.dependson;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {
	public static Connection conn;
	static {
		System.out.println("数据库连接...");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/pinmao?serverTimezone=UTC";
			String username = "root";
			String password = "123456";
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
