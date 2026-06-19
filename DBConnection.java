import java.sql.*;
public class DBConnection {
	private static String url = "jdbc:mysql://localhost:3306/employee";
	private static String user_name = "root";
	private static String pwd = "Gayu@2006";
	public static Connection getConnection() {
		try {
			return(DriverManager.getConnection(url,user_name,pwd));
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}

}
