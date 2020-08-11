package TestGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
	ArrayList<DotCom> dotcomlist = new ArrayList<DotCom>();
	int[] grid = new int[49];
	int gridsize = 49;
	int gridlength = 7;
	int count = 0;
	String temp = null;
	
	public String GetUserInput(){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String userinput = null;
		try {
			userinput = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userinput;
	}
	
	public ArrayList<String> placeDotcom(int dotnumber){
	  int[] dotlist = new int[dotnumber];
	  ArrayList<String> dotplace = new ArrayList<String>();
	  String word = "abcdefg";
	  
	  for(int i=0;i<grid.length;i++){
		  grid[i] = 0;
	  }
	  
	  count++;
	  int increasement = 1;
	  if((count%2)==1){
		  increasement = gridlength;
	  }
	  
	 
	  boolean success = false;
	  
	  while(!success){
		  int x = 0;
		  int num = (int) (Math.random()*(grid.length));
		  success = true;
		  while(success&&x<dotnumber){
			  if(grid[num]==0){
				  dotlist[x++] = num;
				  num = num+increasement;
				  if(num>=gridsize){
					  success = false;
				  }
				  if(x>0&&(num%gridlength==0)){
					  success = false;
				  }
			  }else{
				  success = false;
			  }
		  }
		  
	  }
	
	int row = 0;
	int column = 0;
	int x = 0;
	while(x<dotnumber){
        grid[dotlist[x]]=1;
        row = (int)(dotlist[x]/gridlength);
        column = dotlist[x]%gridlength;
        temp = String.valueOf(word.charAt(column));
        dotplace.add(temp.concat(Integer.toString(row)));
        x++;
        
	}
	return dotplace;
	 
	}
	
	public void printdotplace(ArrayList<String> dotplace){
		for(String s:dotplace){
			System.out.println(s);
		}
	}
	
	
}
		
