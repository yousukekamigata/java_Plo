package java������H��3;

// ���K6-1
public class Main6 {

	// ���C�����\�b�h
	public static void main(String[] args) {
		// �֐��P�̌Ăяo��
		//Func1 func1 = FuncList::isOdd;
		boolean bool = func1.call(5);
		System.out.println(bool ? "�" : "����");

		// �֐��Q�̌Ăяo��
		FuncList funcList = new FuncList();
		//Func2 func2 = funcList::addNamePrefix;
		String str = func2.call(true, "����");
		System.out.println(str);
		String str2 = func2.call(false, "�c��");
		System.out.println(str2);
		Func1 func1=(int x)->{
			return(x%2==1);};
		Func2 func2=(int x)->{
			return(x%2==1)
		
	}
	
		
		
	}
	
	}

