package cn.com.lakers.test;

public class TestFormats {
	public static void main(String[] args) {
		//%表示用后面的参数来替换掉它
		String s1 = String.format("%,d", 10000000);
		System.out.println("s1 : " + s1);
		
		String s2 = String.format("I have %.2f bugs to fix", 4321.345);
		System.out.println("s2 : " + s2);
		
		System.out.println("%");
		
		String s3 = String.format("I have %,.2f bugs to fix", 4321.345);
		System.out.println("s3 : " + s3);
		
		String s4 = String.format("I have %.2f, bugs to fix", 4321.345);
		System.out.println("s4 : " + s4);
	}
}
