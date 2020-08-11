package headfirstmodeagain;

public class DinerMenu extends Menu {

	public DinerMenu(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
		menuComponents.add(new MenuItem("Vegetarian BLT","(Fakin's)Bacon with lettuce & tomato",true,2.99));
		menuComponents.add(new MenuItem("BLT","Bacon with lettuce & tomato on whole wheat",false,2.99));
		MenuComponent dessertMenu = new MenuFactory().createMenu("DESSERT MENU");
		menuComponents.add(dessertMenu);
		
	}

}
