package headfirstmode;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Hashtable ht = new Hashtable();
		ht.put("key001", 101);
		ht.put("key002", 202);
		ht.put("key003", 303);
		
		Iterator it = ht.values().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		List list = new LinkedList();
		Calendar rightNow = Calendar.getInstance();
		int SUNDAY = Calendar.SUNDAY;
		list.add(SUNDAY);
		int MONDAY = Calendar.MONDAY;
		list.add(MONDAY);
		int TUESDAY = Calendar.TUESDAY;
		list.add(TUESDAY);
		int WEDNESDAY = Calendar.WEDNESDAY;
		list.add(WEDNESDAY);
		int THURSDAY = Calendar.THURSDAY;
		list.add(THURSDAY);
		int FRIDAY = Calendar.FRIDAY;
		list.add(FRIDAY);
		int SATURDAY = Calendar.SATURDAY;
		list.add(SATURDAY);
		
		Iterator<Integer> it = list.iterator();
		//while(it.hasNext()){
		//	int index = it.next();
		//	//System.out.println(index);
		//	System.out.println(rightNow.get(index)%2);
		//}
		
		System.out.println("**********");
		
		
		
		System.out.println(rightNow.get(Calendar.DAY_OF_WEEK)%2);
		//System.out.println(rightNow.get(Calendar.DAY_OF_WEEK)%2);
		//System.out.println(rightNow.get(FRIDAY)%2);
		//System.out.println(rightNow.get(SATURDAY)%2);*/
		

		
	}

}
