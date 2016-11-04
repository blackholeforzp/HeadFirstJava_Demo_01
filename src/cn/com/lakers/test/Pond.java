package cn.com.lakers.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Pond implements Serializable{

	/**
	 * 由于序列化之后再反序列化之前,万一类的结构发生变化,则序列化会失败,比如之前序列化存储了一个
	 * String变量,但是现在这个变量在原来的类中变成了int,很显然不能序列化成功
	 * 所以给可序列化的类加上一个ID来标识,类发生改变的时候,ID也会随之变化,那么在反序列化之前对比一下ID
	 * 就可以判断本次序列化能否执行了,如果不同会抛出异常
	 */
	private static final long serialVersionUID = 1L;
	//序列化的时候将会跳过这个变量,返回时以它的类的默认值返回
	transient Duck d = new Duck();
	transient int i;
	transient boolean b;
	transient float f;
	public static void main(String[] args) {
		Pond p = new Pond();
		try {
			FileOutputStream fs = new FileOutputStream("pond.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(p);//因为Duck是不可序列化的所以持有Duck引用的本类对象也不能序列化
			//可以将Duck对象的引用标记为transient
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
class Duck{
	//nothing
}