package javaTEST;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C {
	public static void main(String[]args) throws Exception{
		//InputStreamReader�̃I�u�W�F�N�g�𐶐�
		InputStreamReader isr=new InputStreamReader(System.in);
		//BufferedReader�̃I�u�W�F�N�g�𐶐�
		BufferedReader br=new BufferedReader(isr);

		String line=br.readLine();
		String[]array=line.trim().split(" ");

		int first=Integer.parseInt(array[0]);
		int second=Integer.parseInt(array[1]);

		System.out.println(first+second);
	}
}