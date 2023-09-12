package com.ecommerce.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	String sql="select * from signup where UserName=? and PassWord=?";
	String url="jdbc:mysql://localhost:3306/ecommerce";
	String username="root";
	String password="Root";
	public boolean check(String uname,String pass) throws SQLException {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			if(rs.next())
			{
				return true;
			}
		} catch (ClassNotFoundException e) {
			 e.printStackTrace();
		}
		return false;
	
	}

}
