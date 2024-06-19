import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {

	public static void main(String[] args) throws ClassNotFoundException  {

		
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeeinfo","root","root");
				System.out.println("connection successful");
				con.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			
		}

}
