package java������H��3;
import java.util.Iterator;
import java.util.Properties;
public class Main73 {

	public static void main(String[] args) {
		System.out.println("�����p��java�̃o�[�W����:");
		System.out.println(System.getProperty("java.version"));
		Properties p=System.getProperties();
		Iterator<String>i=p.stringPropertyNames().iterator();
		System.out.println("[�V�X�e���v���p�e�B�ꗗ]");
		while(i.hasNext()){
			String key=i.next();
			System.out.print(key+"=");
			System.out.println(System.getProperty(key));
		}

	}

}
