package exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileName {
    static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			File file = new File("E:\\A");
			showFile(file,count);
	}
    
	public static void showFile(File f,int count){
		File[] ff = f.listFiles();
		int num = count;
		for(File f1:ff){
			printFile(f1,count);
			if(f1.isDirectory()){
				count++;
				showFile(f1,count);
			}
			count = num;
		}
	}
	
	public static void printFile(File f,int count){
		String s = f.getName();
		printblank(count);
		System.out.println(s.toString());
	}
	
	
	public static void printblank(int i){
		for(int j=0;j<i;j++){
			System.out.print("-");
		}
	}
	

}
