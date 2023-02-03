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
 * Servlet implementation class EditUserServlet
 */
@WebServlet("/EditUserServlet")
public class EditUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con= null;
	PreparedStatement stmt=null;
	ResultSet rset=null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditUserServlet() {
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
			stmt= con.prepareStatement("update users_info set name=?,email=?,country=? where id=?");
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
			String id = request.getParameter("txtId");
			System.out.println(id + "-------------------");
			stmt.setString(1, name);
			stmt.setString(2, Email);
			stmt.setString(3, Country);
			stmt.setString(4, id);
			stmt.executeUpdate();

			response.sendRedirect(request.getContextPath() + "/index.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
