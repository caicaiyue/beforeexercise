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
            result = dotComToTest.CheckUserInput(checkstring);           //����checkYourself����
            if (result.equals("hit")){
                break;                      //checkYourself��������resultΪhit����������
            }
            if(result.equals("kill")){
                dotcomList.remove(dotComToTest);
                break;                    //checkYourself��������resultΪkill����DotComList�Ƴ�DotComToTest
            }
        }
        System.out.println(result);
	}

	void finishGame(){
		System.out.println("��Ӯ��");
		if(numofGuess<18){
			System.out.println("������"+numofGuess+"�������Ϸ");
		}else{
			System.out.println("����ʱ�е㳤");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DotBust cb = new DotBust();
		cb.SetUpGame();
		cb.StarGame();
		
		
		
	}

}
