package java������H��3;
import java.io.FileWriter;
import java.io.IOException;

public class Main94 {

	public static void main(String[] args) throws IOException{
		FileWriter fw=null;
		try{
			fw=new FileWriter("rpgsave.dat",true);
			fw.write('A');
			fw.flush();
		}catch(IOException e){
			System.out.println("�t�@�C���������݃G���[�ł�");
		}finally{
			if(fw !=null){
				try{
					if(fw !=null){
						fw.close();
					}
				}catch(IOException e2){}
			}

	}

	}

}