package exercise;

public class TestCycleQueue {
	int front;
	int rear;
	int[] array;
      
	TestCycleQueue(int capacity){
		array = new int[capacity];
	}
	
	public void intoQueue(int data){
		if((rear+1)%array.length==front){
			System.out.println("队列满了，不能插数据了");
			return;
		}
		
		array[rear]=data;
		rear = (rear+1)%array.length;
	}
	
	
	public void popQueue(){
		if(front==rear){
			System.out.println("队列为空，不能删除");
		}else{
			int remove = array[front];
			front = (front+1)%array.length;
		}
		
		
	}
	
	public void printCycleQueue(){
		for(int i=front;i!=rear;i=(i+1)%array.length){
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCycleQueue cq = new TestCycleQueue(8);
		cq.intoQueue(6);
		cq.intoQueue(7);
		cq.intoQueue(2);
		cq.intoQueue(8);
		cq.intoQueue(5);
		cq.intoQueue(1);
		cq.intoQueue(4);
		//cq.intoQueue(9);
		cq.printCycleQueue();
		System.out.println("***********");
		cq.popQueue();
		cq.popQueue();
		cq.popQueue();
		cq.popQueue();
		cq.popQueue();
		cq.popQueue();
		cq.popQueue();
		cq.popQueue();
		cq.printCycleQueue();
	}

}
