package myDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CrudOperation_Read {

	public static void main(String[] arg) {
		// Registration Load Driver
				// Create  Connetion 
				// Create Stamtement
				//Execute Query
				//Conection close
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/slooze", "root","root");
			
			Statement smt=conn.createStatement();//3
			
			//smt.executeUpdate();
			
			ResultSet rs=smt.executeQuery("select* from Demo1011");
			while(rs.next()) {
				System.out.println(rs.getString("std_id")+" "+rs.getString("std_name"));
				
			}
			System.out.println("Read the data");
			
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
