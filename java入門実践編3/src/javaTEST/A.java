package javaTEST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
	public static void main(String[] args) throws IOException {
		// InputStreamReaderのオブジェクトを生成
		InputStreamReader isr = new InputStreamReader(System.in);
		// BufferedReaderのオブジェクトを生成
		BufferedReader br = new BufferedReader(isr);

		String line = br.readLine();
		String[] array = line.split(".");

	}
}