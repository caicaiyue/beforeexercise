package exercise;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
import javax.swing.JFrame;

public class MiniMusicPlayer implements ControllerEventListener{

	JFrame  frame;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniMusicPlayer mmp = new MiniMusicPlayer();
		mmp.go();
		
	}
	
	public void go(){
		Sequencer sequencer;
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			int[] eventsIWant = {127};
			sequencer.addControllerEventListener(this, eventsIWant);
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			for(int i=5;i<61;i+=4){
				track.add(makeEvcent(144,1,i,100,i));
				track.add(makeEvcent(176,1,127,0,i));
				track.add(makeEvcent(128,1,i,100,i+2));
			}
			
			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			sequencer.start();
			
		} catch (MidiUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidMidiDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static MidiEvent makeEvcent(int cmd, int chan, int one, int two, int tick) {
		// TODO Auto-generated method stub
		MidiEvent event = null;
		try {
			ShortMessage message = new ShortMessage();
			message.setMessage(cmd,chan,one,two);
			event= new MidiEvent(message,tick);
		} catch (InvalidMidiDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return event;
		
		
	}

	@Override
	public void controlChange(ShortMessage event) {
		// TODO Auto-generated method stub
		System.out.println("la");
	}
	
	

	

}
