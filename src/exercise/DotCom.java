package exercise;

import java.util.ArrayList;

public class DotCom {
	String name;
	ArrayList<String> location;
	
	public void setName(String n){
		name = n;
	}
	
	public void setLocation(ArrayList<String> loc){
		location = loc;
	}
	
	
	public String CheckUserInput(String input){
		String result = "miss";
		int index = location.indexOf(input);
		if(index>=0){
			location.remove(index);
			if(location.isEmpty()){
				result = "kill";
				System.out.println(name+"go die");
			}else{
				result="hit";
			}
		}
		
		return result;
		
	}
}
