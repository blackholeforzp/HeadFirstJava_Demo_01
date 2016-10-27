package cn.com.lakers.day_02;

import java.util.ArrayList;
import java.util.List;

public class SimpleDotComTestDrive {
	public static void main(String[] args) {
		SimpleDotcom dot = new SimpleDotcom();
		
		List<Integer> locations = new ArrayList<Integer>();
		locations.add(2);
		locations.add(3);
		locations.add(4);
		dot.setLocationCells(locations);
		
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		
		String testResult = "failed";
		if(result.equals("hit")){
			testResult = "passed";
		}
		System.out.println(testResult);
	}
}
