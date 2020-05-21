package headfirstmodeagain;

import java.util.Iterator;

public class MenuItem extends MenuComponent{
	String name;
	String description;
	double price;
	boolean isVegetarian;
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
		System.out.print("\n"+getName());
		if(isVegetarian()){
			System.out.print("(v)");
		}
		System.out.print(","+getPrice());
		System.out.print("！！！！"+getDescription());
	}
	
	public Iterator createIterator(){
		return new NullIterator();
	}
}
