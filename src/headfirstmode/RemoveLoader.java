package headfirstmode;

import java.util.Random;

public class RemoveLoader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = new RemoteControl();
		Light light = new Light();

		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
		
		
		rc.setCommand(0, lightOnCommand, lightOffCommand);
		rc.setCommand(1, ceilingFanHigh, ceilingFanLow);
		
		System.out.println(rc);
		
		
		rc.onButtonWasPushed(0);
		rc.offButtonWasPushed(0);
		rc.onButtonWasPushed(1);
		rc.offButtonWasPushed(1);
		// rc.undoButtonWasPushed();
		
		System.out.println("*************");
		
		while(rc.s!=null){
			rc.undoButtonWasPushed();
		}

	}

}
