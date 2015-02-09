package javaTEST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mondai1 {
	public static void main(String[] args) throws IOException {
		// InputStreamReaderのオブジェクトを生成
		InputStreamReader isr = new InputStreamReader(System.in);
		// BufferedReaderのオブジェクトを生成
		BufferedReader br = new BufferedReader(isr);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append(i * 1).append(" ");
		}
		String s = sb.toString();
		String[] a = s.split(" ");
	}

}
