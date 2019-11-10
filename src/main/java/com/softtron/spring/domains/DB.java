package com.softtron.spring.domains;

import java.util.Properties;

public class DB {
	
	private String username;
	private String password;
	private String driver;
	private String url;
	
	private Properties properties;
	
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public DB() {
		super();
	}
	
	public DB(String username, String password, String driver, String url) {
		super();
		this.username = username;
		this.password = password;
		this.driver = driver;
		this.url = url;
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
	public String toString() {
		return "DB [username=" + username + ", password=" + password + ", driver=" + driver + ", url=" + url + "]";
	}
	
}
