package cn.com.lakers.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) {
		FileReader reader = null;
		BufferedReader r = null;
		try {
			//��������̱���Ϊ�ӳ�������
			//�ҵ�������еĵ�ַ,Fileָ����ֻ���ļ��ĵ�ַ,��û�а����ļ�������,����File����ֱ�Ӷ�ȡ����
			File myFile = new File("aFile");
			//�����ͳ��еĹ�ϵ(����������Ҫ������������)
			reader = new FileReader(myFile);
			//��ȡ������,�����õ����е����Ƴ�,���û�����Ƴ���ֻ��һ����һ����Ʒ
			r = new BufferedReader(reader);
			//�������Ƴ����������
			String line = null;
			while((line = r.readLine()) != null){
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(r != null){
					r.close();
				}
				if(reader != null){
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
