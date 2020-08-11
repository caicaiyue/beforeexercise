package exercise;

public class song implements Comparable {
	String title;
	String artist;
	String rating;
	String bpm;
	
	song(String t,String a,String r,String b){
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getArtist(){
		return artist;
	}
	
	public String getRating(){
		return rating;
	}
	
	public String getBpm(){
		return bpm;
	}
	

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		song s = (song)o;
		return title.compareTo(s.getTitle());
	}
	
	public String toString(){
		String s =  title+"/"+artist;
		return s;
	}
}
