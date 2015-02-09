package java“ü–åŽÀ‘H•Ò3;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main93 {

	public static void main(String[] args) throws IOException{
		FileOutputStream fos=
		new FileOutputStream("rpgsave.dat",true);
		fos.write(65);
		fos.flush();
		fos.close();

	}

}
