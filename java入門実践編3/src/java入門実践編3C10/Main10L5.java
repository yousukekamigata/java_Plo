package java������H��3C10;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;
public class Main10L5 {
	public static void main(String[]args)throws Exception{
		Reader fr=new FileReader("c:\rpgdata.properties");
		Properties p=new Properties();
		p.load(fr);
		String name=p.getProperty("heroName");
		String strHp=p.getProperty("heroHp");
		int hp=Integer.parseInt(strHp);
		System.out.println("�E�҂̖��O:"+name);
		System.out.println("�E�҂�HP:"+hp);
		fr.close();
	}

}
