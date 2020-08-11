package headfirstmode;

import java.util.Arrays;

//饿汉式的单例模式
public class Singleton {
	private static Singleton INSTANCE = new Singleton();
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return INSTANCE;
	}
	
	public String toString(){
		return INSTANCE.getClass().getName();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Singleton.getInstance());
		
	}

}
