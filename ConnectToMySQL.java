import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectToMySQL {
	private static String USERNAME = "root";
	private static String PASSWORD = "nguyen00";
	Connection con = null;
	public static Connection connectToDB(String dbName) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" +dbName, USERNAME, PASSWORD);
		return con;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
}
