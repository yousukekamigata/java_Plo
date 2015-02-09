package java������H��3C14;
import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {
	//�@����n�F�u�~���r�v���Z�b�g�ł��邩
	@Test public void setName(){
		Bank b=new Bank();
		b.setName("�~���r");
	}
	//�A�ُ�n�Fnull���Z�b�g�g�p�Ƃ������O���N����ׂ�
	@Test public void setNameWithNull(){
		try{
			Bank b=new Bank();
			b.setName(null);
		}catch(IllegalArgumentException e){
			return;
		}
		fail();
	}
	//�B�ُ�n�F2�������Z�b�g���悤�Ƃ������O���N����ׂ�
	@Test(expected=IllegalArgumentException.class)
	public void throwsExceptionWithTwoCharName(){
		Bank b=new Bank();
		b.setName("�~��");
	}


}
