package java������H��3;
import java.util.function.IntBinaryOperator;
public class Main64 {

	public static void main(String[] args) {
		//�u�Q�̈����̍������߂鏈���v�̎��Ԃ𐶂ݏo���A�������
		IntBinaryOperator func=(int a,int b)->{return a-b;};
		int a=func.applyAsInt(5,3);
		System.out.println("5-3��"+a);

	}

}
