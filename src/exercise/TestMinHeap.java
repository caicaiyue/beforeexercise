package exercise;

public class TestMinHeap {
	
	public void goUp(int[] array){
		int childindex = array.length-1;
		int parentindex = (childindex-1)/2;
		int temp = array[childindex];
		while(parentindex>=0&&temp<array[parentindex]){
			array[childindex]=array[parentindex];
			childindex = parentindex;
			parentindex = (childindex-1)/2;
		}
		array[childindex]=temp;
	}
	
	public void printArray(int[] array){
		for(int i:array){
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TestMinHeap tmh = new TestMinHeap();
        //int[] array = {2,3,4,7,8,9,10,12,13,1};
        int[] array = {3,5,7,1,8,4,9};
        tmh.goUp(array);
        tmh.printArray(array);
	}

}
