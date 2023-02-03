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
 * Servlet implementation class AddUserServlet
 */
@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con= null;
	PreparedStatement stmt=null;
	ResultSet rset=null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserServlet() {
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
			stmt= con.prepareStatement("Insert into users_info(name,email,country) values(?,?,?)");
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String name = request.getParameter("txtName");
			String Email = request.getParameter("txtEmail");
			String Country = request.getParameter("txtCountry");
		//	String id = request.getParameter("txtId");

		//	stmt.setString(1, id);
			stmt.setString(1, name);
			stmt.setString(2, Email);
			stmt.setString(3, Country);

			stmt.executeUpdate();

			response.sendRedirect(request.getContextPath() + "/index.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
