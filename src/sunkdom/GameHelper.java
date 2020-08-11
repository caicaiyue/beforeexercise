package sunkdom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
	

public class GameHelper {
	String alphabet = "abcdefg";
	int[] gride = new int[49];
	int gridelength = 7;
	int gridesize = 49;
	String temp = null;
	int attempt = 0;
	int location = 0;
	int numofDot = 0;
	int row = 0;
	int column = 0;
	
	
	String GetUserInput(String prompt){
		String result = null;
		System.out.println(prompt+" ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			result = br.readLine();
			if(result.length()==0) return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result.toLowerCase();
		
	}
	
	ArrayList<String> placeDotCom(int count){
		ArrayList<String> result = new ArrayList<String>();
		int[] place = new int[count];
		boolean success = false;
		int x;
		
		numofDot++;
		int incr = 1;
		if((numofDot%2)==1){
			incr = gridelength;
			
		}
		
		
		while(!success&&attempt<2000){
			location = (int)(Math.random()*49);
			success = true;
			x = 0;
			attempt++;
			while(success&&x<count){
				if(gride[location]==0){
					place[x++] = location;
					location = location + incr;
					if(location>=gridesize){
						success = false;
					}else if((location%(gridelength)==0)&&x>0){
						success = false;
					}
				}else{
					success = false;
				}
			}
		}
		
		x=0;
		while(x<place.length){
			gride[place[x]]= 1;
			row = (int)(place[x]/gridelength);
			column = (int)(place[x]%gridelength);
			temp = String.valueOf(alphabet.charAt(column));
			temp = temp.concat(Integer.toString(row));
			result.add(temp);
			x++;
		}
		
		return result;
	}
}
