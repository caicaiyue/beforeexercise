package exercise;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGui1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JButton button = new JButton("Click me");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		
	}

}
