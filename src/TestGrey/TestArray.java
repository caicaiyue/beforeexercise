package TestGrey;

public class TestArray {
	int size;
	static int[] array;
	TestArray(int capacity){
		array = new int[capacity];
		size = 0;
	}
	
	public void printArray(){
		for(int i=0;i<size;i++){
			System.out.println(array[i]);
		}
	}
	
	public void insert(int index,int element) throws Exception{
		if(index<0){
			new Exception();
		}else if(index>=array.length){
			resize();
		}
		
		for(int i=size;i>index;i--){
			array[i]=array[i-1];
		}
		
		array[index] = element;
		size++;
		
		if(size>=array.length){
			resize();
		}
		
		
	
	}
	
	public void remove(int index)throws Exception{
		if(index<0||index>=array.length){
			new Exception();
		}
		
		for(int i=index;i<size;i++){
			array[i]=array[i+1];
		}
		
		size--;
	}
	

	private void resize() {
		// TODO Auto-generated method stub
		int[] newarray = new int[array.length*2];
		/*for(int i=0;i<array.length;i++){
			newarray[i]=array[i];
		}*/
		System.arraycopy(array, 0, newarray, 0, array.length);
		array = newarray;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        TestArray at = new TestArray(2);
        at.insert(0, 3);
        at.insert(1, 7);
        at.insert(2, 6);
        at.insert(3, 8);
        at.insert(2, 9);
        at.printArray();
        System.out.println("**************");
        System.out.println(at.array.length);
        at.remove(4);
        at.remove(0);
        at.remove(1);
        at.printArray();
        System.out.println("**************");
	}

}
