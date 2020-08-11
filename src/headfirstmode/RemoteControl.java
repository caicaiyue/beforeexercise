package headfirstmode;

import java.util.Stack;

public class RemoteControl {
	command[] onCommands;
	command[] offCommands;
	command undoCommand;
	Stack<command> s;
 
	public RemoteControl() {
		onCommands = new command[7];
		offCommands = new command[7];

		command noCommand = new NoCommand();
		undoCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		
		s = new Stack<command>();

	}

	public void setCommand(int slot, command onCommand, command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
		s.push(undoCommand);
	}

	public void undoButtonWasPushed() {
		if(!s.isEmpty()){
			command c = s.pop();
			c.undo();
		}
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
		s.push(undoCommand);
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("\n-------RemoteControl-------\n");
		for(int i=0;i<onCommands.length;i++){
			sb.append("[slot"+i+"]"+onCommands[i].getClass().getName()+"   "+offCommands[i].getClass().getName()+"\n");
		}
		return sb.toString();
	}
}
