package exercise;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class NewFrame {
	JFrame frame;
	JPanel mainPanel;
	ArrayList<JCheckBox> checkboxList; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewFrame nf = new NewFrame();
		nf.setFrame();
	}

	public void setFrame() {
		// TODO Auto-generated method stub
		frame = new JFrame("Cyber BeatBox");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		JButton b1 = new JButton("start");
		JButton b2 = new JButton("Stop");
		JButton b3 = new JButton("Tempo Up");
		JButton b4 = new JButton("Tempo Down");
		
		JPanel background = new JPanel();
		background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		
		JPanel p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		background.add(BorderLayout.WEST,p1);
		
		
		JLabel l1 = new JLabel("Bass Drum");
		JLabel l2 = new JLabel("Closed Hi-Hat");
		JLabel l3 = new JLabel("Open Hi-Hat");
		
		JPanel p2 = new JPanel();
		p2.add(l1);
		p2.add(l2);
		p2.add(l3);
		p2.setLayout(new BoxLayout(p2,BoxLayout.Y_AXIS));
		background.add(BorderLayout.EAST,p2);
		
		frame.getContentPane().add(background);
		
		
		frame.setVisible(true);
		frame.setSize(300, 300);
	}

}
