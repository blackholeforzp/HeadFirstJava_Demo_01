package cn.com.lakers.day_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Jukebox {
	ArrayList<Song> songList = new ArrayList<Song>();
	public static void main(String[] args) {
		new Jukebox().go();
		
	}
	
	class ArtistCompare implements Comparator<Song>{
		public int compare(Song one, Song two){
			return one.getArtist().compareTo(two.getArtist());
		}
	}
	
	public void go(){
		songList.add(new Song("ÆÏÌÑ³ÉÊìÊ±","³ÂŞÈÑ¸","",""));
		songList.add(new Song("¸¡¿ä","³ÂŞÈÑ¸","",""));
		songList.add(new Song("´ºÏÄÇï¶¬","ÕÅ¹úÈÙ","",""));
		songList.add(new Song("Â·¹ıòßòÑ","ÕÅ¹úÈÙ","",""));
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
	}
}
