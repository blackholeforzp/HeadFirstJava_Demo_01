package cn.com.lakers.day_01;

public class Player {
	int number = 0;//��Ҳµ�����
	String name;//��ҵ�����
	
	public Player(String name){
		this.name=  name;
	}
	
	public int GuessNumber(){
		number = (int) (Math.random()*10);
		System.out.println(this.name + " guess the number is : " + number);
		return number;
	}
}
