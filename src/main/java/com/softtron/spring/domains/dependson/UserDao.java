package com.softtron.spring.domains.dependson;

import java.sql.Connection;

public class UserDao {
	
	public static Connection connection;
	
	static {
		System.out.println("获取连接...");
		connection = JdbcUtil.conn;
	}

	
}
