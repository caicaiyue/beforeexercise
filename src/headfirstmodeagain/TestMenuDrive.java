package headfirstmodeagain;

public class TestMenuDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuComponent allMenu = new Menu("ALL MENUS","All menus combined");
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU","Lunch");
		MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of course!");
		MenuComponent cafeMenu = new Menu("CAFE MENU","Dinner");
		
		allMenu.add(pancakeHouseMenu);
		allMenu.add(dinerMenu);
		allMenu.add(cafeMenu);
		
		pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast","Pancake with Scrambled",true,2.99));
		pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast","Pancakes with fried eggs,sausage",false,2.99));
		
		dinerMenu.add(new MenuItem("Vegetarian BLT","(Fakin's)Bacon with lettuce & tomato",true,2.99));
		dinerMenu.add(new MenuItem("BLT","Bacon with lettuce & tomato on whole wheat",false,2.99));
		dinerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("Apple Pie","Apple pie with a flakey crust,topped with vanilla ice cream",true,1.59));
		dessertMenu.add(new MenuItem("Cheesecake","Creamy New York cheesecake,with a chocolate graham crust",true,1.99));
		dessertMenu.add(new MenuItem("Sorbet","A scoop of raspberry and a scoop of lime",true,1.89));
		
		cafeMenu.add(new MenuItem("Veggie Burger and Air Fries","Veggie burger on a whole wheat bun,lettuce,tomato,and fries",true,3.99));
		cafeMenu.add(new MenuItem("Soup of the day","A cup of the soup of the day,with a side salad",false,3.69));
	    cafeMenu.add(new MenuItem("Burrito","A large burrito,with whole pinto beans,salsa,guacamole",true,4.29));	
		
	    
		Waitress waitress = new Waitress(allMenu);
		//waitress.print();
		
		waitress.printVegeterain();
		
		
		
	}

}
