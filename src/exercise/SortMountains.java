package exercise;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {

	LinkedList<Mountain> mtn = new LinkedList<Mountain>();
	
   class NameCompare implements Comparator<Mountain>{

	@Override
	public int compare(Mountain o1, Mountain o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	   
   }
   
   
   class HeightCompare implements Comparator<Mountain>{

	@Override
	public int compare(Mountain o1, Mountain o2) {
		// TODO Auto-generated method stub
		String s1 = Integer.toString(o1.getHeight());
		String s2 = Integer.toString(o2.getHeight());
		return s1.compareTo(s2);
	}
	   
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new SortMountains().go();
	}

	public void go() {
		// TODO Auto-generated method stub
		mtn.add(new Mountain("Longs",14255));
		mtn.add(new Mountain("Elber",14433));
		mtn.add(new Mountain("Maroon",14156));
		mtn.add(new Mountain("Castle",14265));
		
		System.out.println("as entered:\n"+mtn);
		
		NameCompare nc = new NameCompare();
		Collections.sort(mtn,nc);
		System.out.println("by Name:\n"+mtn);
		
		HeightCompare hc = new HeightCompare();
		Collections.sort(mtn,hc);
		System.out.println("by Height:\n"+mtn);
	}

}

class Mountain{
	String name;
	int height;
	
	Mountain(String name,int h){
		this.name = name;
		height = h;
	}
	
	
	public String getName(){
		return name;
	}
	
	public int getHeight(){
		return height;
	}
	public String toString(){
		String s = name+" "+height;
		return s;
		
	}
	
}
