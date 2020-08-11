package exercise;

import java.awt.*;

import javax.swing.*;

public class Animation {
	int x = 70;
	int y = 70;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animation a = new Animation();
		a.go();
	}

	public void go() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DrawPanel dp = new DrawPanel();
		frame.getContentPane().add(dp);
		frame.setSize(500, 270);
		frame.setVisible(true);
		/*for(int i=0;i<127;i++,x++,y++){    //画从大矩阵变为小矩阵。
			x++;
			frame.repaint();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		for(int i=0;i<120;i++){
			x+=3;
			y++;
			frame.repaint();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public class DrawPanel extends JPanel{
		public void paintComponent(Graphics g){
			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			/*g.setColor(Color.blue);
			g.fillRect(x, y, 500-x*2, 270-y*2);*/
			g.setColor(Color.blue);
			g.fillOval(x, y, 30,30);
			
		}
	}

}
