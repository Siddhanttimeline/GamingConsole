package siddhant;
import java.sql.*;

public class cp {
	static Connection con;
	public static Connection getCon() throws ClassNotFoundException, SQLException
	{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user = "root";
			String password = "Sid@020494";
			String url = "jdbc:mysql://localhost:8433/db1";
			Connection con = DriverManager.getConnection(url,user,password);
			return con;
	}
}