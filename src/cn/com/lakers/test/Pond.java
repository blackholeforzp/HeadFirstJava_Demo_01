package cn.com.lakers.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Pond implements Serializable{

	/**
	 * �������л�֮���ٷ����л�֮ǰ,��һ��Ľṹ�����仯,�����л���ʧ��,����֮ǰ���л��洢��һ��
	 * String����,�����������������ԭ�������б����int,����Ȼ�������л��ɹ�
	 * ���Ը������л��������һ��ID����ʶ,�෢���ı��ʱ��,IDҲ����֮�仯,��ô�ڷ����л�֮ǰ�Ա�һ��ID
	 * �Ϳ����жϱ������л��ܷ�ִ����,�����ͬ���׳��쳣
	 */
	private static final long serialVersionUID = 1L;
	//���л���ʱ�򽫻������������,����ʱ���������Ĭ��ֵ����
	transient Duck d = new Duck();
	transient int i;
	transient boolean b;
	transient float f;
	public static void main(String[] args) {
		Pond p = new Pond();
		try {
			FileOutputStream fs = new FileOutputStream("pond.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(p);//��ΪDuck�ǲ������л������Գ���Duck���õı������Ҳ�������л�
			//���Խ�Duck��������ñ��Ϊtransient
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