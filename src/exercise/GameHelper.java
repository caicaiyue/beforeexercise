package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {

	private String alphabet = "abcdefg";
	private int[] grid = new int[49];
	private int gridsize = 49;
	private int gridlength = 7;
	private int comcount = 0;
	private int attemptnum = 0;
	private int location;
	private String temp;
	
	
	public String getUserInput(String input){
		String userinput = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print(input + "  ");
			userinput = br.readLine();
			if(userinput.length()==0){
				return null;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userinput.toLowerCase();
		
	}
	
	public ArrayList placeDot(int count){
		ArrayList<String> alphacoords = new ArrayList<String>();
		boolean success = false;
		int incr = 1;
		int x ;
		int[] cords = new int[count];
		
		if(comcount%2==0){
			incr = gridlength;
			comcount++;
		}
		while(!success&&attemptnum<=2000){
			location = (int)(Math.random()*49);
			success = true;
			attemptnum++;
			x= 0;
			while(success&&x<count){
				if(grid[location]==0){
					cords[x++] = location;
					location = location + incr;
					if(location>=gridsize){
						success = false;
					}else if(x>0&&location%(gridlength-1)==0){
						success = false;
					}					
				}else{
					success = false;
				}
			}
		}
		
		x = 0;
		int row = 0;
		int column = 0;
		
		while(x<count){
			grid[cords[x]] = 1;
			row = (int)(cords[x]/7);
			column = (int)(cords[x]%7);
			temp = String.valueOf(alphabet.charAt(column));
			alphacoords.add(temp.concat(Integer.toString(row)));
			x++;
		}
		
		return alphacoords;
		
	}
	 
}
