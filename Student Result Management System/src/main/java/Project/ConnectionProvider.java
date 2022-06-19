package Project;
import java.sql.*;
//public class ConnectionProvider {
////	private static Connection con = null;
//	static{
//	try {
//		Class.forName("com.mysql.jdbc.GoogleDriver");
////		con = DriverManager.getConnection();
//		Connection con = DriverManager.getConnection("jdbc:myql://localhost:3306/project1","root","12345678");		
//	}
//	
//		
//	catch (Exception e) {}
//	}
// public static Connection getCon(){
//	return con;
//}
//	}
public class ConnectionProvider{
	public static Connection getCon() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","12345678");
		return con;
		
	
	} catch (Exception e) {
		return null;
	}
	}
}