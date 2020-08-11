package headfirstmode;

public class MenuTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfase");
		MenuComponent dinnerMenu = new Menu("DINER MENU", "Luch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinnerMenu);
		allMenus.add(cafeMenu);

		pancakeHouseMenu
				.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
		pancakeHouseMenu
				.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs,sausage", false, 2.99));
		pancakeHouseMenu.add(new MenuItem("Blueberry Pancake",
				"Pancakes made with fresh blueberries,and blueberry syrup", true, 3.49));
		pancakeHouseMenu
				.add(new MenuItem("Waffles", "Waffles,with your choice of blueberries or straberries", true, 3.59));

		dinnerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin')Bacon with lettuce&tomato on whole wheat", true, 2.99));
		dinnerMenu.add(new MenuItem("BLT", "Bacon with lettuce&tomato on whole wheat", false, 2.99));
		dinnerMenu.add(new MenuItem("Soup of the day", "A bowl of the soup of the day,with a side of potato salad",
				false, 3.29));
		dinnerMenu
				.add(new MenuItem("Hotdog", "A hot dog,with saurkraut,relish,onions,topped with cheese", false, 3.05));
		dinnerMenu.add(new MenuItem("Steamed Veggies and Brown Rice", "Steamed vegtables over brown rice", true, 3.99));
		dinnerMenu
				.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce,and a slice of sourdough bread", true, 3.89));
		dinnerMenu.add(dessertMenu);
		dessertMenu.add(
				new MenuItem("Apple Pie", "Apple Pie with a flakey crust,topped with vanilla ice cream", true, 1.59));
		dessertMenu.add(
				new MenuItem("Chessecake", "Creamy New York cheesecake,with a chocolate graham crust", true, 1.99));
		dessertMenu.add(new MenuItem("Sorbet", "A scoop of raspberry and a scoop of lime", true, 1.89));
		
		
		cafeMenu.add(new MenuItem("Veggie Burger and Air Fries","Veggie burger on a whole wheat bun,lettuce,tomato,and fries",true,3.99));
		cafeMenu.add(new MenuItem("Soup of the day","A cup of the soup of the day,with a side salad",false,3.69));
		cafeMenu.add(new MenuItem("Burrito","A large burrito,with whole pinto beans, salsa,guacamole",true,4.29));
		
		Waitress waitress = new Waitress(allMenus);
		//waitress.printMenu();
		waitress.printVegetarianMenu();
	}

}
