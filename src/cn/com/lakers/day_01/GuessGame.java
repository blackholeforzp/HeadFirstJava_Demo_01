package cn.com.lakers.day_01;

public class GuessGame {
	//构建三个玩家
	Player p1 = new Player("p1");
	Player p2 = new Player("p2");
	Player p3 = new Player("p3");
	//分别创建三个数字来保存每次玩家猜的结果
	int p1Guess = 0;
	int p2Guess = 0;
	int p3Guess = 0;
	//创建三个flag来判断玩家是否猜中数字
	boolean flag1 = false;
	boolean flag2 = false;
	boolean flag3 = false;
	//三个人中只要有一个人猜中游戏就结束
	boolean flag = false;
	//创建一个数字来保存谜底数字
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
			//每次猜完之后对每一个玩家猜的结果进行判断,使用三目运算符
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
