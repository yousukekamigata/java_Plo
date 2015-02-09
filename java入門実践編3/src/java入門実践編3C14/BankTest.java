package java入門実践編3C14;
import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {
	//①正常系：「ミヤビ」をセットできるか
	@Test public void setName(){
		Bank b=new Bank();
		b.setName("ミヤビ");
	}
	//②異常系：nullをセット使用としたら例外が起こるべき
	@Test public void setNameWithNull(){
		try{
			Bank b=new Bank();
			b.setName(null);
		}catch(IllegalArgumentException e){
			return;
		}
		fail();
	}
	//③異常系：2文字をセットしようとしたら例外が起こるべき
	@Test(expected=IllegalArgumentException.class)
	public void throwsExceptionWithTwoCharName(){
		Bank b=new Bank();
		b.setName("ミヤ");
	}


}
