package cn.com.lakers.day_02;

import java.util.ArrayList;

public class Game {
	public static void main(String[] args) {
		int numOfGuess = 0;
		GameHelper helper = new GameHelper();
		
		SimpleDotcom theDotCom = new SimpleDotcom();
		
		int randomNum = (int) (Math.random() * 5);
	
		ArrayList<Integer> locations = new ArrayList<Integer>();
		locations.add(randomNum);
		locations.add(randomNum+1);
		locations.add(randomNum+2);
		
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
		
		while(isAlive){
			String guess = helper.getUserImput("enter a number : ");
			String result = theDotCom.checkYourself(guess);
			numOfGuess++;
			
			if("kill".equals(result)){
				isAlive = false;
				System.out.println("You took " + numOfGuess + " guess");
			}
		}
	}
}
