
import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class display_expired_data
{
	static String rows[][] = new String [100][7];

	static int row=0;
	public static void display1() 
	{	  
	   try
	   {
		DAO db=new DAO();
		Connection conn=db.getConnection();
		
		  Date d1=new Date();
	       System.out.println(d1);
	       SimpleDateFormat f1=new SimpleDateFormat("dd MM yyyy");
	       String current_date=f1.format(d1);
	       System.out.println(current_date);
				
	    String selectQuery = "select * from  allrecord";
	    
	    SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
	    	    	    
	    PreparedStatement preparedStatement = 
	    	conn.prepareStatement(selectQuery);

	    ResultSet result = preparedStatement.executeQuery();
	      	      
	    while (result.next())
        {	    	
			String exp = result.getString(6);
			
			Date date1 = myFormat.parse(current_date);
    		Date date2 = myFormat.parse(exp);
    		long diff = date2.getTime() - date1.getTime();

			if(diff<0)
			{
				for (int i = 0; i < 7; i++)
				  rows[row][i] =result.getString((i+1));
				row++;
			}		
	    }
	    new ViewCustomer().populateArray(rows);
	    //ViewOneUser.populateArray();
	  }
	  catch(Exception e)
	  {
		System.out.println(e);
	  }
	  
    }
}