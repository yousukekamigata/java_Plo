package java������H��3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Rensyu1 {
	public static void main(String[] args) throws IOException {

		// �N���p�����[�^�̎擾
		String orgPath = args[0];
		String prePath = args[1];
		System.out.println(orgPath + "\r\n��\r\n" + prePath + "\r\n�ɃR�s�[���܂��B");

		// �t�@�C���C���X�^���X�̐���
		System.out.println("�t�@�C���C���X�^���X�̐���");
		File orgFile = new File(orgPath);
		File preFile = new File(prePath);

		// �R�s�[���t�@�C����ǂ�
		FileInputStream fis	= new FileInputStream(orgFile);
		StringBuilder sb = new StringBuilder();
		System.out.println("�R�s�[���t�@�C����ǂ�");
		int i = fis.read();
		while (i != -1) {
			char c = (char) i;
			sb.append(c);
			i = fis.read();
		}
		fis.close();

		FileOutputStream fos	= new FileOutputStream(preFile);
		for (int j = 0; j < sb.length(); j++) {
			// �R�s�[��t�@�C���ɏ���
			fos.write(sb.charAt(j));
		}
		fos.flush();
		fos.close();
	}
}