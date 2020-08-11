package exercise;

import java.util.Arrays;

public class TestSort1 {

	public void BubbleSort(int[] array) {
		Boolean isChange = false;
		int setBorder = array.length - 1;
		int lastchangeindex = 0;
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < setBorder; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					isChange = true;
					lastchangeindex = j;
				}
			}

			setBorder = lastchangeindex;
			if (!isChange) {
				break;
			}

		}
	}

	// 双向索引的快速排序
	public void doubleLoop(int[] array, int startindex, int endindex) {
		if (startindex >= endindex) {
			return;
		}

		int pivotIndex = partition(array, startindex, endindex);
		doubleLoop(array, startindex, pivotIndex - 1);
		doubleLoop(array, pivotIndex + 1, endindex);
	}

	private int partition(int[] array, int startindex, int endindex) {
		// TODO Auto-generated method stub
		int pivot = array[startindex];
		int left = startindex;
		int right = endindex;
		int temp = 0;
		while (right != left) {
			while (array[right] > pivot && right > left) {
				right--;
			}

			while (array[left] <= pivot && left < right) {
				left++;
			}

			if (left < right) {
				temp = array[left];
				array[left] = array[right];
				array[right] = temp;
			}

		}

		array[startindex] = array[left];
		array[left] = pivot;

		return left;
	}

	public void SingleLoop(int[] array, int startindex, int endindex) {
		if (startindex >= endindex) {
			return;
		}

		int pivotindex = singlepartition(array, startindex, endindex);
		SingleLoop(array, startindex, pivotindex-1);
		SingleLoop(array, pivotindex+1, endindex);
	}

	private int singlepartition(int[] array, int startindex, int endindex) {
		// TODO Auto-generated method stub
		int pivot = array[startindex];
		int index = startindex;
		int right = endindex;
		while(index<right){
			while(array[right]>=pivot&&right>index){
				right--;
			}
			
			if(array[right]<pivot){
				if(right==index){
					break;
				}
				index++;
				int temp = array[index];
				array[index] = array[right];
				array[right] = temp;
			}
			
			
		}
		
		array[startindex] = array[index];
		array[index] = pivot;
		
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] array = { 4, 7, 6, 5, 3, 2, 8, 1 };
		//int[] array = {3,5,7,1,8,4,9};
		//int[] array ={2,3,4,7,8,9,10,12,13,1};
		int[] array = {1,2,3,4,3,2,3,7,8,9};
		TestSort1 ts1 = new TestSort1();
		// ts1.BubbleSort(array);
		//ts1.doubleLoop(array, 0, array.length - 1);
		ts1.SingleLoop(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}

}
