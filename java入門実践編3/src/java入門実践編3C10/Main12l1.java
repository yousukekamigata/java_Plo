package java������H��3C10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main12l1 {
	public static void main(String[] args) throws Exception {
		// STEP0:���O����(JAR�z�u���܂�)
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection con = null;
		try {
			// STEP1:�f�[�^�x�[�X�̐ڑ�
			con = DriverManager.getConnection("jdbc:h2:~/rpgdb");
			// STEP2:SQL���M����

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// STEP3:�f�[�^�x�[�X�̐ؒf
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