import java.sql.*;
import java.sql.ResultSet;

class ConnectingToMySQL {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost/optimus", "root", "rishabh");

			Statement stmt = con.createStatement();
			ResultSet rs = (ResultSet) stmt.executeQuery("select * from Dept");
			while (((java.sql.ResultSet) rs).next())
				System.out.println(((java.sql.ResultSet) rs).getInt(1) + "  "
						+ ((java.sql.ResultSet) rs).getString(2));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
