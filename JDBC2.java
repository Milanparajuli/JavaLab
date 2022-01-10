package milan.lab.report;

import java.sql.*;

class JDBC2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bca_third_2020?serverTimezone=UTC";
			String username = "root";
			String password = "";
			Connection cn = DriverManager.getConnection(url, username, password);
			insert(cn);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void insert(Connection cn) throws SQLException {
		Statement stat = cn.createStatement(); // statement create

		String query = "insert into student (roll_no, name, course) values (6,'Milan', 'BCA')";
		stat.execute(query); // execute query
		System.out.println("Record inserted!");
	}
}