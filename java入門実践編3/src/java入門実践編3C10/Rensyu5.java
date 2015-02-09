package java“ü–åŽÀ‘H•Ò3C10;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Rensyu5 {

	public static void main(String[] args) throws IOException {
		Socket sock = new Socket("dokojava.jp", 80);
		InputStream is = sock.getInputStream();
		OutputStream os = sock.getOutputStream();
		os.write("GET/favicon.ico HTTP/1.o\r\n".getBytes());
		os.write("\r\n".getBytes());
		os.flush();
		InputStreamReader isr = new InputStreamReader(is);
		int i = isr.read();
		while (i != -1) {
			System.out.print((char) 1);
			i = isr.read();
		}
		sock.close();

	}

}
