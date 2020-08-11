package TestGame;

import java.util.ArrayList;

public class DotCom {
      String name;
      ArrayList<String> location;
      
      public void SetName(String name){
    	  this.name = name;
      }
      
      public void SetLocation(ArrayList<String> location){
    	  this.location = location;
      }
      
     public String checkyourself(String userguess){
    	 String result = "miss";
    	 int index = location.indexOf(userguess);
    	 if(index>=0){
    		 location.remove(index);
    		 if(location.isEmpty()){
    			 result = "kill";
    			 System.out.println("You have killed "+name);
    		 }else{
    			 result = "hit";
    		 }
    		 
    	 }
    	
		return result;   	 
     }
      
     
     public void PrintLocation(){
    	 for(String s:location){
    		 System.out.println(s.toString());
    	 }
     }
     
     public ArrayList<String> Setplace(String s){
    	 ArrayList<String> list = new ArrayList<String>();
    	 int i  = Integer.parseInt(s);
    	 for(int k=0;k<3;k++){
    		 String l = String.valueOf(i);
    		 list.add(l);
    		 i++;
    	 }
		return list;
    	 
    	 
     }
}
