package java������H��3;
import java.io.FileReader;
import java.io.IOException;
public class Main92 {

	public static void main(String[] args) throws IOException{
		FileReader fw=new FileReader("rpgsave.dat");
		System.out.println("���ׂẴf�[�^��ǂ�ŕ\�����܂�");
		int i=fw.read();
		while(i !=-1){
			char c=(char)i;
			System.out.print(c);
			i=fw.read();
		}
		System.out.println("�t�@�C���̖����ɓ��B���܂���");
		fw.close();

	}

}
