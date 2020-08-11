package exercise;

import java.util.ArrayList;

public class DotBust {
	GameHelper helper = new GameHelper();
	ArrayList<DotCom> dotcomList = new ArrayList<DotCom>();
	int numofGuess = 0;
	
	
	void SetUpGame(){
		DotCom  one = new DotCom();
		one.setName("happy.com");
		DotCom  two = new DotCom();
		two.setName("smile.com");
		DotCom  three = new DotCom();
		three.setName("nice.com");
		dotcomList.add(one);
		dotcomList.add(two);
		dotcomList.add(three);
		
		System.out.println("StarGame");
		
		for(DotCom dotComToSet: dotcomList){
			ArrayList<String> newlocation = helper.placeDot(3);
			dotComToSet.setLocation(newlocation);
			/*for(String l:dotComToSet.location){
				System.out.println(l);
			}*/
		}
		
	}
	
	void StarGame(){
		while(!dotcomList.isEmpty()){
			String checkstring = helper.getUserInput("enter your guess");
			checkyourinput(checkstring);
		}
		finishGame();		
	}

	void checkyourinput(String checkstring) {
		// TODO Auto-generated method stub
		numofGuess++;
        String result = "miss";
        for(DotCom dotComToTest :dotcomList){
            result = dotComToTest.CheckUserInput(checkstring);           //调用checkYourself方法
            if (result.equals("hit")){
                break;                      //checkYourself方法返回result为hit，则输出结果
            }
            if(result.equals("kill")){
                dotcomList.remove(dotComToTest);
                break;                    //checkYourself方法返回result为kill，从DotComList移除DotComToTest
            }
        }
        System.out.println(result);
	}

	void finishGame(){
		System.out.println("你赢了");
		if(numofGuess<18){
			System.out.println("共试了"+numofGuess+"次完成游戏");
		}else{
			System.out.println("但用时有点长");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DotBust cb = new DotBust();
		cb.SetUpGame();
		cb.StarGame();
		
		
		
	}

}
