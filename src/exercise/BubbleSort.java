package exercise;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//UUID uuid1 = UUID.randomUUID();
		//System.out.println(uuid1);
		
		
		
		//算数组的的和，比如数组是（1,2,3，4）下面方法是 把（1,1+2,1+2+3，1+2+3+4）再放到数组里面
		int[] number1 = {456,128,135,140,123,135,133,136,132,132,154,134,131,128,159,131,128,131,136,136};
		String[] label = {"421","125","127","156","129","139","133","124",
						  "136","128","135","145","133","126","122","129","122","128","164",
						  "128","133","131","122","122","136","127","125","122","125","131","191",
						  "176","137","128","135","127","126","138","146","126","124","134","127",
						  "134","159","140","131","128","121","132"};
		
		int[] number = new int[label.length];
		
		for(int j=0;j<label.length;j++){
			number[j] = Integer.valueOf(label[j]);
		}
		
		
		ArrayList list = new ArrayList();
		int i=0;
		int num = 0;
		System.out.println(number.length);
		while(i<number.length){
			
			num = sum(number,i);
			i++;
			list.add(num);
		}
		
		Print(list);
		
		
	}
	
	public static int sum(int[] number, int index){
		int result = 0;
		
		for(int i=0;i<=index;i++){
			result = result+number[i];
		}
		return result;
		
	}
	
	public static void Print(ArrayList list){
		 for(int i=0;i<list.size();i++){
			 System.out.print(list.get(i)+",");
		 }
	}

}


