package com.softtron.spring.domains.beanfactorypostprocessor;

import org.springframework.beans.factory.FactoryBean;

public class DatabaseConnection implements FactoryBean<DatabaseConnection>{
	
	private String username;
	private String password;
	private String driver;
	private String url;
	private String DBinfo;
	
	public String getDBinfo() {
		return DBinfo;
	}

	public void setDBinfo(String dBinfo) {
		DBinfo = dBinfo;
	}

	@Override
	public String toString() {
		return "DatabaseConnection [username=" + username + ", password=" + password + ", driver=" + driver + ", url="
				+ url + "]";
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDriver() {
		return driver;
	}
	
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public DatabaseConnection getObject() throws Exception {
		DatabaseConnection dbConnection = new DatabaseConnection();
		String[] infos = DBinfo.split(",");
		for (int i = 0; i < infos.length; i++) {
			dbConnection.setUsername(infos[i]);
			dbConnection.setPassword(infos[i]);
			dbConnection.setDriver(infos[i]);
			dbConnection.setUrl(infos[i]);
		}
		return dbConnection;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
