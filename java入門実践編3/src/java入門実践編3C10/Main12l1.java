package java入門実践編3C10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main12l1 {
	public static void main(String[] args) throws Exception {
		// STEP0:事前準備(JAR配置を含む)
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection con = null;
		try {
			// STEP1:データベースの接続
			con = DriverManager.getConnection("jdbc:h2:~/rpgdb");
			// STEP2:SQL送信処理

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// STEP3:データベースの切断
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}