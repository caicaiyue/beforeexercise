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
		//  ��Ŀ����s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ƣ��������е�n
		
 		System.out.println("���������a��");
		//BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("����������ĸ���");
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
		//��1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�   
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
		System.out.println("���������ֹ���"+t+"��");
	}
	
	public static void bonus(){
		double bonus = 0;
		long profit;
	/*��ҵ���ŵĽ������������ɡ�����(I)���ڻ����10��Ԫʱ���������10%��
	�������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣��ɿ����7.5%��
	20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��
	40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��
	60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%������100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ�
	�Ӽ������뵱������I����Ӧ���Ž���������     */
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
		//һ��������������100����һ����ȫƽ����������168����һ����ȫƽ���������ʸ����Ƕ��٣�
		for(int i=1;i<=100001;i++){
			if(Math.floor(Math.sqrt(i+100))==Math.sqrt(i+100)&&Math.floor(Math.sqrt(i+168))==Math.sqrt(i+168)){
				System.out.println(i);
			}
		}
	}
	
	
	public static void finddate(){
		//����ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿
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
	   //������������x,y,z���������������С��������� 
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
	   //��ӡ������
	   int[] array = {1,3,6,8,6,3,1};
	  for(int i=0;i<array.length;i++){
		  for(int j=0;j<array[i];j++){
			  System.out.print("*");
		  }
		  System.out.println();
	  }
    }
   
   public static void numbersum(){
   //��һ�������У�2/1��3/2��5/3��8/5��13/8��21/13...���������е�ǰ20��֮�͡� 
   //fenzilist�û��ŷ������飬�������Ժ�����ֶ���ǰ����ֵ�ĺ͡�
   //fenmulist�û��ŷ�ĸ���飬�������Ժ�����ֶ���ǰ����ֵ�ĺ͡�
   //sum ����������ֱ�ȡֵ����õ��ĺ͡�
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
	 //1+2!+3!+...+20!�ĺ�
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
	   // ��Ŀ�����õݹ鷽����5!��     �ݹ鹫ʽ��fn=fn_1*4! 
	   if(n==1){
		   n = 1;
	   }if(n>1){
		   n*=diguijiecheng(n-1);	   
	   }
	   return n;
   }
   
   
   public static int guessage(int n){
	   /*��5��������һ���ʵ�����˶����ꣿ��˵�ȵ�4���˴�2�ꡣ�ʵ�4������������˵�ȵ�3���˴�2�ꡣ
	    * �ʵ������ˣ���˵�ȵ�2�˴����ꡣ�ʵ�2���ˣ�˵�ȵ�һ���˴����ꡣ����ʵ�һ���ˣ���˵��10�ꡣ���ʵ�����˶��  
	    * nΪ5ʱ������֪����һ���˶��ʱ�����Ե�5���˶��
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
	   /* ��һ��������5λ����������Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡�*/
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
	   /*�жϵõ��������Ǽ�λ��*/
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
	   /*�õݹ�ķ�ʽ�������ӡ����*/
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
   
    /*  һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��*/
   public static void guesshuiwenshu(){
	   System.out.println("������һ��5λ��");
	   Scanner sc = new Scanner(System.in);
	   long num = sc.nextLong();
	   while((num<0||num>=100000)){
		   System.out.println("������Ĳ�����λ���޷��ж�,����������");
		   num = sc.nextLong();
	   }
		   int a = (int) (num/10000); //a����λ����
		   int b = (int) (num%10000/1000); //b��ǧλ����
		   int c = (int) (num%10000%1000/100); //c�ǰ�λ����
		   int d = (int) (num%10000%1000%100/10); //c��ʮλ����
		   int e = (int) (num%10000%1000%100%10); //c�Ǹ�λ����
		   
		   if((e==a)&&(b==d)){
		   System.out.println("�������λ����"+num+"�ǻ�����");
		   }else{
		   System.out.println("�������λ����"+num+"���ǻ�����");
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
	   System.out.print("һ��֮�ڵ������У�");
	   for(int i=1;i<=100;i++){
		   if(judgesushu(i)){
			   System.out.print(i+",");
		   }
	   }
   }
  
 
   
   public static void xuanzepaixu(){
	   /*��10������������ */
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
    	//��һ��3*3����Խ���Ԫ��֮��
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
    	/*��Ŀ����ӡ����������Σ�Ҫ���ӡ��10������ͼ��     
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
    /*��дһ������������nΪż��ʱ�����ú�����1/2+1/4+...+1/n,
     * ������nΪ����ʱ�����ú���1/1+1/3+...+1/n*/
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
    /*�������飬�������һ��Ԫ�ؽ�������С�������һ��Ԫ�ؽ�����������顣 */
    	System.out.println("��������ϣ����������ָ���");
    	Scanner sc = new Scanner(System.in);
    	int n =sc.nextInt();
    	int[] num = new int[n];
    	System.out.println("������"+n+"������");
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
    	 /*��Ŀ�����������ڼ��ĵ�һ����ĸ���ж�һ�������ڼ��������һ����ĸһ���������   �жϵڶ�����ĸ��    
        1.�����������������ȽϺã������һ����ĸһ�������ж����������if����жϵڶ�����ĸ��*/
    	System.out.println("���������ڼ��ĵ�һ����ĸ���ж�һ�������ڼ�");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        if(s1.equals("M")||s1.equals("m")){
        	System.out.println("����������һ");
        }else if(s1.equals(s1.equals("T"))||s1.equals("t")){
        	System.out.println("������ڶ�����ĸ");
        	String s2 = sc.nextLine();
        	if(s2.equals("U")||s2.equals("u")){
        		System.out.println("���������ڶ�");
        	}else if(s2.equals("H")||s2.equals("h")){
        		System.out.println("������������");
        	}
        }else if(s1.equals("W")||s1.equals("w")){
        	System.out.println("������������");
        }else if(s1.equals("F")||s1.equals("f")){
        	System.out.println("������������");
        }else if(s1.equals("s")||s1.equals("S")){
        	System.out.println("������ڶ�����ĸ");
        	String s3 = sc.nextLine();
        	if(s3.equals("U")||s3.equals("u")){
        		System.out.println("������������");
        	}else if(s3.equals("a")||s3.equals("A")){
        		System.out.println("������������");
        	}
        }
        
    }
   
 	public static void printsequence(){
 		/*��1��2��2��3��4��5���������֣���javaдһ��main��������ӡ�����в�ͬ�����У�
 		 * �磺512234��412345�ȣ�
 		 * Ҫ��"4"�����ڵ���λ��"3"��"5"����������*/
 		ArrayList<String> sequence1 = new ArrayList<String>();
 		ArrayList<String> sequence2 = new ArrayList<String>();
 		
 		int sum = 0;
 		/*1��2��3��4��5��ɲ��ظ���5λ���ķ���*/
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
 		/*��Ŀ����һ���Ѿ��ź�������顣������һ������Ҫ��ԭ���Ĺ��ɽ������������С�     
1.   ��������������жϴ����Ƿ�������һ������Ȼ���ٿ��ǲ����м�����������������Ԫ��֮����������κ���һ��λ�á� 
            num �����鳤�� 
            array�Ǿ����飬���������num�����֣�
                               �������������ڼ����м�������֣�
            newarray���µĲ���
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
 		
 		System.out.println("������һ��������");
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
 		/*��Ŀ����һ���Ѿ��ź�������顣������һ������Ҫ��ԭ���Ĺ��ɽ������������С�     
 		1.   ��������������жϴ����Ƿ�������һ������Ȼ���ٿ��ǲ����м�����������������Ԫ��֮����������κ���һ��λ��*/
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
 		/*��Ŀ����һ���Ѿ��ź�������顣������һ������Ҫ��ԭ���Ĺ��ɽ������������С�     
 		1.   ��������������жϴ����Ƿ�������һ������Ȼ���ٿ��ǲ����м�����������������Ԫ��֮����������κ���һ��λ��*/
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
 		/*��Ŀ����̲����һ�����ӣ���ֻ�������֡�
 		 * ��һֻ���Ӱ��������ƾ�ݷ�Ϊ��ݣ�����һ������ֻ���ӰѶ��һ�����뺣�У�������һ�ݡ�
 		 * �ڶ�ֻ���Ӱ�ʣ�µ�������ƽ���ֳ���ݣ��ֶ���һ������ͬ���Ѷ��һ�����뺣�У�������һ�ݣ�
 		 * ���������ġ�����ֻ���Ӷ����������ģ��ʺ�̲��ԭ�������ж��ٸ����ӣ�
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
		/*ȫ���У�д���ַ���sc��ȫ���С����硰123����ȫ����Ϊ��123��132��213��231��321��312
		���ص�ȫ���У�����122ȫ���У�Ϊ122��212��221.*/
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
		/*��Ŀ���£���1��2��2��3��4��5���������֣���javaдһ��main��������ӡ�����в�ͬ�����У�
		 * �磺512234��412345�ȣ�Ҫ��"4"�����ڵ���λ��"3"��"5"����������*/
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
		/*��Ŀ���£���1��2��2��3��4��5���������֣���javaдһ��main��������ӡ�����в�ͬ�����У�
		 * �磺512234��412345�ȣ�Ҫ��"4"�����ڵ���λ��"3"��"5"����������*/
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
		//�ж��ַ�����c�У���startλ��ʼ��ֱ��endǰ��Ϊ�Ƿ�����ڵ�endλ��ͬ����������ڷ���true�������ڷ���false��
		for(int i=start;i<end;i++){
			if(c[i]==c[end]){
				return true;
			}
		}
		return false;
		
	}
	
	public static boolean checkxianglin(char[] c,char i,char j){
		/*�ж��ַ������У��Ƿ�����ַ�i���ַ�j���ڵ����
		 *�����ַ����� 1234�У��Ƿ����34���ڵ���������ڷ���true�������ڷ���false*/
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
		 * ����ƹ����ӽ��б������������ˡ��׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ��ѳ�ǩ��������������
		 * �������Ա����������������a˵������x�ȣ�c˵������x,z�ȣ��������ҳ��������ֵ�������
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
		
		System.out.println("�׶ӵ�ѡ��a���Ҷӵ�ѡ��"+pingpang[a]+"����");
		System.out.println("�׶ӵ�ѡ��b���Ҷӵ�ѡ��"+pingpang[b]+"����");
		System.out.println("�׶ӵ�ѡ��c���Ҷӵ�ѡ��"+pingpang[c]+"����");
	}
	
	public static void findnumber(){
		/*��Ŀ��809*??=800*??+9*??+1 
		����??�������λ��,8*??�Ľ��Ϊ��λ����9*??�Ľ��Ϊ3λ������??�������λ������809*??��Ľ���� */
		for(int i=10;i<100;i++){
			if(8*i<100&&8*i>=10){
				if(9*i>=100){
						System.out.println(i);
				}
			}
		}
	}
	
	
	public static void printnumbertostar(){
		/*��Ŀ����ȡ7������1��50��������ֵ��ÿ��ȡһ��ֵ�������ӡ����ֵ�����ģ��� */
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
		//�ж�num�Ƿ�Ϊ����,num����������true��������������false
		for(int i=2;i<num;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static void oushu(){
		/*һ��ż�����ܱ�ʾΪ��������֮��*/
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
					System.out.println(number+"����"+a+"��"+b+"��Ӷ���");
				}
			}
		}
		
	}
	
 	
}

