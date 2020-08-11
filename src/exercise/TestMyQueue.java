package exercise;

public class TestMyQueue {
    int[] array;
    int front;
    int rear;
	
    TestMyQueue(int capacity){
    	array = new int[capacity];
    }
    
    public void enQueue(int data){
    	if((rear+1)%array.length==front){
    		System.out.println("队列已满");
    		return;
    	}
    	array[rear] = data;
    	rear = (rear+1)%array.length;
    }
    
    public int deQueue() throws Exception{
    	if(rear==front){
    		new Exception("队列为空，不能删除");
    	}
    	
    	int deleteelement = front;
    	front = (front+1)%array.length;
    	return deleteelement;
    }
    
    public void printQueue(){
    	if(front==rear){
    		System.out.println("队列为空，不能打印");
    	}
    	for(int i=front;i!=rear;i=(i+1)%array.length){
    		System.out.println(array[i]);
    	}
    }
    
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		TestMyQueue mq = new TestMyQueue(6);
		mq.enQueue(3);
		mq.enQueue(5);
		mq.enQueue(6);
		mq.enQueue(8);
		mq.enQueue(1);
		mq.printQueue();
		mq.deQueue();
		mq.deQueue();
		mq.deQueue();
		mq.enQueue(2);
		mq.enQueue(4);
		mq.enQueue(9);
		System.out.println("****************");
		mq.printQueue();
		
	}

}
