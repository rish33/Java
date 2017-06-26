
import java.sql.*;
import java.io.*;

public class StoreImage {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost/db", "root", "rishabh");

			PreparedStatement ps = con
					.prepareStatement("insert into IMGTABLE values(?,?)");
			ps.setString(1, "image");

			FileInputStream fin = new FileInputStream(
					"/home/optimus-45/Downloads/newimg.jpg");
			ps.setBinaryStream(2, fin, fin.available());
			int i = ps.executeUpdate();
			System.out.println(i + " records affected");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}