package testmidi;

public class QuizCard {
	String question;
	String anwser;
	QuizCard(String q,String a){
		question = q;
		anwser = a;
	}
	
	public String getQuestion(){
		return question;
	}
	
	public String getAnswer(){
		return anwser;
	}
}
