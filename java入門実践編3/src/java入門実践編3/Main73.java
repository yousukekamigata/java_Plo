package java入門実践編3;
import java.util.Iterator;
import java.util.Properties;
public class Main73 {

	public static void main(String[] args) {
		System.out.println("ご利用のjavaのバージョン:");
		System.out.println(System.getProperty("java.version"));
		Properties p=System.getProperties();
		Iterator<String>i=p.stringPropertyNames().iterator();
		System.out.println("[システムプロパティ一覧]");
		while(i.hasNext()){
			String key=i.next();
			System.out.print(key+"=");
			System.out.println(System.getProperty(key));
		}

	}

}
