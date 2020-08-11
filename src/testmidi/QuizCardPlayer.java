package testmidi;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import javax.swing.*;

import testmidi.QuizCardBuilder2.NewMenuListener;
import testmidi.QuizCardBuilder2.SaveMenuListener;

public class QuizCardPlayer {
	JFrame frame;
	JButton showanswer;
	JTextArea display;
	JTextArea answer;
	ArrayList<QuizCard> cardlist;
	QuizCard currentcard;
	int currentindex;
	boolean isanswer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizCardPlayer qcp = new QuizCardPlayer();
		qcp.setGUI();
	}

	public void setGUI() {
		// TODO Auto-generated method stub
		frame = new JFrame("Quiz Card Player");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Box background = new Box(BoxLayout.Y_AXIS);
		
		display = new JTextArea(6,20);
		display.setLineWrap(true);
		JScrollPane qscroller = new JScrollPane(display);
		qscroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qscroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		showanswer = new JButton("show anwser");
		showanswer.addActionListener(new showanswer());
		
		answer = new JTextArea(6,10);
		answer.setLineWrap(true);
		JScrollPane ascroller = new JScrollPane(answer);
		ascroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		ascroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openMenuItem = new JMenuItem("open");
		openMenuItem.addActionListener(new OpenMenuItem());
		fileMenu.add(openMenuItem);
		menuBar.add(fileMenu);
		
		background.add(qscroller);
		background.add(showanswer);
		
		cardlist=new ArrayList<QuizCard>();
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(BorderLayout.CENTER,background);
		frame.setSize(500, 600);
		frame.setVisible(true);
	}
	
	public class showanswer implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(isanswer){
				display.setText(currentcard.getAnswer());
				showanswer.setText("Next Card");
				isanswer=false;
			}else{
				if(currentindex<cardlist.size()){
					showNextCard();
				}else{
					display.setText("没有更多卡片了");
					showanswer.setEnabled(false);
				}
			}
		}
		
	}
	
	public void showNextCard() {
		// TODO Auto-generated method stub
		currentcard = cardlist.get(currentindex);
		currentindex++;
		display.setText(currentcard.getQuestion());
		showanswer.setText("show answer");
		isanswer=true;
	}
	
	public class OpenMenuItem implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JFileChooser fileopen = new JFileChooser();
			fileopen.showOpenDialog(frame);
			loadFile(fileopen.getSelectedFile());
		}

		private void loadFile(File file) {
			// TODO Auto-generated method stub
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String word = br.readLine();
				String q = null;
				String a = null;
				while(word!=null){
					String s[] = word.split(",");
					for(int i=0;i<s.length;i++){
						if((i%2)==0){
							q = s[i];
						}else{
							a = s[i];
						}
					}
				makecard(q,a);
				
					word = br.readLine();
				}
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		private void makecard(String q, String a) {
			// TODO Auto-generated method stub
			QuizCard card = new QuizCard(q,a);
			cardlist.add(card);
			System.out.println("make a card");
		}
		
	}
	

}
