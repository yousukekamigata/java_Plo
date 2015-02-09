package javaì¸ñÂé¿ëHï“3C10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class List12Å[6 {
	public static void main(String[] args) {
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = null;
		try {

			con = DriverManager.getConnection("jdbc:h2:~/rpgdb");
			con.setAutoCommit(false);
			con.commit();
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			} finally {
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e3) {
						e3.printStackTrace();
					}
				}
			}
		}
	}

}
