package headfirstmodeagain;

public class DessertMenu extends Menu {

	public DessertMenu(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
		menuComponents.add(new MenuItem("Apple Pie","Apple pie with a flakey crust,topped with vanilla ice cream",true,1.59));
		menuComponents.add(new MenuItem("Cheesecake","Creamy New York cheesecake,with a chocolate graham crust",true,1.99));
		menuComponents.add(new MenuItem("Sorbet","A scoop of raspberry and a scoop of lime",true,1.89));
	}

}
