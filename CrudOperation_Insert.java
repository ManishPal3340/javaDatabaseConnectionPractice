package myDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CrudOperation_Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Registration Driver Load 
		// Create Connection 
		// create Statement
		// excute Query
		// Connection close

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//1
			Connection conn=DriverManager.getConnection("jdbc:mysql:// localhost:3306/slooze","root", "root");//2
			
			Statement smt=conn.createStatement();//3
			//smt.executeUpdate("insert into demo1011 values('105','Krishna')");//4
			smt.executeUpdate("insert into demo1011 values('106','krishna')");
			smt.executeUpdate("insert into demo1011 values('107','ajay')");
			smt.executeUpdate("insert into demo1011 values('108','Neha')");
			smt.executeUpdate("insert into demo1011 values('109','Shriya')");
			
			 
			System.out.println("Insert Data Done");
			
			
			conn.close();// 5
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
