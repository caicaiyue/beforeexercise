package headfirstmodereview;

import java.util.ArrayList;
import java.util.Iterator;

import headfirstmode.MenuComponent;

public class Menu extends Component {
	ArrayList menuList = new ArrayList();
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
	
	public void add(Component component){
		menuList.add(component);
	}
	
	public Component getChild(int i){
		return (Component) menuList.get(i);
	}
	
	public void remove(MenuComponent menuComponent){
		menuList.remove(menuComponent);
	}
	
	public void print(){
		System.out.print("\n"+getName());
		System.out.println(","+getDescription());
		System.out.println("--------------");
		Iterator it = menuList.iterator();
		while(it.hasNext()){
			Component c = (Component) it.next();
			c.print();
		}
		
	}
	
	public Iterator creatIterator(){
		return new ComponentIterator(menuList.iterator());
	}
}
