package testmidi;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;

public class QuizCardBuilder2 {
	
	JFrame frame;
	JPanel mainpanel;
	JTextArea question;
	JTextArea answer;
	ArrayList<QuizCard> cardlist;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizCardBuilder2 qcb = new QuizCardBuilder2();
		qcb.setGUI();
	}


	public void setGUI() {
		// TODO Auto-generated method stub
		frame = new JFrame("Quiz Card Builder");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Box background = new Box(BoxLayout.Y_AXIS);
		//JPanel background = new JPanel();
		
		
		
		question = new JTextArea(6,20);
		question.setLineWrap(true);
		question.setWrapStyleWord(true);
		JScrollPane qscroller = new JScrollPane(question);
		qscroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qscroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		cardlist = new ArrayList<QuizCard>();
		
		answer = new JTextArea(6,20);
		answer.setLineWrap(true);
		answer.setWrapStyleWord(true);
		JScrollPane ascroller = new JScrollPane(answer);
		ascroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		ascroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		
		JLabel qlabel = new JLabel("Question:");
		JLabel alabel = new JLabel("Answer");
		JButton nextbutton = new JButton("Next Card");
		nextbutton.addActionListener(new nextListener());
		
		background.add(qlabel);
		background.add(qscroller);
		//background.add(question);
		background.add(alabel);
		background.add(ascroller);
		//background.add(answer);
		background.add(nextbutton);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem newMenuItem = new JMenuItem("New");
		newMenuItem.addActionListener(new NewMenuListener());
		JMenuItem saveMenuItem = new JMenuItem("Save");
		saveMenuItem.addActionListener(new SaveMenuListener());
		fileMenu.add(newMenuItem);
		fileMenu.add(saveMenuItem);
		menuBar.add(fileMenu);
		
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(BorderLayout.CENTER,background);
		frame.setSize(500, 600);;
		frame.setVisible(true);
		
	}
	
	public class nextListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			QuizCard card = new QuizCard(question.getText(),answer.getText());
			cardlist.add(card);
			clearCard();
		}
		
	}
	
	public void clearCard() {
		// TODO Auto-generated method stub
		question.setText(" ");
		answer.setText(" ");
		question.requestFocus();
	}
	
	public class NewMenuListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			cardlist.clear();
			clearCard();
		}
		
	}
	
	public class SaveMenuListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			QuizCard card = new QuizCard(question.getText(),answer.getText());
			cardlist.add(card);
			JFileChooser filesave = new JFileChooser();
			filesave.showSaveDialog(frame);
			saveFile(filesave.getSelectedFile());
		}

		
	}
	public void saveFile(File file) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			for(QuizCard card:cardlist){
				bw.write(card.getQuestion()+"/");
				bw.write(card.getAnswer()+"\n");
			}
			
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
