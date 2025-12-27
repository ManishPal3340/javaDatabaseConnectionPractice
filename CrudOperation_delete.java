package myDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CrudOperation_delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Registration Load Driver
		// Create  Connetion 
		// Create Stamtement
		//Execute Query
		//Conection close
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//1
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Slooze", "root","root");//2
			System.out.println("COnnetion done");
			
			Statement smt=conn.createStatement();//3
			
			
			   smt.executeUpdate("Delete from  demo1011 where std_id='101'");//4
	           System.out.println("Delete the data");
	           
	           conn.close();//5
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
