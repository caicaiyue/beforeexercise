package PlayGame;

import java.util.ArrayList;

public class DotCom {
   String Name;
   ArrayList<String> Location;
   
   public void SetName(String name){
	   this.Name = name;
   }
   
   public void SetLocation(ArrayList<String> Location){
	   this.Location = Location;
   }
   
   public String CheckYourSelf(String s){
	    String result = "miss";
	    if(Location.indexOf(s)>=0){
	    	result = "hit";
	    	Location.remove(Location.indexOf(s));
	    	if(Location.isEmpty()){
	    		result = "Kill";
	    		System.out.println("You have killed the "+Name);
	    	}
	    }
	    return result;
	   
   }
   
   public void PrintLocation(){
	   for(String s:Location){
		   System.out.println(s);
	   }
   }
}
