package milan.lab.report;

import java.sql.*;

class JDBC5 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bca_third_2020?serverTimezone=UTC";
			String un = "root";
			String pw = "";
			Connection cn = DriverManager.getConnection(url, un, pw);
			deleteAll(cn);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void deleteAll(Connection cn) throws SQLException {
		Statement stat = cn.createStatement(); // statment create

		String query = "delete from student";
		stat.executeUpdate(query); // execute query

		System.out.println("All Record deleted!");
	}
}
