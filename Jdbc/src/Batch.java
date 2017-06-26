import java.sql.*;

class Batch {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/db", "root", "rishabh");
		con.setAutoCommit(false);

		Statement stmt = con.createStatement();
		stmt.addBatch("insert into user420 values(6,'abhi')");
		stmt.addBatch("insert into user420 values(7,'umesh')");

		stmt.executeBatch();// executing the batch
		System.out.println("batch operation successful");

		con.commit();
		con.close();
	}
}