package cn.com.lakers.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestRead {
	public static void main(String[] args) {
		try {
			FileInputStream fs1 = new FileInputStream("foo.ser");
			ObjectInputStream os1 = new ObjectInputStream(fs1);
			Box o = (Box) os1.readObject();
			System.out.println("width : " + o.getWidth());
			System.out.println("height : " + o.getHeight());
			os1.close();
			
			FileInputStream fs2 = new FileInputStream("pond.ser");
			ObjectInputStream os2 = new ObjectInputStream(fs2);
			Pond p = (Pond) os2.readObject();
			//标记为transient的属性反序列化的时候会返回该类的默认值
			System.out.println("the Duck of the pond is : " + p.d);
			System.out.println("the int of the pond is : " + p.i);
			System.out.println("the float of the pond is : " + p.f);
			System.out.println("the boolean of the pond is : " + p.b);
			os2.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
