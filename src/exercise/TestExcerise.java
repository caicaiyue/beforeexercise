package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

//找出1-9999直接3的倍数，用递归的方法。
public class TestExcerise {

	  static int[] array;
	  static ArrayList list1 = new ArrayList();
	 
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // array = createArray();
      // checkthree(array,0);
       //ArrayList list = findthree(array);
      // printlist(list1);
		UUID s2 = UUID.randomUUID();
		String s1 = UUID.randomUUID().toString().replace("-", "");
		System.out.println(s1);
		
		//String str = "a,b,c";
		//ArrayList list = new ArrayList();
		//list = (ArrayList) Arrays.asList(str.split(","));
		//printlist(list);
		
		//replaceString("bcdfa","aef");
		
	}
	
	public static int[] createArray(){
		int[] array = new int[100];
		for(int i=0;i<array.length;i++){
			array[i]=i+1;
		}
		
		return array;
	}
	
	//不递归的方法找3的倍数。
	public static ArrayList findthree(int[] array){
		ArrayList list = new ArrayList();
		for(int i=0;i<array.length;i++){
			int num = array[i];
			if(num%3==0){
				list.add(num);
			}
		}
		return list;
	}
	
	//递归的方法找3的倍数
	public static void checkthree(int[] array,int begin){
		boolean check = true;
		while(check&&begin<array.length){
			int num = array[begin];
			if(num%3==0){
				check = false;
				list1.add(num);
				//System.out.println(num);
				
			}
			begin++;
			
		}
		
		if(begin<array.length){
			checkthree(array,begin);
		}
		
	}
	
	public static void printlist(ArrayList list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	
	public static void replaceString(String s1,String s2){
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		for(int i=0;i<s1.length();i++){
			for(int j=0;j<s2.length();j++){
				if(c1[i]==c2[j]){
					s1 = s1.replace(c1[i], ' ');
					//s1 = s1.replaceAll(String.valueOf(c2[j]), "");
				}
			}
		}
		System.out.println(s1);
	}
	

}
