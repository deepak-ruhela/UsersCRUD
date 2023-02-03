package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;


import oracle.jdbc.pool.OracleDataSource;

public class DBHandler {

	public DBHandler() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Connection getDBcon()
	{
		Connection con=null;
		try {
			OracleDataSource ods=new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:@10.0.21.33:1521:DEMO");
			con=ods.getConnection("MARK","mark");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return con;
	}
	
	public LinkedList<UsersBean> getUsersInfoTable()
	{
		LinkedList<UsersBean> lst= new LinkedList<>();
		Connection con=getDBcon();
		try {
			PreparedStatement stmt =con.prepareStatement("select * from users_info");
			ResultSet rset=stmt.executeQuery();
			
			
			while(rset.next())
			{
				String strId=rset.getString("Id");
				String strName=rset.getString("NAME");
				String strEmail=rset.getString("EMAIL");
				String strCountry=rset.getString("COUNTRY");
				
				UsersBean c1= new UsersBean(strId,strName,strEmail,strCountry);
				lst.add(c1);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}
	
	
	public LinkedList<UserDetailBean> getUserDetail(String id)
	{
		String strId=id;
		LinkedList<UserDetailBean> lst= new LinkedList<>();
		Connection con=getDBcon();
		try {
			PreparedStatement stmt =con.prepareStatement("select * from users_info where id='"+strId+"'");
			ResultSet rset=stmt.executeQuery();
			
			
			while(rset.next())
			{
				String strName=rset.getString("NAME");
				String strEmail=rset.getString("EMAIL");
				String strCountry=rset.getString("COUNTRY");
				
				UserDetailBean e1 = new UserDetailBean(strName, strEmail, strCountry);
				lst.add(e1);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}
	
}
