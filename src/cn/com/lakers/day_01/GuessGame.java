package cn.com.lakers.day_01;

public class GuessGame {
	//�����������
	Player p1 = new Player("p1");
	Player p2 = new Player("p2");
	Player p3 = new Player("p3");
	//�ֱ𴴽���������������ÿ����ҲµĽ��
	int p1Guess = 0;
	int p2Guess = 0;
	int p3Guess = 0;
	//��������flag���ж�����Ƿ��������
	boolean flag1 = false;
	boolean flag2 = false;
	boolean flag3 = false;
	//��������ֻҪ��һ���˲�����Ϸ�ͽ���
	boolean flag = false;
	//����һ�������������յ�����
	int targetNumber = 0;
	
	public void gameStart(){
		
		System.out.println("Guess the number is begining....");
		targetNumber = (int)(Math.random()*10);
		System.out.println("the targetNumber is : " + targetNumber);
		System.out.println("Please strat to guess : ");
		
		while(!flag){
			System.out.println("players are going to guess....");
			p1Guess = p1.GuessNumber();
			p2Guess = p2.GuessNumber();
			p3Guess = p3.GuessNumber();
			//ÿ�β���֮���ÿһ����ҲµĽ�������ж�,ʹ����Ŀ�����
			flag1 = p1Guess == targetNumber ? true : false;
			flag2 = p2Guess == targetNumber ? true : false;
			flag3 = p3Guess == targetNumber ? true : false;
			flag = flag1 || flag2 || flag3;
			System.out.println();
		}
		
		System.out.println("We got a winner....");
		if(flag1){
			System.out.println("p1 is a winner....");
		}
		if(flag2){
			System.out.println("p2 is a winner....");
		}
		if(flag3){
			System.out.println("p3 is a winner....");
		}
	}
}
