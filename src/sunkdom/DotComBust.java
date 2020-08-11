package sunkdom;

import java.util.ArrayList;

public class DotComBust {
	GameHelper gh = new GameHelper();
	ArrayList<DotCom> dcl  = new ArrayList<DotCom>();
	int numofGuess = 0;
	
	void SetupGame(){
		DotCom d1 = new DotCom();
		d1.setName("Cat.com");
		dcl.add(d1);
		DotCom d2 = new DotCom();
		d2.setName("Dog.com");
		dcl.add(d2);
		DotCom d3 = new DotCom();
		d3.setName("Pig.com");
		dcl.add(d3);
		
		for(DotCom d:dcl){
			d.setLocation(gh.placeDotCom(3));
			d.printLocation();
		}
	}
	
	void StartPlaying(){
		String userInput = null;
		System.out.println("Let's Start Game");
		while(!dcl.isEmpty()){
			userInput = gh.GetUserInput("Pleaser Input your Guess");
			CheckUserInput(userInput);
		}
		
		FinishGame();
	}

	 private void FinishGame() {
		// TODO Auto-generated method stub
		if(numofGuess<=20){
			System.out.println("Greate!You have tried "+numofGuess+" times to finish the Game");
		}else{
			System.out.println("Sorry, You have tried "+numofGuess+" time to finish the Game,too long");
		}
	}

	void CheckUserInput(String userInput) {
		// TODO Auto-generated method stub
		numofGuess++;
		String result = "miss";
		String killedname = null;
		for(DotCom d:dcl){
			result = d.checkUserInput(userInput);
			if(result.equals("kill")){
				killedname = d.name;
				dcl.remove(d);
				break;
			}else if(result.equals("hit")){
				break;
			}
		}
		System.out.println(result);
		if(result.equals("kill")){
			System.out.println("You Killed the "+killedname);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DotComBust dcb = new DotComBust();
		dcb.SetupGame();
		dcb.StartPlaying();
		
	}

}
