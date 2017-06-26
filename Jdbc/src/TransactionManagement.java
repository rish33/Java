import java.sql.*;
import java.util.Scanner;
import java.io.*;

class TransactionManagement {
	public static void main(String args[]) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost/db", "root", "rishabh");
			con.setAutoCommit(false);

			PreparedStatement ps = con
					.prepareStatement("insert into user420 values(?,?)");

			Scanner sc = new Scanner(System.in);
			while (true) {

				System.out.println("enter id");
				int id = sc.nextInt();

				System.out.println("enter name");
				String name = sc.next();

				ps.setInt(1, id);
				ps.setString(2, name);
				ps.executeUpdate();

				System.out.println("commit/rollback");
				String answer = sc.next();
				if (answer.equals("commit")) {
					con.commit();
				}
				if (answer.equals("rollback")) {
					con.rollback();
				}

				System.out.println("Want to add more records y/n");
				String ans = sc.next();
				if (ans.equals("n")) {
					break;
				}

			}
			con.commit();
			System.out.println("record successfully saved");

			con.close();// before closing connection commit() is called
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}