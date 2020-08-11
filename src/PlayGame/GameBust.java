package PlayGame;

import java.util.ArrayList;

public class GameBust {
	ArrayList<DotCom> dotcomlist = new ArrayList<DotCom>();
	static GameHelper gh = new GameHelper();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameBust gb = new GameBust();
		gb.SetupGame();
	}

	private void SetupGame() {
		// TODO Auto-generated method stub
		DotCom dot1 = new DotCom();
		dot1.SetName("Bad");
		dot1.SetLocation(gh.setDotComPlace(3));
		dot1.PrintLocation();
		
		DotCom dot2 = new DotCom();
		dot2.SetName("wrong");
		dot2.SetLocation(gh.setDotComPlace(3));
		dot2.PrintLocation();
		
		DotCom dot3 = new DotCom();
		dot1.SetName("Sad");
		
		
		
		//PlayingGame();
		
		
	}

	private void PlayingGame() {
		// TODO Auto-generated method stub
		System.out.println("The Game Started,Please input your Guess");
		while(!(dotcomlist.isEmpty())){
			String input = gh.getUserInput();
			CheckUserInput(input);
		}
		
	}

	private void CheckUserInput(String input) {
		// TODO Auto-generated method stub
		
	}

}
