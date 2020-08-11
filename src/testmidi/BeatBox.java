package testmidi;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.sound.midi.*;
import javax.swing.*;

import org.jivesoftware.smack.packet.Message;

public class BeatBox {
	JFrame frame;
	JPanel mainpanel;
	ArrayList<JCheckBox> checkboxlist; 
	String[] instrumentName = {"Bass Drum","Closed Hi-Hat","Open Hi-Hat","Acoustic Snare",
							   "Crash Cymbal","Hand Clap","High Tom","Hi Bongo","Maracas",
							   "Whistle","Low Conga","Cowbell","Vibraslap","Low-mid Tom",
							   "High Agogo","Open Hi Conga"};
	int[] instruments = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};
	Sequencer player;
	Sequence  sequence;
	Track track;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeatBox bb = new BeatBox();
		bb.setGUI();
	}

	public void setGUI() {
		// TODO Auto-generated method stub
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout layout = new BorderLayout();
		JPanel background = new JPanel(layout);
		background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		Box buttonbox = new Box(BoxLayout.Y_AXIS);
		JButton start = new JButton("start");
		start.addActionListener(new MyStartListener());
		buttonbox.add(start);
		JButton stop  = new JButton("Stop");
		buttonbox.add(stop);
		stop.addActionListener(new MyStopListener());
		
		Box namebox = new Box(BoxLayout.Y_AXIS);
		GridLayout namegrid = new GridLayout(16,1);
		namegrid.setVgap(1);
		JPanel namepanel = new JPanel(namegrid);
		for(int i=0;i<16;i++){
			JLabel label = new JLabel(instrumentName[i]);
			namepanel.add(label);
		}
		
		checkboxlist = new ArrayList<JCheckBox>();
		GridLayout grid = new GridLayout(16,16);
		grid.setVgap(1);
		grid.setHgap(2);
		mainpanel = new JPanel(grid);
		for(int i=0;i<256;i++){
			JCheckBox c = new JCheckBox();
			c.setSelected(false);
			checkboxlist.add(c);
			mainpanel.add(c);
		}
		
		SetSequence();
		
		
		background.add(BorderLayout.EAST,buttonbox);
		background.add(BorderLayout.WEST,namepanel);
		background.add(BorderLayout.CENTER,mainpanel);
		frame.add(background);
		frame.setBounds(50,50,300, 300);
		frame.pack();
		frame.setVisible(true);
		
		
		
	}
	
	public void SetSequence() {
		// TODO Auto-generated method stub
		try {
			player = MidiSystem.getSequencer();
			player.open();
			sequence = new Sequence(Sequence.PPQ,4);
			track = sequence.createTrack();
			player.setTempoInBPM(120);			
			
		} catch (MidiUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidMidiDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void buildTrackAndStart() {
		// TODO Auto-generated method stub
		int[] tracklist = null;
		sequence.deleteTrack(track);
		track = sequence.createTrack();
		
		for(int i=0;i<16;i++){
			tracklist = new int[16];
			int key = instruments[i];
			
			for(int j=0;j<16;j++){
				JCheckBox jc = (JCheckBox)checkboxlist.get(i*16+j);
				if(jc.isSelected()){
					tracklist[j]=key;
				}else{
					tracklist[j]=0;
				}
			}
			
			makeTrack(tracklist);
			//track.add(makeevent(176,1,127,0,16));
		}
		
		//track.add(makeevent(192,9,1,0,15));
		
		try {
			player.setSequence(sequence);
			player.setLoopCount(player.LOOP_CONTINUOUSLY);
			player.start();
			player.setTempoInBPM(120);
			
		} catch (InvalidMidiDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void makeTrack(int[] tracklist) {
		// TODO Auto-generated method stub
		for(int i=0;i<16;i++){
			int key = tracklist[i];
			if(key!=0){
				track.add(makeevent(144,9,key,100,i));
				track.add(makeevent(128,9,key,100,i+10));
			}
		}
	}

	private MidiEvent makeevent(int comd, int chan, int one, int two, int tick) {
		// TODO Auto-generated method stub
		MidiEvent event = null;
		ShortMessage a = new ShortMessage();
		try {
			a.setMessage(comd,chan,one,two);
			event = new MidiEvent(a,tick);
		} catch (InvalidMidiDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return event;
	}

	public class MyStartListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			buildTrackAndStart();
		}
		
		
	}
	
	public class MyStopListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			player.stop();
		}
		
		
	}
	
	

}
