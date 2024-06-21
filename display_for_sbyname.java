import java.io.*;
import java.sql.*;

public class display_for_sbyname
{
	static String rows[][] = new String [100][7];

	static int row=0;
	public static void display2(String name) 
	{	  
	   try
	   {
		   System.out.println("display2");
		DAO db=new DAO();
		Connection conn=db.getConnection();
				
	    String selectQuery = "select * from  allrecord where name=?";
	    	    	    
	    PreparedStatement preparedStatement = 
		    	conn.prepareStatement(selectQuery);
		    preparedStatement.setString(1,name+"");

	    ResultSet result = preparedStatement.executeQuery();
	      	      
	    while (result.next())
        {	    	
			for (int i = 0; i < 7; i++)
				rows[row][i] =result.getString((i+1));
				row++;
			
	    }
	    //ViewCustomer.populateArray(rows);
	    new viev_one_user_for_sbyname().populateArray();
	  }
	  catch(Exception e)
	  {
		System.out.println(e);
	  }
	  
    }
	/*public static void main(String[] args) throws Exception 
	{
		display_for_sbyname.display2();
	}*/
}