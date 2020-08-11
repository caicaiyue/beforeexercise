package exercise;

import java.util.Arrays;

public class TestHeapSort {
    
    public void goDown(int[] array,int startindex,int endindex){
    	int parentindex = startindex;
    	int childindex = parentindex*2+1;
    	int temp = 0;
    	
    	while(childindex<=endindex){
    		if((childindex+1)<=endindex){
    			if(array[childindex]>array[childindex+1]){
    				childindex++;
    			}
    		}
    		if(array[parentindex]>array[childindex]){
    			temp = array[parentindex];
    			array[parentindex]=array[childindex];
    			array[childindex] = temp;
    		}
    		
    		parentindex = childindex;
	        childindex = parentindex*2+1;
    			
    	}
    }
	
    public void goUp(int[] array,int index){
    	if(index<1||index>=array.length){
    		return;
    	}else{
    		int childindex = index;
        	int parentindex = (childindex-1)/2;
        	int temp = 0;
        	while(parentindex>=0&&array[childindex]<array[parentindex]){
        		temp = array[childindex];
        		array[childindex] = array[parentindex];
        		array[parentindex] = temp;
        		childindex = parentindex;
        		parentindex = (childindex-1)/2;
        	}
    	}
    	
    }
    
    public void buildMinHeap(int[] array){
    	for(int i=0;i<array.length;i++){
    		goUp(array,i);
    	}
    }
    
    public void HeapSort(int[] array){
    	int endindex = array.length-1;
    	int temp = 0;
    	while(endindex>0){
    		temp = array[0];
            array[0]=array[endindex];
    		array[endindex]=temp;
    		endindex--;
    		goDown(array,0,endindex);
    	}
    }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int[] array = {4,3,7,11,6,2,8,1,15};
		 //int[] array = {4,7,6,0,5,11,3,2,8,1};
		//int[] array = {2,3,4,7,8,9,10,12,13,1};
		 int[] array = {3,5,7,1,8,4,9};
		//int[] array = {0, 1, 3, 4, 2, 11, 6, 7, 8, 5};
		//int[] array = {3,3,7,11,5,2,4};
        TestHeapSort ths = new TestHeapSort();
        //ths.goDown(array, 2,array.length-1);
        //ths.goUp(array, array.length-1);
        ths.buildMinHeap(array);
        ths.HeapSort(array);
        System.out.println(Arrays.toString(array));
        
	}

}
