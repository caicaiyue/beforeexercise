package exercise;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyDrawPanel extends JPanel implements ActionListener {
	JFrame f;
	Button b1;
	Label l1;
	static MyDrawPanel mp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       mp = new MyDrawPanel();
       mp.go();
	}
	
	private void go() {
		// TODO Auto-generated method stub
		f = new JFrame("change color");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1 = new Button("Change Color");
		l1 = new Label("Global");
		f.getContentPane().add(BorderLayout.SOUTH,b1);
		f.getContentPane().add(BorderLayout.CENTER,mp);
		f.getContentPane().add(BorderLayout.WEST, l1);
		b1.addActionListener(this);
		f.setSize(300, 300);
		f.setVisible(true);
	}

	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		int red =(int)(Math.random()*255);
		int blue =(int)(Math.random()*255);
		int green =(int)(Math.random()*255);
		Color startColor = new Color(red,green,blue);
		
		red = (int)(Math.random()*255);
		blue =(int)(Math.random()*255);
		green =(int)(Math.random()*255);
		Color endColor = new Color(red,green,blue);
		
		GradientPaint gradient = new GradientPaint(70,70,startColor,150,150,endColor);
		g2d.setPaint(gradient);
		g2d.fillOval(70, 70, 100, 100);
		
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//b1.setText("clicked");
		f.repaint();
		
	}

}
