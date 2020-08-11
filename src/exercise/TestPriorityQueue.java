package exercise;

//优先队列，值小的先出去
public class TestPriorityQueue {
    int size;
    int[] array;
    TestPriorityQueue(){
    	array = new int[4];
    }
    
    //从队尾入站，小的就往上浮
    public void enQueue(int key){
    	if(size>=array.length){
    		resize();
    	}
    	
    	array[size++]=key;
    	goUp(key);
    }
    
    //把队列第一个出栈，把最后一个数据当成队首，再下沉
    public void deQueue(){
    	array[0] = array[--size];
    	goDown(array[0]);
    }
    
	private void goDown(int key) {
		// TODO Auto-generated method stub
		if(size==0){
			System.out.println("队列已空，无法出栈");
			return;
		}
		int parentindex = 0;
		int childindex = parentindex*2+1;
		while(childindex<size){
			if(array[childindex+1]<array[childindex]){
				childindex++;
			}
			
			if(key<array[childindex]){
				break;
			}
			
			array[parentindex]=array[childindex];
			parentindex=childindex;
			childindex = parentindex*2+1;
		}
		
		array[parentindex]=key;
	}

	private void goUp(int key) {
		// TODO Auto-generated method stub
		int childindex = size-1;
		int parentindex = (childindex-1)/2;
		while(childindex>0&&array[parentindex]>key){
			array[childindex]=array[parentindex];
			childindex = parentindex;
			parentindex = (childindex-1)/2;
		}
		
		array[childindex] = key;
	}

	private void resize() {
		// TODO Auto-generated method stub
		int[] newarray = new int[array.length*2];
		System.arraycopy(array, 0, newarray, 0, array.length);
		array = newarray;
	}
	
	public void printPriorityQueue(){
		for(int i=0;i<size;i++){
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPriorityQueue  tpq = new TestPriorityQueue();
		tpq.enQueue(2);
		tpq.enQueue(7);
		tpq.enQueue(5);
		tpq.enQueue(25);
		tpq.enQueue(17);
		tpq.enQueue(11);
		tpq.enQueue(21);
		tpq.enQueue(3);
		tpq.printPriorityQueue();
		System.out.println("******");
		while(tpq.size>1){
			tpq.deQueue();
		}
		tpq.printPriorityQueue();
	}

}
