package cn.com.lakers.test;

public class TestBox {
	Integer i;
	int j;
	
	public static void main(String[] args) {
		TestBox tb = new TestBox();
		tb.go();
	}
	
	public void go(){
		//j = i;//ת�������쳣
		System.out.println(i);//i=null
		System.out.println(j);//j=0
	}
}	
