package headfirstmode;

public class LightOnCommand implements command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		// TODO Auto-generated method stub
		light.on();
	}

	public void undo() {
		// TODO Auto-generated method stub
		light.off();
	}

}
