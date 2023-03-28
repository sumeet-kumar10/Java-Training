package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise8 {
	public static void main(String[] args) throws SQLException {

		Connection con = JDBCUtility.getConnection();

		Statement statement = con.createStatement();

		String createQuery = "create table details(FirstName varchar(255), LastName varchar(255))";
//		String deleteQuery = "drop table details";
		String insertQuery1 = "insert into details values('abc','xyz')";
		String insertQuery2 = "insert into details values('ahd','ajfd')";
		String insertQuery3 = "insert into details values('jkfd','jfdsho')";
		String insertQuery4 = "insert into details values(?,?)";

		// int create = statement.executeUpdate(createQuery);
		// int delete = statement.executeUpdate(deleteQuery);

		int insert1 = statement.executeUpdate(insertQuery1);
		int insert2 = statement.executeUpdate(insertQuery2);
		int insert3 = statement.executeUpdate(insertQuery3);
		// int insert4 = statement.executeUpdate(insertQuery4);

//		int empID = 3;
//		String EmployeeName = "ahdfl";
		PreparedStatement preparedStatement = con.prepareStatement(insertQuery4);
		preparedStatement.setString(1, "oijoi");
		preparedStatement.setString(2, "afasf");

		int insert5 = preparedStatement.executeUpdate();

		ResultSet rs = statement.executeQuery("select * from details");
		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2));
		}
		JDBCUtility.closeConnection(null, null);
	}
}
