package headfirstmode;

public class CeilingFanMediaCommand implements command {
	CeilingFan ceilingFan;
	int previous;
	
	public CeilingFanMediaCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		previous = ceilingFan.getSpeed();
		ceilingFan.medium();
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
