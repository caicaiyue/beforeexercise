package exercise;

import java.util.ArrayList;
import java.util.Iterator;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {6,5,4,1,2};
		ArrayList list = new ArrayList();
		for(int x:array){
				list.add(x);
		}
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			int x = (int) itr.next();
			if(x%2==0){
				itr.remove();
			}
		}
		
		//list.clear();
		
		Iterator itr1 = list.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
	}
	
	

}
