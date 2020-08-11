package headfirstmodeagain;

public class MenuFactory {
	MenuComponent createMenu(String menuName){
		if(menuName.equals("CafeMenu")){
			return new CafeMenu("CAFE MENU","Dinner");
		}if(menuName.equals("PANCAKE HOUSE MENU")){
			return new PancakeMenu("PANCAKE HOUSE MENU","Breakfast");
		}if(menuName.equals("DESSERT MENU")){
			return new DessertMenu("DESSERT MENU","Dessert of course!");
		}if(menuName.equals("DINER MENU")){
			return new DinerMenu("DINER MENU","Lunch");
		}if(menuName.equals("RestaurantMenu")){
			return new RestaurantMenu("RestaurantMenu","All menus combined");
		}
		else{
			throw new UnsupportedOperationException();
		}
		
	}
}
