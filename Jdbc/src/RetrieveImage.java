import java.sql.*;
import java.io.*;

public class RetrieveImage {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost/db", "root", "rishabh");

			PreparedStatement ps = con
					.prepareStatement("select * from IMGTABLE");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {// now on 1st row

				Blob b = rs.getBlob(2);// 2 means 2nd column data
				byte barr[] = b.getBytes(1, (int) b.length());// 1 means first
																// image

				FileOutputStream fout = new FileOutputStream(
						"/home/optimus-45/Downloads/newimg1.jpg");
				fout.write(barr);

				fout.close();
			}// end of if
			System.out
					.println("The image  is successfully retrieved from database and stored at specified location");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}