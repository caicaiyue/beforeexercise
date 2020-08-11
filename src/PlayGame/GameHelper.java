package PlayGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
	int count = 0;
	int[] grid = new int[49];
	private static final String alphabet = "abcedfg";
	
	public String getUserInput(){
		String userword = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			userword = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userword;
		
	}

	public ArrayList<String> setDotComPlace(int num) {
		// TODO Auto-generated method stub
		int gridlength = 7;
		int gridsize = 49;
		int[] dotplace = new int[num];
		ArrayList<String> place = new ArrayList<String>();
		int x = 0;
		int incr = 1;
		
		if((count)%2==1){
			incr = 7;
		}
		
		count++;
		
		boolean success = false;
		while(!success){
			success = true;
			x=0;
			int number = (int) (Math.random()*gridsize);
			while(success&x<num){
				if(number<gridsize){
					if(grid[number]==0){
						dotplace[x] = number;
						number = number+incr;
						x++;
						if(x>0&(number%7==0)){
							success =false;
						}
					}		
			    }else{
					  success = false;
			    }
			}
		}
		
		String temp = null;
		int row = 0;
		int column = 0;
		
		for(int i:dotplace){
			grid[i] =1;
			row = (int)(i/gridlength);
			column = i%gridlength;
			temp = (String.valueOf(alphabet.charAt(column))).concat(String.valueOf(row));
			place.add(temp);
			
		}
		return place;
	}
}
		

	
	
