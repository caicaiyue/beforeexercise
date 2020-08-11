package exercise;

import java.util.ArrayList;

public class huiwenshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ishuiwenshu(4321);
	}
	
	static void ishuiwenshu(int x){
		ArrayList l1 = new ArrayList();
		ArrayList l2 = new ArrayList();
		int yushu = x%10;
		int shang = x/10;
		
		while(shang>0){
			l1.add(yushu);
			shang = shang/10;
			yushu = shang%10;
		}
		
		for(int i=0;i<l1.size();i++){
			System.out.println(l1.get(i));
		}
	}

}
