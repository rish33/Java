import java.sql.*;
import java.sql.ResultSet;

class Resultset {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost/optimus", "root", "rishabh");

			Statement stmt = con.createStatement();
			ResultSet rs = (ResultSet) stmt.executeQuery("select * from Dept");
			rs.absolute(3);
			System.out.println(rs.getString(1) + " " + rs.getString(2));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
