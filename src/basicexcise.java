import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class basicexcise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //printS();
	  //nonrepeatednumber();
		//bonus();
		//finddate();
		//sortnumber();
		//chengfabiao99();
		//printlingxing();
		//numbersum();
		//jiecheng();
		//System.out.println(diguijiecheng(5));
		//System.out.println(guessage(5));
		//scannumber();
		//guesshuiwenshu();
		//findsushuin100();
		//xuanzepaixu();
		//countmatrixdiagonalsummary();
		//yanghuitriangle();
		//changearrage();
		//printsequence();
		//Count3quit(500);	
		//judgedate();
		//insertnumber(5);
		//insertnumber(6);
		//insertarray(10);
		//insertnum(10);
		//guesspeach();
		//allPermutation("1223");
		//allocatenumber("122345");
		//pingpang();
		//findnumber();
		//printnumbertostar();
		//oushu();
		allocatenumber("122345");
	}
	
	public static void printS(){  
		//  题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制，即程序中的n
		
 		System.out.println("请输入加数a：");
		//BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("和输入加数的个数");
			//BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			
			Scanner sc = new Scanner(System.in);
			int a =sc.nextInt();
			int n = sc.nextInt();
			//int a = Integer.parseInt(br1.readLine());
			//int n = Integer.parseInt(br2.readLine());
			int sum = 0;
			int temp = 0;
			for(int i=0;i<n;i++){
				temp = temp*10+a;
				sum = temp+sum;
			}
			
			System.out.println(sum);
		    System.out.println(temp);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void nonrepeatednumber(){
		//有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？   
		int t=0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				for(int k=1;k<=4;k++){
					if(i!=j&&i!=k&&j!=k){
						t=t+1;
						System.out.println(100*i+10*j+k);
					}
				}
			}
		}
		System.out.println("这样的数字共有"+t+"个");
	}
	
	public static void bonus(){
		double bonus = 0;
		long profit;
	/*企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
	利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
	20万到40万之间时，高于20万元的部分，可提成5%；
	40万到60万之间时高于40万元的部分，可提成3%；
	60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
	从键盘输入当月利润I，求应发放奖金总数？     */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			profit = Long.parseLong(br.readLine());
			if(profit<=100000){
				bonus = (double) (profit*0.1);
			}else if(profit>100000&&profit<=200000){
				bonus = (double) (10000+0.075*(profit-100000));
			}else if(profit>200000&&profit<=400000){
				bonus = (double) (10000+0.075*100000+0.05*(profit-200000));
			}else if(profit>400000&&profit<=600000){
				bonus = (double) (10000+0.075*100000+0.05*200000+0.03*(profit-400000));
			}else if(profit>600000&&profit<=1000000){
				bonus = (double) (10000+0.075*100000+0.05*200000+0.03*200000+0.015*(profit-600000));
			}else if(profit>1000000){
				bonus = (double) (10000+0.075*100000+0.05*200000+0.03*200000+0.015*(profit-1000000));
			}
			
			System.out.println(bonus);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static void findinteger(){
		//一个整数，它加上100后是一个完全平方数，加上168又是一个完全平方数，请问该数是多少？
		for(int i=1;i<=100001;i++){
			if(Math.floor(Math.sqrt(i+100))==Math.sqrt(i+100)&&Math.floor(Math.sqrt(i+168))==Math.sqrt(i+168)){
				System.out.println(i);
			}
		}
	}
	
	
	public static void finddate(){
		//输入某年某月某日，判断这一天是这一年的第几天？
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int date = sc.nextInt();
		int sum = 0;
		int leap = 0;
		if((year%400==0)||(year%100!=0&&year%4==0)){
			leap = 1;
		}
		switch(month){
		case 1:
			sum = date;
			break;
		case 2:
		    sum = date+31;
		    break;
		case 3:
		    sum = date+31+28;
		    break;
		case 4:
			sum = date+31+28+31;
			break;	
		case 5:
			sum = date+31+28+31+30;
			break;	
		case 6:
			sum = date+31+28+31+30+31;
			break;		
		case 7:
			sum = date+31+28+31+30+31+30;
			break;
		case 8:
			sum = date+31+28+31+30+31+30+31;
			break;
		case 9:
			sum = date+31+28+31+30+31+30+31+31;
			break;
		case 10:
			sum = date+31+28+31+30+31+30+31+31+30;
			break;
		case 11:
			sum = date+31+28+31+30+31+30+31+31+30+31;
			break;
		case 12:
			sum = date+31+28+31+30+31+30+31+31+30+31+30;
			break;
	 }
		if(month>=3&&leap==1){
			sum =sum+1;
		}
		System.out.println(sum);
	}


   public static void sortnumber(){
	   //输入三个整数x,y,z，请把这三个数由小到大输出。 
	   Scanner sc = new Scanner(System.in);
	   int x = sc.nextInt();
	   int y = sc.nextInt();
	   int z = sc.nextInt();
	   int temp = 0;
	   int[] array  = {x,y,z};
	   for(int i=0;i<array.length;i++){
		   for(int j=i+1;j<array.length;j++){
			   if(array[i]>array[j]){
				   temp = array[i];
				   array[i] = array[j];
				   array[j] = temp;
			   }
		   }
	   }
	   for(int i=0;i<array.length;i++){
		   System.out.println(array[i]);
	   }
	   
   }
   
   public static void chengfabiao99(){
	   for(int i=1;i<=9;i++){
		   for(int j=1;j<=i;j++){
			   System.out.print(j);
			   System.out.print('*');
			   System.out.print(i);
			   System.out.print('=');
			   System.out.print(i*j);
			   System.out.print(" ");
		   }
		   System.out.print("\n");
	   }
   }
   
   public static void  printlingxing(){
	   //打印出菱形
	   int[] array = {1,3,6,8,6,3,1};
	  for(int i=0;i<array.length;i++){
		  for(int j=0;j<array[i];j++){
			  System.out.print("*");
		  }
		  System.out.println();
	  }
    }
   
   public static void numbersum(){
   //有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。 
   //fenzilist用户放分子数组，第三项以后的数字都是前两个值的和。
   //fenmulist用户放分母数组，第三项以后的数字都是前两个值的和。
   //sum 是两个数组分别取值相除得到的和。
	 float sum = (float) 0.000;
	 ArrayList<Float> fenzilist = new ArrayList<Float>();
	 ArrayList<Float> fenmulist = new ArrayList<Float>();
	 
	 for(int i=0;i<28;i++){
		 if(i==0){
			 fenzilist.add(i,(float) 2);
		 }if(i==1){
			 fenzilist.add(i,(float) 3);
		 }if(i>=2){
			 fenzilist.add(f((fenzilist.get(i-2)),fenzilist.get(i-1)));
		 }
	 }
	 
	 for(int i=0;i<28;i++){
		 if(i==0){
			 fenmulist.add(i,(float) 1);
		 }if(i==1){
			 fenmulist.add(i,(float) 2);
		 }if(i>=2){
			 fenmulist.add(f((fenmulist.get(i-2)),fenmulist.get(i-1)));
		 }
	 }
	 
	 for(int i=0;i<fenmulist.size();i++){
		sum += (float)(fenzilist.get(i)/fenmulist.get(i));
	 }
	 
	 System.out.println(sum);
	// System.out.println(sum);
   }

   public static float f(float f1,float f2){
	return f1+f2;
	   
   }
   
   public static void jiecheng(){
	 //1+2!+3!+...+20!的和
	   long temp = 1;
	   long sum = 0;
	   for(int i=1;i<=20;i++){
		   for(int j=1;j<=i;j++){
			   temp=temp*j;
		   }
		   sum=sum+temp;
		   temp =1 ;
	   }
	   
	   System.out.println(sum);	   
   }
   
   public static long diguijiecheng(long n){
	   // 题目：利用递归方法求5!。     递归公式：fn=fn_1*4! 
	   if(n==1){
		   n = 1;
	   }if(n>1){
		   n*=diguijiecheng(n-1);	   
	   }
	   return n;
   }
   
   
   public static int guessage(int n){
	   /*有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。
	    * 问第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。请问第五个人多大？  
	    * n为5时，就是知道第一个人多大时，测试第5个人多大。
	    */ 
	   int age = 10;
	   if(n==1){
		   age = 10;
	   }if(n>1){
		   age=2+guessage(n-1);
	   }
	return age;	   
   }
   
   public static void scannumber(){
	   /* 给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。*/
	   Scanner sc = new Scanner(System.in);
	   int number = sc.nextInt();
	   int weishu = guessweishu(number);
	   ArrayList<Integer> list = new ArrayList<Integer>();
	   if(weishu==1){
		   System.out.println(number);
	   }else if(weishu==2){
		   System.out.println((number%10)*10+(number/10));
	   }else if(weishu==3){
		   System.out.println(((number%100)%10)*100+((number%100)/10)*10+(number/100));
	   }else if(weishu==4){
		   System.out.println((((number%1000)%100)%10)*1000+(((number%1000)%100)/10)*100+((number%1000)/100)*10+(number/1000));
	   }else{
		   System.out.println(((((number%10000)%1000)%100)%10)*10000+((((number%10000)%1000)%100)/10)*1000+(((number%10000)%1000)/100)*100+((number%10000)/1000)*10+(number/10000));
	   }
	   
	  
   }
   
   public static int guessweishu(int num){
	   /*判断得到的数字是几位数*/
	   if(num<10&&num>0){
		   return 1;
	   }else if(num>=10&&num<100){
		   return 2;
	   }else if(num>=100&&num<1000){
		   return 3;
	   }else if(num>=1000&&num<10000){
		   return 4;
	   }else {
		   return 5;
	   }	
   }
   
   public static void reversalnum (int num){
	   /*用递归的方式，倒序打印数字*/
	   int weishu = guessweishu(num);
	   if(weishu==1){
		   System.out.println(num);
	   }else{
		   int a = num/10;
		   int b = num%10;
		   System.out.print(b);
		   reversalnum(a);
	   }
	   
   }
   
    /*  一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。*/
   public static void guesshuiwenshu(){
	   System.out.println("请输入一个5位数");
	   Scanner sc = new Scanner(System.in);
	   long num = sc.nextLong();
	   while((num<0||num>=100000)){
		   System.out.println("您输入的不是五位数无法判断,请重新输入");
		   num = sc.nextLong();
	   }
		   int a = (int) (num/10000); //a是万位数。
		   int b = (int) (num%10000/1000); //b是千位数。
		   int c = (int) (num%10000%1000/100); //c是百位数。
		   int d = (int) (num%10000%1000%100/10); //c是十位数。
		   int e = (int) (num%10000%1000%100%10); //c是个位数。
		   
		   if((e==a)&&(b==d)){
		   System.out.println("输入的五位数："+num+"是回文数");
		   }else{
		   System.out.println("输入的五位数："+num+"不是回文数");
		   }
   }
   
   public static boolean judgesushu(int num){
	   int k =0;
	   for(int i=2;i<num;i++){
		   if(num%i==0){
			   return false;
		   }
	   }
	   if(k==0){
		   return true;
	   }else{
		   return false;
	   }
   }
   
   public static void findsushuin100(){
	   System.out.print("一百之内的素数有：");
	   for(int i=1;i<=100;i++){
		   if(judgesushu(i)){
			   System.out.print(i+",");
		   }
	   }
   }
  
 
   
   public static void xuanzepaixu(){
	   /*对10个数进行排序 */
	   Random r = new Random();
	   int[] number = new int[10];
	   for(int i=0;i<number.length;i++){
		   number[i]=r.nextInt(100);
	   }
	   
	   int index = 0;
	   int temp = 0;
	   for(int i=0;i<number.length;i++){
		   index = i;
		   for(int j=index+1;j<number.length;j++){
			   if(number[index]>number[j]){
				   index = j;
			   }
		   }
		   temp = number[i];
		   number[i] = number[index];
		   number[index] = temp;
	   }
	   
	   for(int i=0;i<number.length;i++){
		   System.out.print(number[i]+",");
	   }
   }
   
   
    public static void countmatrixdiagonalsummary(){
    	//求一个3*3矩阵对角线元素之和
    	int sum = 0;
    	int[][] matrix = {{1,2,3},{4,5,6},{7,7,8}};
    	for(int i=0;i<matrix.length;i++){
    		for(int j=0;j<matrix.length;j++){
    			if(i==j||i+j==2){
    				sum+= matrix[i][j];
    			}
    		}
    	}
    	System.out.println(sum);
    	
    }
   
    
    public static void yanghuitriangle(){
    	/*题目：打印出杨辉三角形（要求打印出10行如下图）     
		1     
		1   1     
		1   2   1     
		1   3   3   1     
		1   4   6   4   1     
		1   5   10  10  5   1 
	*/
    	int[][] a = new int[6][6];
    	for(int i=0;i<6;i++){
    		for(int j=0;j<6;j++){
    			if(j==0){
    				a[i][j]=1;
    			}else if(i<j&&j!=0){
    				a[i][j]=0;
    			}else if(i>=1&&j>=1){
    				a[i][j]=a[i-1][j-1]+a[i-1][j];
    			}
    		}
    	}
    	
    	for(int i=0;i<6;i++){
    		for(int j=0;j<6;j++){
    			if(a[i][j]!=0){
    				System.out.print(a[i][j]+" ");
    			}
    		}
    		System.out.println();
    	}
    }
    
    public static void countsum(double n){
    /*编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,
     * 当输入n为奇数时，调用函数1/1+1/3+...+1/n*/
    	double sum = 0.000;
    	if(n%2==0){
    		while(n/2>=1){
    			sum=sum+1/n;
    			n=n/2;
    		}
    	}else{
    		while(n-2>=1){
    			sum+=1/n;
    			n=n-2;
    		}
    	}
    	
    	System.out.println(sum);
    }
    
    public static void changearrage(){
    /*输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。 */
    	System.out.println("请输入您希望数组的数字个数");
    	Scanner sc = new Scanner(System.in);
    	int n =sc.nextInt();
    	int[] num = new int[n];
    	System.out.println("请输入"+n+"个整数");
    	for(int i=0;i<num.length;i++){
    		num[i]=sc.nextInt();
    	}
    	int max = 0;
    	int min = 0;
    	int temp = 0;
    		for(int j=1;j<num.length;j++){
    			if(num[min]>num[j]){
    				min = j;
    			}
    			if(num[max]<num[j]){
    				max = j;
    		}
    	}
    		temp=num[0];
    		num[0]=num[max];
    		num[max]=temp;
    		temp=num[num.length-1];
    		num[num.length-1]=num[min];
    		num[min]=temp;
    		
    		for(int i=0;i<num.length;i++){
    			System.out.print(num[i]+" ");
    		}
    		
    }

    public static void Count3quit(int num){
    	boolean[] circle = new boolean[num];
    	for(int i=0;i<circle.length;i++){
    		circle[i] = true;
    	}
    	
    	int leftnum = circle.length;
    	int index = 0 ;
    	int count = 0;
    	
    	while(leftnum>1){
    		if(circle[index]==true){
    			count++;
    			if(count==3){
    				circle[index]=false;
    				leftnum--;
    				count = 0;
    			}
    		}
    		
    		index++;
    		if(index == circle.length){
    			index = 0;
    		}
    	}
    	
    	for(int i=0;i<circle.length;i++){
    		if(circle[i]==true){
    			System.out.println(i);
    		}
    	}
    }
 
    
    public static void judgedate(){
    	 /*题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续   判断第二个字母。    
        1.程序分析：用情况语句比较好，如果第一个字母一样，则判断用情况语句或if语句判断第二个字母。*/
    	System.out.println("请输入星期几的第一个字母来判断一下是星期几");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        if(s1.equals("M")||s1.equals("m")){
        	System.out.println("今天是星期一");
        }else if(s1.equals(s1.equals("T"))||s1.equals("t")){
        	System.out.println("请输入第二字字母");
        	String s2 = sc.nextLine();
        	if(s2.equals("U")||s2.equals("u")){
        		System.out.println("今天是星期二");
        	}else if(s2.equals("H")||s2.equals("h")){
        		System.out.println("今天是星期四");
        	}
        }else if(s1.equals("W")||s1.equals("w")){
        	System.out.println("今天是星期三");
        }else if(s1.equals("F")||s1.equals("f")){
        	System.out.println("今天是星期五");
        }else if(s1.equals("s")||s1.equals("S")){
        	System.out.println("请输入第二字字母");
        	String s3 = sc.nextLine();
        	if(s3.equals("U")||s3.equals("u")){
        		System.out.println("今天是星期日");
        	}else if(s3.equals("a")||s3.equals("A")){
        		System.out.println("今天是星期六");
        	}
        }
        
    }
   
 	public static void printsequence(){
 		/*用1、2、2、3、4、5这六个数字，用java写一个main函数，打印出所有不同的排列，
 		 * 如：512234、412345等，
 		 * 要求："4"不能在第三位，"3"与"5"不能相连。*/
 		ArrayList<String> sequence1 = new ArrayList<String>();
 		ArrayList<String> sequence2 = new ArrayList<String>();
 		
 		int sum = 0;
 		/*1、2、3、4、5组成不重复的5位数的方法*/
 		for(int i=1;i<=5;i++){
 			for(int j=1;j<=5;j++){
 				for(int k=1;k<=5;k++){
 					for(int m=1;m<=5;m++){
 						for(int n=1;n<=5;n++){
 							if(i!=j&&i!=k&&i!=m&&i!=n&&j!=k&&j!=m&&j!=n&&k!=m&&k!=n&&m!=n){
 	 							sum = 10000*i+1000*j+100*k+10*m+n;
 	 							sequence1.add(String.valueOf(sum));
 	 						}
 						}						
 					}
 				}
 			}
 		}
 		
 		/**/
 		for(int i=0;i<sequence1.size();i++){
 			String s1 = String.valueOf(2);
 			for(int j=0;j<sequence1.get(i).length();j++){
 				String s2 = sequence1.get(i).substring(0,j)+s1+sequence1.get(i).substring(j,sequence1.get(i).length());
 	 			String s3= sequence1.get(i)+s1;
 	 			sequence2.add(s2);
 	 			sequence2.add(s3);
 			}
 			
 		}		

 	}
 	
 	public static void insertnumber(int num){
 		/*题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。     
1.   程序分析：首先判断此数是否大于最后一个数，然后再考虑插入中间的数的情况，插入后此元素之后的数，依次后移一个位置。 
            num 是数组长度 
            array是旧数组，随机产生的num个数字；
                               需插入的数字是在键盘中键入的数字；
            newarray是新的插入
      */
 		int[] array = new int[num];
 		Random r = new Random();
 		for(int i=0;i<array.length;i++){
 			array[i] = r.nextInt(100);
 		}
 		
 		Arrays.sort(array);
 		
 		for(int i=0;i<array.length;i++){
 			System.out.print(array[i]+",");
 		}
 		
 		System.out.println("请输入一个正整数");
 		Scanner sc = new Scanner(System.in);
 		int number = sc.nextInt();
 		int index = 0;
 		int[] newarray = new int[num+1];
 		
 		
 		for(int i=array.length-1;i>=0;i--){
 			if(number>=array[i]){
 				index=i;
 				i=-1;
 				}
 		}
 		
 		if(index==0){
 			if(number<=array[0]){
 				for(int j=0;j<newarray.length;j++){
 					if(j==index){
 					newarray[j]=number;
 					}else{
 					newarray[j]=array[j-1];
 					}
 				}
 			}else{				
 				for(int j=0;j<newarray.length;j++){
 					if(j==0){
 						newarray[j]=array[j];
 					}else if(j==1){
 						newarray[1]=number;
 					}else{
 					newarray[j]=array[j-1];
 					}
 				}
 			}
 			
 		}else if(index==array.length-1){
 			for(int j=0;j<array.length;j++){
 				newarray[j]=array[j];
 			}
 			newarray[newarray.length-1]=number;
 		}else{
 			for(int j=0;j<newarray.length;j++){
 				if(j<=index){
 					newarray[j]=array[j];
 				}else{
 					if(j==index+1){
 						newarray[j]=number;
 					}else{
 						newarray[j]=array[j-1];
 					}
 				}
 			}
 		}
 		
 		
 		for(int i=0;i<newarray.length;i++){
 			System.out.print(newarray[i]+",");
 		}
 		
 		
 		}
 	
 	public static void insertarray(int num){
 		/*题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。     
 		1.   程序分析：首先判断此数是否大于最后一个数，然后再考虑插入中间的数的情况，插入后此元素之后的数，依次后移一个位置*/
 		Random r = new Random();
 		int[] array = new int[num+2];
 		for(int i=1;i<=num;i++){
 			array[i]=r.nextInt(100);
 		}
 		
 		int temp = 0;
 		
 		for(int i=1;i<=num;i++){
 			for(int j=i+1;j<=num;j++){
 				if(array[i]>array[j]){
 					temp = array[i];
 					array[i] = array[j];
 					array[j] = temp;
 				}
 			}
 		}
 		
 		for(int i=1;i<=num;i++){
 			System.out.print(array[i]+",");
 		}
 		
 		System.out.println();
 		
 		array[num+1]=r.nextInt(100);
 		
 		int index = 0;
 		System.out.println(array[num+1]);
 		
 		
 		System.out.println();
 		for(int i=1;i<=num;i++){
 			if(array[i]>array[num+1]){
 				index = i;
 				temp=array[num+1];
 				i=num+1;
 			}
 		}
 		
 		for(int k=num+1;k>=index+1;k--){
 			array[k]=array[k-1];
 		}
 		array[index]=temp;
 		
 		for(int i=1;i<=num+1;i++){
 			System.out.print(array[i]+",");
 		}
 		
 		
 	}
 	
 	
 	public static void insertnum(int num){
 		/*题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。     
 		1.   程序分析：首先判断此数是否大于最后一个数，然后再考虑插入中间的数的情况，插入后此元素之后的数，依次后移一个位置*/
 		int[] array = new int[num];
 		Random r = new Random();
 		for(int i=0;i<num-1;i++){
 			array[i] = r.nextInt(100);
 		}
 		
 		int temp = 0;
        for(int i=0;i<num-1;i++){
        	for(int j=i+1;j<num-1;j++){
        		if(array[i]>array[j]){
        			temp = array[i];
        			array[i]=array[j];
        			array[j]=temp;
        		}
        	}
        }
 		
        for(int i=0;i<num-1;i++){
        	System.out.print(array[i]+",");
        }
 		System.out.println();
 		int number= r.nextInt(100);
 		System.out.print(number);
 		System.out.println();
 		
 		
 	    int index = 0;
 		for(int k=num-2;k>=0;k--){
 			if(number>array[k]){
 				index = k;
 				k=-1;
 				for(int i=num-1;i>=index+1;i--){
 					if(i==index+1){
 	 					array[i]= number;
 	 				}else{
 	 					array[i]=array[i-1];
 	 				}
 	 				
 	 			}
 			}
 			
 		}
 		
 		
 		for(int i=0;i<num;i++){
 			System.out.print(array[i]+",");
 		}
 		
 	}
 	
 	public static void guesspeach(){
 		/*题目：海滩上有一堆桃子，五只猴子来分。
 		 * 第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一个扔入海中，拿走了一份。
 		 * 第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中，拿走了一份，
 		 * 第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
 		  */
 		double[] peach = new double[6];
 		int count = 5;
 		
 		for(int i=4;i<=1000;i++){
 			for(int j=5;j>=0;j--){
 				if(j==5){
 					peach[j]=i;
 				}else{
 					peach[j]=allocatepeach(peach[j+1],count);
 					count--;
 				}
 				
 			}
 			count = 5;
 			
 			int peachnumber = (int)peach[0];
 			if(peachnumber == peach[0]){
 				System.out.println(i);
 				System.out.println(peach[0]);
 				i=1001;
 			}
 		}
    
 		
 	}

	private static double allocatepeach(double num,int n) {
		double number=0.000;
		if(n==5){
			number = num*5+1;
		}else{
			number = (5*num)/4+1;
		}
		
		return number;
		// TODO Auto-generated method stub		
	}
	
	public static void allPermutation(String sc){
		/*全排列，写出字符串sc的全排列。比如“123”的全排列为：123、132、213、231、321、312
		查重的全排列，比如122全排列，为122、212、221.*/
		if(sc.length()==0||sc==null){
			return;
		}else{
			LinkedList<String> liststr = new LinkedList<String>();
			char[] c = sc.toCharArray();
			allPermutation(c,liststr,0);
			checkLinkedList(liststr);
			System.out.println(liststr);
			//System.out.println(liststr.size());
		}
	}
	
	public static void allPermutation(char[] c,LinkedList<String> Liststr,int start){
		if(start==c.length-1){
			Liststr.add(String.valueOf(c));
		}else{
			for(int i=start;i<=c.length-1;i++){
				if(isSwap(c,start,i)){
				swap(c,i,start);
				allPermutation(c,Liststr,start+1);
				swap(c,start,i);
				}
			}
		}
	}
	
	public static  void swap(char[] c,int i,int j){
		char temp ;
		temp = c[i];
		c[i]= c[j];
		c[j] = temp;
	}
	
	public static boolean isSwap(char[] c,int start,int end){
		for(int i=start;i<end;i++){
			if(c[i]==c[end]){
				return false;
			}
		}
		
		return true;
	}
	
	public static void checkLinkedList(LinkedList<String> list){
		LinkedList intlist = new LinkedList();
		for(int i=0;i<list.size();i++){
			char[] c =list.get(i).toCharArray();
			for(int j=0;j<c.length;j++){
				if(j==1&&c[j]==2){
					intlist.add(i);
				}
			}
		}
		
		for(int i=0;i<list.size();i++){
			for(int j=0;j<intlist.size();j++){
				if(i==j){
					list.remove(i);
				}
			}
		}
	}
 		
	public static void allocatenumber(String sc){
		/*// TODO Auto-generated method stub
		/*题目如下：用1、2、2、3、4、5这六个数字，用java写一个main函数，打印出所有不同的排列，
		 * 如：512234、412345等，要求："4"不能在第三位，"3"与"5"不能相连。*/
		if(sc.length()==0||sc.equals(null)){
			return;
		}else{
			char[] c = sc.toCharArray();
			LinkedList list = new LinkedList();
			allocatenumber(c,list,0);
			System.out.println(list);
		}
		
	}
	
	private static void allocatenumber(char[] c, LinkedList list, int start) {
		// TODO Auto-generated method stub
		/*题目如下：用1、2、2、3、4、5这六个数字，用java写一个main函数，打印出所有不同的排列，
		 * 如：512234、412345等，要求："4"不能在第三位，"3"与"5"不能相连。*/
		if(start == c.length-1){
			if(c[2]!='4'){
				if(!checkxianglin(c,'3','5')){
					list.add(String.valueOf(c));
				}
			}
		}
		for(int i=start;i<c.length;i++){
			if(!checkduplicate(c,start,i)){
				swapnumber(c,start,i);
				allocatenumber(c,list,start+1);
				swapnumber(c,i,start);
			}
			
		}
		
	}
	
	public static void swapnumber(char[] c,int i,int j){
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}
	
	public static boolean checkduplicate(char[] c,int start,int end){
		//判断字符数组c中，从start位开始到直到end前以为是否存在于第end位相同的情况。存在返回true，不存在返回false。
		for(int i=start;i<end;i++){
			if(c[i]==c[end]){
				return true;
			}
		}
		return false;
		
	}
	
	public static boolean checkxianglin(char[] c,char i,char j){
		/*判断字符数组中，是否存在字符i和字符j相邻的情况
		 *比如字符数组 1234中，是否存在34相邻的情况，存在返回true，不存在返回false*/
		for(int k=0;k<c.length;k++){
			if(k==0){
				if(c[k]==i&&c[k+1]==j){
					return true;
				}else if(c[k]==j&&c[k+1]==i){
					return true;
				}
			}else if(k>0&&k<c.length-1){
				if(c[k]==i&&c[k+1]==j){
					return true;
				}else if(c[k]==i&&c[k-1]==j){
					return true;
				}else if(c[k]==j&&c[k+1]==i){
					return true;
				}else if(c[k]==j&&c[k-1]==i){
					return true;
				}
			}else if(k==c.length-1){
				if(c[k]==i&&c[k-1]==j){
					return true;
				}else if(c[k]==j&&c[k-1]==i){
					return true;
				}
			}
		}
		return false;
	}
	   
	public static void pingpang(){
		/*
		 * 两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。
		 * 有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
		 */
		char[] pingpang = {'x','y','z'};
		int a = 0;
		int b = 0;
		int c = 0;
		for(int i=0;i<pingpang.length;i++){
			for(int j=0;j<pingpang.length;j++){
				for(int k=0;k<pingpang.length;k++){
					if(i!=j&&i!=k&&j!=k){
						if(i!=0){
							if(k!=0&&k!=2){
								a = i;
								b = j;
								c = k;
							}
						}
					}
					
				}
			}
		}
		
		System.out.println("甲队的选手a和乙队的选手"+pingpang[a]+"比赛");
		System.out.println("甲队的选手b和乙队的选手"+pingpang[b]+"比赛");
		System.out.println("甲队的选手c和乙队的选手"+pingpang[c]+"比赛");
	}
	
	public static void findnumber(){
		/*题目：809*??=800*??+9*??+1 
		其中??代表的两位数,8*??的结果为两位数，9*??的结果为3位数。求??代表的两位数，及809*??后的结果。 */
		for(int i=10;i<100;i++){
			if(8*i<100&&8*i>=10){
				if(9*i>=100){
						System.out.println(i);
				}
			}
		}
	}
	
	
	public static void printnumbertostar(){
		/*题目：读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的＊。 */
		int[] array = new int[7];
		Random r = new Random();
		for(int i=0;i<2;i++){
			array[i]=r.nextInt(50);
			if(array[i]==0){
				array[i]=array[i]+1;
			}else{
				array[i] =array[i];
			}
			System.out.println(array[i]);
			printstar(array[i]);
            
		}
	}
	
	public static void  printstar(int i){
		for(int k=0;k<i;k++){
			System.out.print("*");
		}
		System.out.println();
	}
	

	public static boolean judgesushu1(int num){
		//判断num是否为素数,num是素数返回true，不是素数返回false
		for(int i=2;i<num;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static void oushu(){
		/*一个偶数总能表示为两个素数之和*/
		int a=0;
		int b=0;
		Random r = new Random();
		int number = r.nextInt(100);
			while(number%2!=0){
				number = r.nextInt(100);
			}
		for(int i=2;i<number;i++){
			if(number%i==0&&!judgesushu1(i)){
				a = i;
				b = number - i;
				if(!judgesushu1(b)){
					System.out.println(number+"是由"+a+"和"+b+"相加而得");
				}
			}
		}
		
	}
	
 	
}

