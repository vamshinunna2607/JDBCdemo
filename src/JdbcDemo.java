import java.sql.*;
public class JdbcDemo {

	public static void main(String[]args) throws ClassNotFoundException, SQLException
	{
		String url = "jdbc:mysql://localhost:3306//student";
		String uname = "root";
		String pass ="";
		String query = "select username from student where userid = 1;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, uname, pass);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString("username");
		System.out.println(name);
		st.close();
		conn.close();
		
	}
}
