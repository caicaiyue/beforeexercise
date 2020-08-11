package mode;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;



public class fanshe {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
         
		 Class  stuClass3 = Class.forName("mode.Student");//注意此字符串必须是真实路径，就是带包名的类路径，包名.类名  
        
		//System.out.println("**********************所有公有构造方法*********************************");  
        Constructor[] conArray = stuClass3.getConstructors();
        
        //for(Constructor c:conArray){
        //	System.out.println(c);
        //}
        
        //System.out.println("************所有的构造方法(包括：私有、受保护、默认、公有)***************");  
        //Constructor[] conArray1 = stuClass3.getDeclaredConstructors();
        //for(Constructor c:conArray1){
        //	System.out.println(c);
        //}
        
       
        Constructor con1 = stuClass3.getConstructor(null);
        
        java.lang.Object obj1 = con1.newInstance();
        
        //System.out.println(obj1);
        
       // System.out.println("************************");
        
       // Constructor con2 = stuClass3.getDeclaredConstructor(String.class);
        
       //java.lang.Object obj2 = con2.newInstance("peter");
       // System.out.println(obj2);
        
       // System.out.println("************获取所有公有的字段********************");  
      //  Field[] fieldArray1 = stuClass3.getFields();  
   
       // for(Field f : fieldArray1){  
       //     System.out.println(f);  
       // }  
        
        
       // System.out.println("************获取所有的字段********************");  
       
       //Field[] fieldArray2 = stuClass3.getDeclaredFields();
        
       // for(Field f:fieldArray2){
       // 	System.out.println(f);
       // }
       
     /* Field f1 = stuClass3.getField("name");
       //System.out.println(f1);
       f1.set(obj1, "peter");
       
       
       Field f2 =stuClass3.getDeclaredField("age");
       //System.out.println(f2);
       f2.set(obj1, 16);
       
       Field f3 = stuClass3.getDeclaredField("sex");
       f3.set(obj1,'M');
      
       
       Field f4 =stuClass3.getDeclaredField("phoneNum");
       //System.out.println(f3);
       f4.setAccessible(true);
       f4.set(obj1, "12345678901");
       
       System.out.println(obj1);
       
       Student s1 = (Student) obj1;
       System.out.println(s1.sex);*/
       
      /* Method[] methodArray1 = stuClass3.getMethods();
     // for(Method m:methodArray1){
    //	   System.out.println(m);
     //  }
       
       
      // Method[] methodArray2 = stuClass3.getDeclaredMethods();
      // for(Method m:methodArray2){
    //	   System.out.println(m);
    //   }*/
       
      Method m1 = stuClass3.getDeclaredMethod("show1",String.class);
      // m1.invoke(obj1, "Bob");
       
       Method m2 = stuClass3.getDeclaredMethod("show4",int.class);
       
       Method m3 = stuClass3.getDeclaredMethod("show2");
       
       m2.setAccessible(true);
       //m2.invoke(obj1, 18);
       //System.out.println(obj1);
       
       
      
       //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
       /*Date d1 = format.parse("2019-02-26");
       Date d2 = format.parse("2019-05-20");
       Date d3 = new Date(121,01,27);
       
       System.out.println(d1.getDate());
       int i = d1.getDate();
       i= i+1;
       System.out.println(i);
       d1.setDate(i);*/
       
      //Long l1 = d1.getTime();
      //System.out.println(l1);
      
      
      //Long l3 = d3.getTime();
      
      //Long ll = l3-l1;
     // System.out.println(l3);
     // System.out.println(ll);
      
      //int ii = (int) ((l3-l1)/1000)/3600/24;
      //int ii1 = (int) (ll/(3600*1000*24));
      //System.out.println(ii);
      //System.out.println(ii1);
     
      //Long l2 = d1.getTime();
      //System.out.println(l1);
       
      //System.out.println(format.format(d1));
      //System.out.println(format.format(d3));
      
      /*Calendar c1 = Calendar.getInstance();
      //c1.set(2019, 5, 9);
      ArrayList<Integer> list = new ArrayList<Integer>();
      int year = c1.get(Calendar.YEAR);
      list.add(year);
      int month = c1.get(Calendar.MONTH);
      list.add(month);
      int day = c1.get(Calendar.DATE);
      list.add(day);
      int dayofyear  = c1.get(Calendar.DAY_OF_YEAR);
      list.add(dayofyear);
      int dayofweek  = c1.get(Calendar.DAY_OF_WEEK);
      list.add(dayofweek);
      
      for(int i:list){
    	  System.out.println(i);
      }
      
     Calendar c2 = Calendar.getInstance();
     c2.set(2019, 5, 9);
     Date d2 = c2.getTime();
     
     System.out.println(format.format(d2));
     System.out.println(c2.get(Calendar.DAY_OF_YEAR));
     System.out.println(c2.get(Calendar.DAY_OF_WEEK));
     
     String s = "2019-10-1";
     Date d3 = format.parse(s);
     System.out.println(format.format(d3));*/
	}
	
	

}
