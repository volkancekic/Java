package com.vJdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {	

	public static void main(String[] args) {
		
		String jdbcUrl="jdbc:oracle:thin:@localhost:1521:xe";
		String user="hr";
		String pass="hr";
		
		Connection myConn;
		
		try {
			myConn = DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("Veritabaný Baglantisi Basarili");
		} catch (Exception e) {
			System.out.println("Veritabaný Baglanti Hatasi");		
		}

	}

}
