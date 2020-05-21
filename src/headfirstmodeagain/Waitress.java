package headfirstmodeagain;

import java.util.Iterator;

public class Waitress {
	MenuComponent mc;
	public Waitress(MenuComponent mc){
		this.mc = mc;
	}
	
	public void print(){
		mc.print();
	}
	
	public void printVegeterain(){
		Iterator it = mc.createIterator();
		while(it.hasNext()){
			MenuComponent mc = (MenuComponent) it.next();
			try{
				if(mc.isVegetarian()){
					mc.print();
				}
			}catch(UnsupportedOperationException e){
				
			}
			
		}
	}
}
