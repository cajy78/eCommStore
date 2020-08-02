package eCommStore;
import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;

public class dbConnect{
	
//	private String db = "jdbc:mysql://localhost:3306/mydatabase01";

	protected static Connection initiateDBConnect()
		throws SQLException, ClassNotFoundException
	{
		Properties siteProp = new Properties();
		try
		{
			FileInputStream inp = new FileInputStream("C:\\Users\\cajy7\\git\\eCommStore\\eCommStore\\WebContent\\WEB-INF\\lib\\siteConfig.properties");
			siteProp.load(inp);
			inp.close();
			String driver = siteProp.getProperty("jdbc.driver");
			if (driver != null) {
			    Class.forName(driver) ;
			}
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		String url = siteProp.getProperty("db.mysql");
		String username = siteProp.getProperty("db.username");
		String password = siteProp.getProperty("db.pwd");

		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
}
