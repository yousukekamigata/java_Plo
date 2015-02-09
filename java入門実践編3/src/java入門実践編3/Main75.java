package java入門実践編3;

public class Main75 {
	//Stringに関する情報を取得して表示する
	public static void main(String[] args) {
		Class<?>info1=String.class;
		System.out.println(info1.getSimpleName());
		System.out.println(info1.getName());
		System.out.println(info1.getPackage().getName());
		
		System.out.println(info1.isArray());
		//Stringの親クラスの情報を取得する
		Class<?>info2=info1.getSuperclass();
		System.out.println(info2.getName());
		//なおargsは、きちんと
		Class<?>info3=args.getClass();
		System.out.println(info3.isArray());



	}

}
