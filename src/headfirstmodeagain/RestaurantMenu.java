package headfirstmodeagain;

public class RestaurantMenu extends Menu {

	public RestaurantMenu(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
		MenuFactory mf = new MenuFactory();
		MenuComponent pancakeMenu = mf.createMenu("PANCAKE HOUSE MENU");
		MenuComponent dinerMenu = mf.createMenu("DINER MENU");
		MenuComponent cafeMenu = mf.createMenu("CafeMenu");
		menuComponents.add(pancakeMenu);
		menuComponents.add(dinerMenu);
		menuComponents.add(cafeMenu);
	}

}
