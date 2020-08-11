package exercise;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;

public class ball {
	int x =70;
	int y =70;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ball b = new ball();
		b.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);getClass();
		DrawPanel dp = new DrawPanel();
		frame.getContentPane().add(dp);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		for(int i=0;i<130;i++){
			x++;
			y++;
			dp.repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	 class DrawPanel extends JPanel {
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
				
				g2d.setPaint(Color.WHITE);
				g.fillRect(0, 0, this.getWidth(), this.getHeight());
				g2d.setPaint(gradient);
				g2d.fillOval(x, y, 40, 40);			
			
			
		}
	}

}
