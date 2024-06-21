import java.io.*;
import java.sql.*;

public class DisplyAllRecords 
{
	static String rows[][] = new String [100][7];

	static int row=0;
	public static void display(String id) 
	{	  
	   try
	   {
		DAO db=new DAO();
		Connection conn=db.getConnection();
		
		
				
	    String selectQuery = "select * from  allrecord where id=?";
	    	    	    
	    PreparedStatement preparedStatement = 
	    	conn.prepareStatement(selectQuery);
	    preparedStatement.setString(1,id+"");

	    ResultSet result = preparedStatement.executeQuery();
	      	      
	    while (result.next())
        {	    	
			for (int i = 0; i < 7; i++)
				rows[row][i] =result.getString((i+1));
				row++;
			
	    }
	    //ViewCustomer.populateArray(rows);
	    ViewOneUser.populateArray();
	  }
	  catch(Exception e)
	  {
		System.out.println(e);
	  }
	  
    }
	/*public static void main(String[] args) throws Exception 
	{
		DisplyAllRecords.display(String id);
	}*/
}
