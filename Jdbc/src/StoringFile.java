import java.io.*;
import java.sql.*;

public class StoringFile {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost/db", "root", "rishabh");

			PreparedStatement ps = con
					.prepareStatement("insert into FILETABLE values(?,?)");

			File f = new File("/home/optimus-45/Downloads/new");
			FileReader fr = new FileReader(f);

			ps.setInt(1, 101);
			ps.setCharacterStream(2, fr, (int) f.length());
			int i = ps.executeUpdate();
			System.out.println(i + " records affected");

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}