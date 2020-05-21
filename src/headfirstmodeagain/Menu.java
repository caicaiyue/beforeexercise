package headfirstmodeagain;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;
	
	public Menu(String name,String description){
		this.name = name;
		this.description = description;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void add(MenuComponent menuComponent){
		menuComponents.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent){
		 menuComponents.remove(menuComponent);
	}
	
	public MenuComponent getChild(int i){
		return menuComponents.get(i);
	}
	
	public void print(){
		System.out.print("\n"+getName());
		System.out.print(","+getDescription());
		Iterator it = menuComponents.iterator();
		while(it.hasNext()){
			MenuComponent mc = (MenuComponent) it.next();
			mc.print();
		}
	}
	
	public Iterator createIterator(){
		Iterator it = menuComponents.iterator();
		return new ComponentIterator(it);
	}
	
}
