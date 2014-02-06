package testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class TestJDBC {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection dbcon = null;
		String dbuser = "root";
		String dbPass = "thealamo";
		String dbName = "blogdb";
		String d;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/" + dbName;
			dbcon = DriverManager.getConnection(url, dbuser, dbPass);
		
			Statement s = dbcon.createStatement();
			s.executeQuery("show databases;");
			ResultSet rs = s.getResultSet();
			
			int i = 1;
			while (rs.next()){
				System.out.println(rs.getString(i));
			}
			
		} catch (Exception e) {
			
		
		} finally {
			
		}
		
		
	}

}

