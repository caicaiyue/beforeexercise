package testmidi;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.*;

public class QuizCardBuilder {
	private JFrame frame;
	private JTextArea question;
	private JTextArea answer;
	private ArrayList<QuizCard> cardlist;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizCardBuilder qcb = new QuizCardBuilder();
		qcb.setGUI();
		
	}

	public void setGUI() {
		// TODO Auto-generated method stub
		frame = new JFrame("Quiz Card Builder");
		cardlist = new ArrayList<QuizCard>();
		//BorderLayout layout = new BorderLayout();
		Box mainpanel = new Box(BoxLayout.Y_AXIS);
		//JPanel mainpanel = new JPanel();
		question = new JTextArea(6,20);
		question.setLineWrap(true);
		question.setWrapStyleWord(true);
		
		JScrollPane qScroller = new JScrollPane(question);
		qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		answer = new JTextArea(6,20);
		answer.setLineWrap(true);
		answer.setWrapStyleWord(true);
		
		JScrollPane aScroller = new JScrollPane(answer);
		aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton nextButton = new JButton("Next Card");
		nextButton.addActionListener(new nextCard());
		JLabel qlabel = new JLabel("Question:");
		JLabel alabel = new JLabel("Answer:");
		
		mainpanel.add(qlabel);
		mainpanel.add(qScroller);
		mainpanel.add(alabel);
		mainpanel.add(aScroller);
		mainpanel.add(nextButton);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem newMenuItem = new JMenuItem("New");
		newMenuItem.addActionListener(new newMenu());
		JMenuItem saveMenuItem = new JMenuItem("Save");
		saveMenuItem.addActionListener(new saveMenu());
		JMenuItem readMenuItem = new JMenuItem("Read");
		readMenuItem.addActionListener(new readMenu());
		
		fileMenu.add(newMenuItem);
		fileMenu.add(saveMenuItem);
		fileMenu.add(readMenuItem);
		menuBar.add(fileMenu);
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(BorderLayout.CENTER, mainpanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 600);
		frame.setVisible(true);
	}
	
	public class nextCard implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			QuizCard card = new QuizCard(question.getText(),answer.getText());
			cardlist.add(card);
			clearcard();
		}
		
	}
	
	public class newMenu implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			cardlist.clear();
			clearcard();
		}
	}
	
	public class saveMenu implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			QuizCard qc = new QuizCard(question.getText(),answer.getText());
			cardlist.add(qc);
			
			JFileChooser filesave = new JFileChooser();
			filesave.showSaveDialog(frame);
			SaveFile(filesave.getSelectedFile());
		}

	}
	
	public void SaveFile(File file) {
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
	
	public class readMenu implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JFileChooser fileread = new JFileChooser();
			fileread.showOpenDialog(frame);
			ReadFile(fileread.getSelectedFile());
		}


	}
	
	private void ReadFile(File file) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String word = br.readLine();
			String q = null;
			String a = null;
			while(word!=null){
				System.out.println("word:"+word);
				String[] s = word.split(",");
				for(int i=0;i<s.length;i++){
					if((i%2)==0){
						q = s[i];
						question.setText(q);
					}else{
						a = s[i];
						answer.setText(a);
					}
				}
				
				
				QuizCard card = new QuizCard(q,a);
				cardlist.add(card);
				//clearcard();
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
	
	public void clearcard() {
		// TODO Auto-generated method stub
		question.setText(" ");
		answer.setText(" ");
		question.requestFocus();
	}
	
	
	
	
	
	

}
