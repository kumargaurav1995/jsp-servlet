package com.package5.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class logindao {
	String url="jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false";
	String user="root";
	String pass="kskg1009@";
	String query="select * from studentinfo where name=? and age=?";
	public boolean check( String name,String age){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, pass);
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1, name);
			st.setString(2, age);
			ResultSet rs=st.executeQuery();
			if(rs.next()){
				return true;
			}
			else 
				return false;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
	}
	
	
}
