package com.ccteam.factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static Connection connection;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","mysql");
			System.out.println("Connection Created........");	
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return connection;
	}
	public static void close() {
		try {
			connection.close();
			System.out.println("Connection closing.........");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
