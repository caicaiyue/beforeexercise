package headfirstmodeagain;

import java.util.Date;
import java.util.Random;

public class TestFactoryMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuFactory menuFactory = new MenuFactory();
		//MenuComponent cafeMenu = MenuFactory.createMenu("CafeMenu");
		//MenuComponent pancakeMenu = MenuFactory.createMenu("PANCAKE HOUSE MENU");
		//MenuComponent dinerMenu = MenuFactory.createMenu("DINER MENU");
		//MenuComponent dessertMenu = MenuFactory.createMenu("DESSERT MENU");
		MenuComponent allMenu = menuFactory.createMenu("RestaurantMenu");
		
		
		Waitress waitress = new Waitress(allMenu);
		waitress.print();
		System.out.println("");
		waitress.printVegeterain();
		
		System.out.println();
		

		
	}

}
