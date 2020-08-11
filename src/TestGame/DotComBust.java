package TestGame;

import java.util.ArrayList;

public class DotComBust {
	ArrayList<DotCom> dotcomlist = new ArrayList<DotCom>();
	GameHelper gh  = new GameHelper();
	static int numofGuess = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		DotComBust db = new DotComBust();
		db.SetUpGame();
		db.PlayingGame();
	}
	
	public void PlayingGame(){
		System.out.println("The Game is ready!Let's begin!");
		while(!dotcomlist.isEmpty()){
			System.out.println("Please input your guess");
			String s = gh.GetUserInput();
			numofGuess++;
			checkUserGuess(s);
		}
		
		FinishGame();
	}

	public void FinishGame() {
		// TODO Auto-generated method stub
		System.out.println("You have killed all DotCom after "+numofGuess+" tried times.");
	}

	public void checkUserGuess(String s) {
		// TODO Auto-generated method stub
		String result = "miss";
		for(DotCom d:dotcomlist){
			result = d.checkyourself(s);
			if(result.equals("hit")){
				break;
			}
			if(result.equals("kill")){
				dotcomlist.remove(d);
				break;
			}	
		}
         
		if(!(result.equals("kill"))){
			System.out.println(result);
		}					
	}
	
	public void SetUpGame(){
		DotCom dot1 = new DotCom();
		dot1.SetName("Happy");
		dotcomlist.add(dot1);
		
		DotCom dot2 = new DotCom();
		dot2.SetName("Nice");
		dotcomlist.add(dot2);
		
		DotCom dot3 = new DotCom();
		dot3.SetName("beautiful");
		dotcomlist.add(dot3);
		
		for(DotCom dot:dotcomlist){
			dot.SetLocation(gh.placeDotcom(3));
			dot.PrintLocation();
		}
	}
	
	}
	
