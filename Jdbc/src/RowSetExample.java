import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetExample {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		// Creating and Executing RowSet
		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
		rowSet.setUrl("jdbc:mysql://localhost/db");
		rowSet.setUsername("root");
		rowSet.setPassword("rishabh");

		rowSet.setCommand("select * from user420");
		rowSet.execute();

		while (rowSet.next()) {

			System.out.println("Id: " + rowSet.getString(1));
			System.out.println("Name: " + rowSet.getString(2));

		}

	}
}