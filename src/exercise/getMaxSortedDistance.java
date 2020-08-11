package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class getMaxSortedDistance {
	// 桶排序
	public void bucketsort(double[] array) {
		double max = array[0];
		double mini = array[0];
		for (double i : array) {
			if (i < mini) {
				mini = i;
			}

			if (i > max) {
				max = i;
			}
		}

		int countnum = array.length;
		// double diff = (max-mini)/(countnum-1);
		ArrayList<LinkedList> bucketlist = new ArrayList<LinkedList>();
		for (int i = 0; i < array.length; i++) {
			bucketlist.add(new LinkedList<Double>());
		}

		for (double d : array) {
			int num = (int) (((d - mini) / (max - mini)) * (countnum - 1));
			bucketlist.get(num).add(d);
		}

		for (LinkedList list : bucketlist) {
			Collections.sort(list);
		}

		double[] sortedarray = new double[array.length];
		int count = 0;
		for (LinkedList<Double> list : bucketlist) {
			Iterator<Double> it = list.iterator();
			while (it.hasNext()) {
				sortedarray[count++] = it.next();
			}
		}

		System.out.println(Arrays.toString(sortedarray));
	}

	// 一个无序数组，如何求出该数组排序后的任意两个相邻元素的最大差值？要求时间和空间复杂度尽可能低
	// 无序数组 2 6 3 4 5 10 9
	// 排序结果 2 3 4 5 6 9 10
	public int gmsd(int[] array) {
		int mini = array[0];
		int max = array[0];
		for (int i : array) {
			if (i < mini) {
				mini = i;
			}

			if (i > max) {
				max = i;
			}
		}

		int countnum = array.length;
		int diff = max -mini;
		Bucket[] bucketarray = new Bucket[countnum];
		for (int i = 0; i < countnum; i++) {
			bucketarray[i] = new Bucket();
		}
		
		for(int i:array){
			int num = (i-mini)*(countnum-1)/diff;
			if(bucketarray[num].mini==null||i<bucketarray[num].mini){
				bucketarray[num].mini=i;
			}
			
			if(bucketarray[num].max==null||i>bucketarray[num].max){
				bucketarray[num].max = i;
			}
		}
		
		int leftmax = bucketarray[0].max;
		int maxDistance = 0;
		for(int i=1;i<countnum;i++){
			if(bucketarray[i].mini==null){
				continue;
			}
			
			if((bucketarray[i].mini-leftmax)>maxDistance){
				maxDistance = bucketarray[i].mini-leftmax;
			}
			
			leftmax = bucketarray[i].max;
		}

		return maxDistance;
	}

	private class Bucket {
		Integer mini;
		Integer max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getMaxSortedDistance gmsd = new getMaxSortedDistance();
		int[] array = { 2, 6, 3, 4, 5, 10, 9 };
		// double[] array = {4.5,0.84,3.25,2.18,0.5};
		// double[] array = { 4.12, 1.212, 6.421, 0.0023, 1.5, 3.11, 3.0, 2.123,
		// 8.122, 4.12, 10.09 };
		// gmsd.bucketsort(array);
		System.out.println(gmsd.gmsd(array));
	}

}
