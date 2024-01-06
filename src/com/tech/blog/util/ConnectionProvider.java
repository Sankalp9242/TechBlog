package com.tech.blog.util;

import java.sql.*;

public class ConnectionProvider {
	
	static
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e)
			{

			e.printStackTrace();
		}
	}
    private static Connection con;

    public static Connection getConnection() {
        try {
            
            if (con == null) {
            
                //create a connection..
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techBlog", "root", "Sankalp@9242");
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

}
