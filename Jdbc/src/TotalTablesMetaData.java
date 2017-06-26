
import java.sql.*;

class TotalTablesMetaData {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost/optimus", "root", "rishabh");
			java.sql.DatabaseMetaData dbmd = con.getMetaData();

			java.sql.DatabaseMetaData total = con.getMetaData();
			String table[] = { "TABLE" };
			ResultSet rs = total.getTables(null, null, null, table);

			while (rs.next()) {
				System.out.println(rs.getString(3));
			}

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}