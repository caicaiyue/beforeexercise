package exercise;

import java.util.Arrays;
import java.util.Stack;

public class TestBubbleSort {
    boolean changed = false; 
	
	
    public void Bubblesort(int[] array){
    	int setborder = array.length-1;
    	int lastexchangindex = 0;
    	for(int i=0;i<array.length;i++){
    		boolean isChange = false;
    		for(int j=0;j<setborder;j++){
    			if(array[j]>array[j+1]){
    				int temp = array[j];
    				array[j] = array[j+1];
    				array[j+1] = temp;
    				isChange = true;
    				lastexchangindex = j;
    			}
    		}
    		
    		setborder = lastexchangindex;
    		if(!isChange){
    			break;
    		}
    		
    	}
    }
	
   public int[] lefttoright(int[] array){
	   for(int i=0;i<array.length-1;i++){
		   if(array[i]>array[i+1]){
			   int temp = array[i];
			   array[i] = array[i+1];
			   array[i+1] = temp;
			   changed = true;
			   
		   }
		   
		  
	   }
	   return array;
   }
    
    public int[] righttoleft(int[] array){
    	
    	for(int i=array.length-1;i>0;i--){
    		if(array[i-1]>array[i]){
    			int temp = array[i-1];
    			array[i-1] = array[i];
    			array[i] = temp;
    			changed = true;
    		}
    	}
    	return array;
    }
    
    public void CockTailSort(int[] array){
    	
    	for(int i=0;i<array.length-1;i++){
    		changed = false;
    		if(i%2==0){
    			array = lefttoright(array);
    		}else{
    			array = righttoleft(array);
    		}
    		
    		if(!changed){
    			break;
    		}
    	}
    }
    
    //双边索引的快速排序
    public void twosidequicksort(int[] array,int startindex,int endindex){
    	if(startindex>=endindex){
    		return;
    	}
    	
    	int privotindex = partition2(array,startindex,endindex);
    	twosidequicksort(array,startindex,privotindex-1);
    	twosidequicksort(array,privotindex+1,endindex);
    }
    
	private int partition2(int[] array, int startindex, int endindex) {
		// TODO Auto-generated method stub
		int left = startindex;
		int right = endindex;
		int privot = array[left];
		int temp = 0;
		while(left!=right){
			while(left<right&&array[right]>=privot){
			    right--;
			}
			
			while(left<right&&array[left]<=privot){
				left++;
			}
			
			if(right>left){
				temp = array[left];
				array[left] = array[right];
				array[right] = temp;
			}
		}
		
		array[startindex] = array[left];
		array[left] = privot;
		
		return left;
	}
	
	//单边索引的快速排序
	public void SingleSideQuickSort(int[] array,int startindex,int endindex){
		if(startindex>=endindex){
			return;
		}
		int pivot = partition1(array,startindex,endindex);
		SingleSideQuickSort(array,startindex,pivot-1);
		SingleSideQuickSort(array,pivot+1,endindex);
	}

	private int partition1(int[] array, int startindex, int endindex) {
		// TODO Auto-generated method stub
		int mark =startindex;
		int pivot = array[startindex];
		int index = startindex;
		int temp = 0;
		while(index<endindex&&mark<=index){
			index++;
			while(array[index]>=pivot&&index<endindex){
				index++;
			}
			if(mark<=index&&array[index]<pivot){
				mark++;
				temp = array[mark];
				array[mark] = array[index];
				array[index] = temp;
			}
			
		}
		
		if(pivot>array[mark]){
			array[startindex]=array[mark];
			array[mark]=pivot;
		}
		
		return mark;
	}
	
	//不用递归的快速排序，单边的索引
	public void quicksort(int[] array,int startindex,int endindex){
		Stack s = new Stack();
		s.push(endindex);
		s.push(startindex);
		while(!s.isEmpty()){
			int beginindex = (int) s.pop();
			int finishindex  = (int) s.pop();
			if(beginindex>=finishindex){
				continue;
			}
			int pivot = partation(array,beginindex,finishindex);
			
			s.push(pivot-1);
			s.push(startindex);
			s.push(finishindex);
			s.push(pivot+1);
		}
	}

	private int partation(int[] array, int beginindex, int finishindex) {
		// TODO Auto-generated method stub
		int pivot = array[beginindex];
		int mark = beginindex;
		int temp = 0;
		
		for(int i=mark+1;i<=finishindex;i++){
			if(pivot>array[i]){
				mark++;
				temp = array[mark];
				array[mark] = array[i];
				array[i] = temp;
			}
		}
		
		array[beginindex]= array[mark];
		array[mark]= pivot;
		
		return mark;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBubbleSort tbs = new TestBubbleSort();
        //int[] array1 = {3,2,2,5,27,6,7,1,8,4};
        //int[] array1 = {5,6,3,8,11,1,7,9};
		//int[] array1 = {4,3,7,5,6,2,8,1};
		int[] array1 = {1,3,5,5,2,7,8,9};
        //tbs.Bubblesort(array);
        //tbs.CockTailSort(array)
        //tbs.twosidequicksort(array1, 0, array1.length-1);
        //tbs.SingleSideQuickSort(array1, 0, array1.length-1);
        tbs.quicksort(array1, 0, array1.length-1);
        System.out.println(Arrays.toString(array1));
	}

}
