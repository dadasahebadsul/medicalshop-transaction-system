import java.io.*;
import java.sql.*;

public class DeleteFromDatabase 
{
	public static void delete(String id) 
	{	   	
	 try
	  {
		DAO db=new DAO();
		Connection conn=db.getConnection();
				
 	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   
	  ;
	   	   
	    String deleteQuery = "delete from allrecord where id=?";
		PreparedStatement preparedStatement;
		
		preparedStatement = conn.prepareStatement(deleteQuery);
		preparedStatement.setString(1,id+"");
			
		int count = preparedStatement.executeUpdate();
		
		if(count==0)		
   		   System.out.println("No Recored Found with ID= !!!"+id);
		else
		   System.out.println("Total "+count + " Records Deleted !!!");
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
  }
}
