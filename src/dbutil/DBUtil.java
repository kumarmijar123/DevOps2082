
package dbutil;

import java.sql.*;

public class DBUtil {

	public static Connection getConnection()
	{
		Connection conn = null;
		try 
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/productmanagement_db", "root", "123@12Kumar");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public static void closeConnection(Connection conn)
	{
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
