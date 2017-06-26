
import java.sql.*;

class PreaparedStatement {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost/optimus", "root", "rishabh");

			PreparedStatement stmt = con
					.prepareStatement("insert into Dept values(?,?)");
			stmt.setInt(1, 4);// 1 specifies the first parameter in the query
			stmt.setString(2, "Marketing");

			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}