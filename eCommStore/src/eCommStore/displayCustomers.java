package eCommStore;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class displayCustomers extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException
		{
			try
			{
				Connection con = dbConnect.initiateDBConnect();
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery("select * from customer");
				PrintWriter pw = response.getWriter();
				String rslt = "";
				while(rs.next())
				{
					rslt = "Customer ID: "+rs.getInt("cust_ID")+ " "+"Customer name: "+rs.getString("Name")+ " "+"City: "+rs.getString("City")+" "+"Mobile Number: "+rs.getString("Mobile_no");
					pw.println("<br>"+rslt+"<br>");
				}
			}
			catch(Exception e)
			{
				
			}
		}
	

}
