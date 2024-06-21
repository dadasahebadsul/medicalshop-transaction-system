import java.io.*;
import java.sql.*;

public class UpdateDatabaseRecords 
{
	public static void update(String id,String name,String companyname,String price,String quantity,String ex_date,String mfg_date) 
	{	   	
	 try
	  {
		DAO db=new DAO();
		Connection conn=db.getConnection();
				
 	
	   	   
		String selectquery = "update allrecord set name=?,companyname=?,price=?,quantity=?,ex_date=?,mfg_date=? where id=?";

		PreparedStatement pstmt = null;
		pstmt = conn.prepareStatement(selectquery);

		pstmt.setString(1, name);
		
		pstmt.setString(2,companyname);
		
		pstmt.setString(3,price);
		
		pstmt.setString(4,quantity);
		
		pstmt.setString(5,ex_date);
		
		pstmt.setString(6,mfg_date);

		pstmt.setString(7,id+"");
				
		int count = pstmt.executeUpdate();
		
		if(count==0)		
   		   System.out.println("No Recored Found with ID= "+id);
		else
			System.out.println("Record Id "+id+ " Data Successfully Updated !!!");
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
  }
}
