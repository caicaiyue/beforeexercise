package exercise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Stack;

public class TestStack {
	Stack s1 = new Stack();
	Stack s2 = new Stack();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TestStack ts = new TestStack();
		int i = 1;
		ts.enquee(i);
		ts.enquee(3);
		ts.enquee(5);
		ts.enquee(8);
		ts.enquee("hello");
		ts.enquee("你好");
		ts.dequee();
		ts.dequee();
		ts.dequee();
		ts.dequee();
		ts.dequee();
		Object obj = new Double(22.22);
		System.out.println(obj);*/
		Long l = System.currentTimeMillis();
		Date d = new Date();
		System.out.println(l);
		System.out.println(d);
		Date d2 = new Date(l);
		System.out.println(d2);
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//GregorianCalendar gc = new GregorianCalendar();
		String dataStr = sd.format(d2);
		System.out.println(dataStr);
		
	}
	
	public void enquee(Object obj){
		if(obj!=null){
			if(s1.isEmpty()){
				s1.push(obj);
			}else{
				Object temp;
				while(!s1.isEmpty()){
					temp = s1.pop();
					s2.push(temp);
				}
				s1.push(obj);
				while(!s2.isEmpty()){
					temp = s2.pop();
					s1.push(temp);
				}
				
			}
		}
	}
	
	public Object dequee(){
		if(s1.isEmpty()){
			System.out.println("队列已经空了");
			return null;
		}else{
			Object obj = s1.pop();
			System.out.println(obj);
			return obj;
		}
		
	}
	

}
