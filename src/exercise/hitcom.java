package exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class hitcom {

	public static void main(String[] args) {
		
		int a =(int) (0.2*49);
		// TODO Auto-generated method stub
		ArrayList com = new ArrayList();
		makecom(com);
		System.out.println("请输入您猜测的数组坐标");
		Scanner sc = new Scanner(System.in);
		int count  = 0;
		int guessnumber = sc.nextInt();
		while(count<3){
			if(!guesscom(com,guessnumber)){
				System.out.println("miss");
			}else{
				System.out.println("hit");
				count++;
			}
			 if(count==3){
				 System.out.println("com已被您击退");
				 break;
			 }
			System.out.println("请输入您猜测的数组坐标");
			guessnumber = sc.nextInt();							
		}
			
			
		}
		
       
	
	public static void makecom(ArrayList com){
		int number = (int)(Math.random()*10);
		com.add(number);
		com.add(number+1);
		com.add(number+2);
	}
	
	public static boolean guesscom(ArrayList list,int num){
		for(int i=0;i<list.size();i++){
			if((int)list.get(i)==num){
				list.remove(i);
				return true;
			}
		}
		return false;
	}
}
