package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class TestSort {
	
	//非递归的快速排序
	public void QuickSort1(int[] array,int startindex,int endindex){
		Stack<Map<String,Integer>> quickstack = new Stack<Map<String,Integer>>();
		Map rootParam = new HashMap();
		rootParam.put("startindex", startindex);
		rootParam.put("endindex", endindex);
		quickstack.push(rootParam);
		
		while(!quickstack.isEmpty()){
			Map<String,Integer> param = quickstack.pop();
			int pivot = partition(array,param.get("startindex"),param.get("endindex"));
			if(pivot-1>param.get("startindex")){
				Map<String,Integer> leftmap = new HashMap<String,Integer>();
				leftmap.put("startindex", param.get("startindex"));
				leftmap.put("endindex", pivot-1);
				quickstack.push(leftmap);
			}
			
			if(pivot+1<param.get("endindex")){
				Map<String,Integer> rightmap = new HashMap<String,Integer>();
				rightmap.put("startindex",pivot+1);
                rightmap.put("endindex",param.get("endindex"));
				quickstack.push(rightmap);
			}
		}
	}
	
	public int[] CountSort(int[] array){
         int max = array[0];
         for(int i=1;i<array.length;i++){
        	 if(array[i]>max){
        		 max = array[i];
        	 }
         }
         
         int[] countarray = new int[max+1];
         
         for(int i=0;i<array.length;i++){
        	 countarray[array[i]]++;
         }
         
        // System.out.println(Arrays.toString(countarray));
         
         int[] sortedarray = new int[array.length];
         int countnumber = 0;
         for(int i=0;i<countarray.length;i++){
        	 for(int j=0;j<countarray[i];j++){
        		 sortedarray[countnumber++]=i;
        	 }
         }
         return sortedarray;
		
	}
	
	public int[] CountSort2(int[] array){
		int max = array[0];
		int mini = array[0];
		for(int i=1;i<array.length;i++){
			if(array[i]>max){
				max = array[i];
			}
			
			if(array[i]<mini){
				mini = array[i];
			}
		}
		
		//System.out.println(max+":"+mini);
	   int[] countarray = new int[max-mini+1];
	   for(int i=0;i<array.length;i++){
		   countarray[(array[i]-mini)]++;
	   }
	   
	   for(int i=1;i<countarray.length;i++){
		   countarray[i]=countarray[i]+countarray[i-1];
	   }
	   
	   //System.out.println(Arrays.toString(countarray));
	   
	   int[] sortedarray = new int[array.length];
	   int index = 0;
	   int gap = 0;
	   /*for(int i=0;i<array.length;i++){
		   gap = array[i]-mini;
		   index = --countarray[gap];
		   sortedarray[index]=array[i];
		   
	   }*/
	   
	   for(int i=array.length-1;i>=0;i--){
		   sortedarray[countarray[array[i]-mini]-1]=array[i];
		   countarray[array[i]-mini]--;
	   }
		
	   
	   return sortedarray;
	}
	
	public int[] creatarray(int count,int maxnumber){
		int[] array = new int[count];
		int k = 0;
		for(int i=0;i<count;i++){
			k = (int) (Math.random()*(maxnumber+1));
			array[i] = k;
		}
		
		return array;
		
	}

	private int partition(int[] array, int startindex, int endindex) {
		// TODO Auto-generated method stub
		int mark =startindex;
		int pivot = array[startindex];
		int temp = 0;
		for(int i=mark+1;i<=endindex;i++){
			if(array[i]<pivot){
				mark++;
				temp = array[mark];
				array[mark]=array[i];
				array[i]=temp;
			}
			
			
		}
		
		array[startindex]=array[mark];
		array[mark] = pivot;
		return mark;
	}
	
	public double[] bucketsort(double[] array){
		double max = array[0];
		double mini = array[0];
		
		for(double i:array){
			if(i>max){
				max = i;
			}
			
			if(i<mini){
				mini = i;
			}
		}
		
		double gap = (max-mini)/(array.length-1);
		
	    ArrayList<LinkedList <Double>> bucketlist = new ArrayList<LinkedList <Double>>();
	    for(int i=0;i<array.length;i++){
	    	bucketlist.add(new LinkedList());
	    }
	    
	    for(int i=0;i<array.length;i++){
	    	int num = (int) (array[i]/gap);
	    	bucketlist.get(num).add(array[i]);
	    }
	    
	    for(LinkedList list:bucketlist){
	    	Collections.sort(list);
	    }
	    
	    double[] sortedarray = new double[array.length];
	    int index = 0;
	    for(LinkedList<Double> list:bucketlist){
	    	for(double d:list){
	    		sortedarray[index++]=d;
	    	}
	    }
	    
	    return sortedarray;
	}
   
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //int[] array = {4,7,6,5,3,2,8,1};
       //int[] array = {4,7,6,0,5,11,3,2,8,1};
       TestSort ts = new TestSort();
       //ts.QuickSort1(array, 0, array.length-1);
       //System.out.println(Arrays.toString(array));
	
       //int[] array = ts.creatarray(20, 10);
       //System.out.println(Arrays.toString(array));
       
       //int[] array = {4,4,6,5,3,2,8,1,7,5,6,0,10};
       //int[] array= {95,94,91,98,99,90,99,93,91,92};
        //int[] array= {90,99,95,94,95};
       //double[] array = {0.5,0.84,2.18,3.25,4.5};
       double[] array = {4.12,1.212,6.421,0.0023,3.0,2.123,8.122,4.12,10.09};
       System.out.println(Arrays.toString(ts.bucketsort(array)));
      // System.out.println(Arrays.toString(ts.CountSort2(array)));
	}

}
