package javaTEST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
	public static void main(String[] args) throws IOException {
		// InputStreamReader�̃I�u�W�F�N�g�𐶐�
		InputStreamReader isr = new InputStreamReader(System.in);
		// BufferedReader�̃I�u�W�F�N�g�𐶐�
		BufferedReader br = new BufferedReader(isr);

		String line = br.readLine();
		String[] array = line.split(".");

	}
}