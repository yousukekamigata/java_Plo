package java“ü–åŽÀ‘H•Ò3;
import java,io.*;
import java.io.FileWriter;

public class Main91 {

	public static void main(String[] args) throws IOException{
		FileWriter fw=new FileWriter("c:\\rpgsave.dat",true);
		
		fw.write('A');
		fw.flush();
		fw.close();
		
	}

	}

}
