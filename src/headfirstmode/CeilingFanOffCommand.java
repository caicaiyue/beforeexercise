package headfirstmode;

public class CeilingFanOffCommand implements command {
	CeilingFan ceilingFan;
	int previous;
	public CeilingFanOffCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		previous = ceilingFan.getSpeed();
		ceilingFan.off();
		ceilingFan.printSpeed();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		if(previous==ceilingFan.HIGH){
			ceilingFan.high();
		}else if(previous==ceilingFan.LOW){
			ceilingFan.low();
		}else if(previous==ceilingFan.MEDIUM){
			ceilingFan.medium();
		}else if(previous==ceilingFan.OFF){
			ceilingFan.off();
		}
		
		ceilingFan.printSpeed();
	}

}
