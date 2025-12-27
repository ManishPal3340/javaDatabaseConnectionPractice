package myDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import java.sql.Connection;


public class CrudOperration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 Register Load Driver
		// 2 Create Connection;
		// 3 Create Statement;
		// 4 Execute Quries
		// 5 Close Connection;
	
		
		
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");// 1 Step
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/slooze","root","root");// 2 Create Connection
			
			System.out.println("Connection Done");
			//Statement st=con.createStatement();
			//	st.execute(qur);
			//System.out.println("Table created .");
			

			Statement smt=conn.createStatement();
			 
			//smt.execute("create table demo1011 (std_id varchar(20) primary key,std_name varchar(20))");
			
           System.out.println("Table created .");
           
           // intsert
           //smt.executeUpdate("insert into demo1011 values('101','Manish')");
           ///smt.executeUpdate("insert into demo1011 values('102','Shivam')");
           //smt.executeUpdate("insert into demo1011 values('103','Rajan')");
           //smt.executeUpdate("insert into demo1011 values('104','Yash')");
           //smt.executeUpdate("insert into demo1011 values('105','Krishna')");
                    
           
           System.out.println("Insert Data Done");
           
        // Read
           
           ResultSet rs=smt.executeQuery("Select* from  Demo1011");
           while(rs.next()) {
        	   System.out.println(rs.getString("std_id")+" "+rs.getString("std_name"));
           }
           
           System.out.println("Read the data ");
           
           
           // Delete 
           
        
			
			conn.close();



			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
