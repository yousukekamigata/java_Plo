package java入門実践編3;
import java.util.function.IntBinaryOperator;
public class Main62 {
	public static int sub(int a,int b){
		return a-b;
	}
	public static void main(String[] args) {
		//subメソッドの処理ロジックを、変数funcに代入する
		IntBinaryOperator func=Main62::sub;
		//変数funcに格納されている処理ロジックを、引数5と3で実行する
		int a=func.applyAsInt(5,3);
		System.out.println("5-3は"+a);

	}

}
