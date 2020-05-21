package headfirstmodereview;

import java.util.Iterator;

import headfirstmode.MenuComponent;

public class MenuItem extends Component {
	public String name;
	public String description;
	public boolean isVegetarian;
	public double price;
	
	public MenuItem(String name,String description,boolean isVegetarian,double price){
		this.name = name;
		this.description = description;
		this.isVegetarian = isVegetarian;
		this.price = price;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public double getPrice(){
		return price;
	}
	
	public boolean isVegetarian(){
		return isVegetarian;
	}
	
	public void print(){
		System.out.print(getName());
		if(isVegetarian){
			System.out.print("(v)");
		}
		System.out.print(","+getPrice());
		System.out.println("--"+getDescription());
	}
	
	public Iterator creatIterator(){
		return new NullIterator();
	}
}
