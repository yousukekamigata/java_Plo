package java“ü–åŽÀ‘H•Ò3;
import java.util.function.IntBinaryOperator;
public class Main64 {

	public static void main(String[] args) {
		//u‚Q‚Â‚Ìˆø”‚Ì·‚ð‹‚ß‚éˆ—v‚ÌŽÀ‘Ô‚ð¶‚Ýo‚µA‘ã“ü‚·‚é
		IntBinaryOperator func=(int a,int b)->{return a-b;};
		int a=func.applyAsInt(5,3);
		System.out.println("5-3‚Í"+a);

	}

}
