package testmidi;

import java.awt.BorderLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;

public class QuizCardPlayer2 {
	JFrame frame;
	JTextArea display;
	JButton button;
	ArrayList<QuizCard> cardlist;
	QuizCard currentcard;
	boolean isanswer;
	int currentcardindex;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizCardPlayer2 qcp = new QuizCardPlayer2();
		qcp.setGUI();
	}

	public void setGUI() {
		// TODO Auto-generated method stub
		frame = new JFrame("QuizCard Player");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Box background = new Box(BoxLayout.Y_AXIS);
		display = new JTextArea(6,20);
		JScrollPane scroller = new JScrollPane(display);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		background.add(scroller);
		
		button = new JButton("show question");
		button.addActionListener(new buttonListner());
		background.add(button);
		
		cardlist = new ArrayList<QuizCard>();
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openMenuItem = new JMenuItem("Open File");
		fileMenu.add(openMenuItem);
		openMenuItem.addActionListener(new OpenMenu());
		menuBar.add(fileMenu);
		frame.setJMenuBar(menuBar);
		
		frame.getContentPane().add(BorderLayout.CENTER, background);
		frame.setSize(300,300);
		frame.setVisible(true);
		
	}
	
	public class buttonListner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(isanswer){
				display.setText(currentcard.anwser);
				button.setText("Next Card");
				isanswer = false;
			}else{
				if(currentcardindex<cardlist.size()){
					showcard();
				}else{
					display.setText("No more Cards");
					button.setEnabled(false);
				}
			}
		}

		private void showcard() {
			// TODO Auto-generated method stub
			currentcard = cardlist.get(currentcardindex);
			currentcardindex++;
			display.setText(currentcard.question);
			button.setText("show answer");
			isanswer=true;
		}
		
	}
	
	
	public class OpenMenu implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JFileChooser fileopen = new JFileChooser();
			fileopen.showOpenDialog(frame);
			LoadFile(fileopen.getSelectedFile());
		}

		public void LoadFile(File file) {
			// TODO Auto-generated method stub
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String word = null;
				while((word=br.readLine())!=null){
					makecard(word);
				}
				br.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void makecard(String word) {
			// TODO Auto-generated method stub
			String[] cardarray = word.split(",");
			QuizCard card = new QuizCard(cardarray[0],cardarray[1]);
			cardlist.add(card);
			System.out.println("make a card");
		}

		
		
	}

}
