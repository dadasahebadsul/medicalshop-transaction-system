import java.io.*;
import java.sql.*;

public class InsertIntoDatabase
{
	public static void insert(String id,String name,String company,String price,String quantity,String ex_date,String mfg_date)
	
	{
	 try
	  {
		DAO db=new DAO();
		Connection conn=db.getConnection();

 	   

	    String insertQuery = "insert into allrecord values(?,?,?,?,?,?,?)";

	    PreparedStatement preparedStatement;

	    preparedStatement = conn.prepareStatement(insertQuery);
	    preparedStatement.setString(1,id+"");
	    preparedStatement.setString(2,name+"");
	    preparedStatement.setString(3,company+"");
	    preparedStatement.setString(4,price+"");
	    preparedStatement.setString(5,quantity+"");
	    preparedStatement.setString(6,ex_date+"");
	    preparedStatement.setString(7,mfg_date+"");

	    preparedStatement.executeUpdate();

	    System.out.println("Data  Successfully Inserted !!!");
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
  }
}





