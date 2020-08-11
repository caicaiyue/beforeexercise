package exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class multdownload implements Runnable{

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		multdownload m = new multdownload();
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		t1.start();
		t2.start();
		/*Thread t3 = new Thread(m);
		t3.start();*/
		

	}
	
	public static void download(FileInputStream is,FileOutputStream os){
		int b;
	    try {
			while((b=is.read())!=-1){
				os.write(b);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static int check(File f, String s){
		String[] sf = f.list();
		int index=0;
		for(int i=0;i<sf.length;i++){
			if(s.equals(sf[i])){
				index++;
			}
		}
		if(index>0){
			return 1;
		}else{
			return 0;
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		File source = new File("E:\\study\\javastudy\\source");
		File destionation = new File("E:\\study\\javastudy\\download");
		String[] ss = source.list();
		for(int i=0;i<ss.length;i++){
			if((check(destionation, ss[i]))==0){
				try {
					FileInputStream is = new FileInputStream("E:\\study\\javastudy\\source\\"+ss[i]);
					FileOutputStream os = new FileOutputStream("E:\\study\\javastudy\\download\\"+ss[i]);
					download(is,os);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		Date d = new Date();
		System.out.println(d);
		
	}

}
