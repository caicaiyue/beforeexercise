package exercise;

import java.util.Arrays;

public class TestMaxHeapSort {
	
	public void goDown(int[] array,int startindex,int endindex){
		int temp = array[startindex];
		int parentindex = startindex;
		int childindex = parentindex*2+1;
		while(childindex<=endindex){
			if(childindex+1<=endindex){
				if(array[childindex]<array[childindex+1]){
					childindex++;
				}
			}
			
			if(array[childindex]<temp){
				break;
			}
			array[parentindex]=array[childindex];
			parentindex = childindex;
			childindex = parentindex*2+1;
			
		}
		
		array[parentindex] = temp;
	}
	
	public void buildHeap(int[] array){
		for(int i=(array.length-2)/2;i>=0;i--){
			goDown(array,i,array.length-1);
		}
	}
	
	
	public void HeapSort(int[] array){
		for(int i=array.length-1;i>=0;i--){
			int temp = array[0];
			array[0] = array[i];
			array[i]=temp;
			goDown(array,0,i-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      //int[] array = {4,3,7,11,6,2,8,1,15};
		 //int[] array = {4,7,6,0,5,11,3,2,8,1};
		 //int[] array = {2,3,4,7,8,9,10,12,13,1};
		 //int[] array = {3,5,7,1,8,4,9};
		//int[] array = {0, 1, 3, 4, 2, 11, 6, 7, 8, 5};
		int[] array = {3,3,7,11,5,2,4};
		 TestMaxHeapSort tmhs = new TestMaxHeapSort();
		 tmhs.buildHeap(array);
		 tmhs.HeapSort(array);
		 System.out.println(Arrays.toString(array));
	}

}
