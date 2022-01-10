package milan.lab.report;

import java.sql.*;

class JDBC6 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bca_third_2020?serverTimezone=UTC";
			String un = "root";
			String pw = "";
			Connection cn = DriverManager.getConnection(url, un, pw);
			display(cn);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void display(Connection cn) throws SQLException {
		Statement stat = cn.createStatement(); // statement create

		String query = "select * from student";
		System.out.println("Reading records...");
		ResultSet rs = stat.executeQuery(query); // execute query
		while (rs.next()) {
			System.out.print("Roll NO: " + rs.getString("roll_no"));
			System.out.print(" Name: " + rs.getString("name"));
			System.out.print(" Course: " + rs.getString("course"));
			System.out.println("\n");
		}
	}
}
