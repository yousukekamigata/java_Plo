package javaTEST;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Toi1 {
	public static void main(String[] args) throws Exception {
		//InputStreamReader�̃I�u�W�F�N�g�𐶐�
		InputStreamReader isr=new InputStreamReader(System.in);
		//BufferedReader�I�u�W�F�N�g�̐���
		BufferedReader br=new BufferedReader(isr);
		
		//��s�����ǂݍ���
		String line1=br.readLine();
		//���l�^�ɕϊ�
		int n=Integer.parseInt(line1);
		
		//���͍s�����J��Ԃ��l���擾����
		for(int i=0;i<n;i++){
			
			//��s�����ǂݍ���
			String line2=br.readLine();
			//�l����؂蕶���ŋ�؂��Ă���ꍇ�A��������
			String[]array=line2.trim().split(" ");
			
			//�W���o�͂֏o��
			System.out.println(array[0]+","+array[1]);
		}
	}

}
