package exercise;

import java.io.*;
import java.util.*;

public class jukebox3 {

	ArrayList<song> songList = new ArrayList<song>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new jukebox3().go();
		
	}

	class ArtistCompare implements Comparator<song>{

		@Override
		public int compare(song o1, song o2) {
			// TODO Auto-generated method stub
			return o1.getArtist().compareTo(o2.getArtist());
		}
	}
	
	
	public void go() {
		// TODO Auto-generated method stub
		getSongs();
		System.out.println(songList);
		//Collections.sort(songList);
		//System.out.println(songList);
		ArtistCompare artistCompare = new ArtistCompare();
		Collections.sort(songList,artistCompare );
		System.out.println(songList);
	}

	public void getSongs() {
		// TODO Auto-generated method stub
		File file = new File("E:\\study\\Songlist.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null;
			while((line=br.readLine())!=null){
				addSong(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addSong(String lineToParse) {
		// TODO Auto-generated method stub
		String[] tokens = lineToParse.split(",");
		song s1 = new song(tokens[0],tokens[1],tokens[2],tokens[3]);
		songList.add(s1);
	}

}
