package sunkdom;

import java.util.ArrayList;

public class DotCom {
	ArrayList<String> location = new ArrayList<String>();
	String name;
	
	void setName(String n){
		name = n;
	}
	
	void setLocation(ArrayList loc){
		location = loc;
	}
	
	void printLocation(){
		for(String l:location){
			System.out.println(l);
		}
	}
	
	String checkUserInput(String input){
		String result = "miss";
		int index = location.indexOf(input);
		if(index>=0){
			location.remove(index);
			if(location.isEmpty()){
				result = "kill";
				//System.out.println("You Killed the "+name);
			}else{
				result = "hit";
			}
		}
		
		return result;
	}
	
}
