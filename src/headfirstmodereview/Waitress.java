package headfirstmodereview;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
	
	Component allMenu ;
	
	public Waitress(Component allMenu){
		this.allMenu = allMenu;
	}
	
	public void print(){
		allMenu.print();
	}
	
	public void printVegetarian(){
		Iterator it = allMenu.creatIterator();
		while(it.hasNext()){
			Component c = (Component) it.next();
			if(c.isVegetarian()){
				c.print();
			}
		}
	}
}
