package headfirstmodeagain;

public class PancakeMenu extends Menu {
	public PancakeMenu(String name,String description){
		super(name,description);
		menuComponents.add(new MenuItem("K&B's Pancake Breakfast","Pancake with Scrambled",true,2.99));
		menuComponents.add(new MenuItem("Regular Pancake Breakfast","Pancakes with fried eggs,sausage",false,2.99));
	}
}
