package cn.com.lakers.day_02;

import java.util.List;

public class SimpleDotcom {
	
	private List locationCells;
	int numOfHits = 0;
	
	public void setLocationCells(List locas){
		locationCells = locas;
	}
	
	public String checkYourself(String userGuess){
		int guess = Integer.parseInt(userGuess);
		String result = "miss";
		if(locationCells.contains(guess)){
				result = "hit";
				locationCells.remove((Object)guess);
				numOfHits++;
		}
		
		
		if(locationCells.isEmpty()){
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
}
