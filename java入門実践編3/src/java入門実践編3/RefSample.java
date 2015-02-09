package java“ü–åŽÀ‘H•Ò3;

public class RefSample{
	public int times=0;
	public RefSample(int t){
		this.times=t;
	}
	public void hello(String msg){
		this.hello(msg,this.times);
	}
	public void hrllo(String msg,int t){
		System.out.println("Hello,"+msg+"x"+t);
	}
	
}

