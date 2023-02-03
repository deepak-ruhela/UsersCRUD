package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.pool.OracleDataSource;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con= null;
	PreparedStatement stmt=null;
	ResultSet rset=null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		try
		{
			OracleDataSource ods= new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:@10.0.21.33:1521:DEMO");
			con= ods.getConnection("MARK","mark");
			System.out.println("con Established in Auth");
			stmt= con.prepareStatement("select * from users where USERNAME=? and password=?");
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		try
		{
			if(con!=null)
			{
				con.close();
			}
			if(stmt!=null)
			{
				stmt.close();
			}
			if(rset!=null)
			{
				rset.close();
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String strUnm= request.getParameter("txtEmail");
		String strPwd= request.getParameter("txtPwd");
		try
		{
		stmt.setString(1, strUnm);
		stmt.setString(2, strPwd);
		rset=stmt.executeQuery();
		if(rset.next())
		{
			System.out.println("true");
			 response.sendRedirect("index.jsp");
			
		}
		else
		{
			System.out.println("false");
			response.sendRedirect(request.getContextPath()+"/Signup.jsp");
		}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
