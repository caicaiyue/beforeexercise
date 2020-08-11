package mode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       String s1 = getValue("className");
       System.out.println(s1);
       String s2 = getValue("methodName");
       System.out.println(s2);
       String s3 = getValue("parameter");
       
       Class student = Class.forName(s1);
       Constructor c1 = student.getConstructor();
       java.lang.Object obj1 = c1.newInstance();
       Method m1 = student.getDeclaredMethod(s2,String.class);
       m1.invoke(obj1,s3);
       
	}
	
	public static String getValue(String key) throws Exception{
		Properties pro = new Properties();
		FileReader in = new FileReader("E:\\config.txt");
		pro.load(in);
		in.close();
		return pro.getProperty(key);
		
	}

}
