package testmidi;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.sound.midi.*;
import javax.swing.*;

public class BeatBox2 {
	
	JFrame frame;
	JPanel mainpanel;
	String[] instrumentname = {"Bass Drum","Closed Hi-Hat","Open Hi-Hat","Acoustic Snare",
							   "Crash Cymbal","Hand Clap","High Tom","Hi Bongo","Maracas",
							   "Whistle","Low Conga","Cowbell","Vibraslap","Low-mid Tom",
							   "High Agogo","Open Hi Conga"};
	int[] instruments = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};
	ArrayList<JCheckBox> checklist;
	Sequencer player;
	Sequence sequence;
	Track track;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeatBox2 bb2 = new BeatBox2();
		bb2.setGUI();
		

	}

	public void setGUI() {
		// TODO Auto-generated method stub
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout layout = new BorderLayout();
		JPanel background  = new JPanel(layout);
		background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		Box buttonbox = new Box(BoxLayout.Y_AXIS);
		JButton start = new JButton("start");
		buttonbox.add(start);
		start.addActionListener(new MyStartListener());
		JButton stop = new JButton("stop");
		buttonbox.add(stop);
		stop.addActionListener(new MyStopListener());
		
		GridLayout namegrid = new GridLayout(16,1);
		namegrid.setVgap(1);
		JPanel namepanel = new JPanel(namegrid);
		for(int i=0;i<16;i++){
			JLabel name = new JLabel(instrumentname[i]);
			namepanel.add(name);
		}
		
		checklist = new ArrayList<JCheckBox>();
		GridLayout checkgrid = new GridLayout(16,16);
		checkgrid.setHgap(2);
		checkgrid.setVgap(1);
		mainpanel = new JPanel(checkgrid);
		for(int i=0;i<256;i++){
			JCheckBox j = new JCheckBox();
			j.setSelected(false);
			checklist.add(j);
			mainpanel.add(j);
		}
		
		SetupSequence();
		
		background.add(BorderLayout.EAST,buttonbox);
		background.add(BorderLayout.WEST,namepanel);
		background.add(BorderLayout.CENTER,mainpanel);
		frame.getContentPane().add(background);
		frame.setBounds(50, 50, 300, 300);
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public void SetupSequence() {
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

	public class MyStartListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			buildTrackandStart();
		}

		
		
	}
	
	public void buildTrackandStart() {
		// TODO Auto-generated method stub
		sequence.deleteTrack(track);
		track = sequence.createTrack();
		int[] tracklist = null;
		
		for(int i=0;i<16;i++){
			
			tracklist = new int[16];
			int key = instruments[i];
			
			for(int j=0;j<16;j++){
				JCheckBox c = (JCheckBox)checklist.get((i*16)+j);
				if(c.isSelected()){
					tracklist[j]=key;
				}else{
					tracklist[j]=0;
				}
			}
			
			maketrack(tracklist);
		}
		
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
	
	public void maketrack(int[] tracklist) {
		// TODO Auto-generated method stub
		for(int i=0;i<16;i++){
			int key = tracklist[i];
			if(key!=0){
				track.add(makeevent(144,9,key,100,i));
				track.add(makeevent(128,9,key,100,i+10));
			}
		}
	}

	public MidiEvent makeevent(int cmd, int channel, int one, int two, int tick) {
		MidiEvent event = null;
		ShortMessage a = new ShortMessage();
		try {
			a.setMessage(cmd, channel, one, two);
			event = new MidiEvent(a,tick);
		} catch (InvalidMidiDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return event;
		// TODO Auto-generated method stub
		
	}

	public class MyStopListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			player.stop();
		}
		
	}

}
