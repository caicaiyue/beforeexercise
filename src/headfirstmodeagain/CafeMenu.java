package headfirstmodeagain;

import java.util.ArrayList;

public class CafeMenu extends Menu {

	public CafeMenu(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
		menuComponents.add(new MenuItem("Veggie Burger and Air Fries",
				"Veggie burger on a whole wheat bun,lettuce,tomato,and fries", true, 3.99));
		menuComponents.add(new MenuItem("Soup of the day","A cup of the soup of the day,with a side salad",false,3.69));
		menuComponents.add(new MenuItem("Burrito","A large burrito,with whole pinto beans,salsa,guacamole",true,4.29));
	}

}
