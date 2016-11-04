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
			//将这个过程比喻为从超市买东西
			//找到这个超市的地址,File指定的只是文件的地址,并没有包含文件的内容,所以File不能直接读取内容
			File myFile = new File("aFile");
			//建立和超市的关系(买还是卖？先要进到超市里面)
			reader = new FileReader(myFile);
			//获取缓存区,等于拿到超市的手推车,如果没有手推车就只能一次买一件物品
			r = new BufferedReader(reader);
			//定义手推车里面的内容
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
