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
 * Servlet implementation class SignupServlet
 */
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con= null;
	PreparedStatement stmt=null;
	ResultSet rset=null;
       
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
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

			stmt= con.prepareStatement("insert into users values(?,?,?,?)");
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String strUsername = request.getParameter("txtUName");
		String strPassword = request.getParameter("txtPass");
		String strName = request.getParameter("txtName");
		String strEmail = request.getParameter("txtEmail");

		try {
			stmt.setString(1, strUsername);
			stmt.setString(2, strPassword);
			stmt.setString(3, strName);
			stmt.setString(4, strEmail);

stmt.executeUpdate();
	response.sendRedirect(request.getContextPath()+"/Login.jsp");



}catch(SQLException e)
{
	e.printStackTrace();
}
}
}
