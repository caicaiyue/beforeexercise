package exercise;

public class TestDoubleQueue {
	
	int[] array;
	int front;
	int rear;
	
	
	TestDoubleQueue(int capacity){
		array = new int[capacity];
	}
	
	//从队列尾部插入数据
	public void rearinto(int data){
		if(((rear+1)%array.length)==front){
			System.out.println("队列满了，不能插入数据");
			return;
		}
		
		array[rear]=data;
		rear = (rear+1)%array.length;
	}
	
	//从队列尾部插入数据
	public void frontinto(int data){
		if(((rear+1)%array.length)==front){
			System.out.println("队列满了，不能插入数据");
			return;
		}
		
		int temp = array[front];
		if(front>=1){
			front = front-1;
		}else{
			front = array.length-1;
		}
		array[front]=data;
		
		
	}
	
	//从队首弹出元素
	public int frontpop(){
		int deleteitem = 0;
		
		if(front==rear){
			System.out.println("队列为空，不能弹出数据");
			
		}else{
			deleteitem = array[front];
			front = (front+1)%array.length;
		}
		
		return deleteitem;
	}
	
	//从队尾弹出
	public int rearpop(){
		int deleteitem = 0;
		if(front==rear){
			System.out.println("队列为空，不能弹出数据");
			
		}else{
			deleteitem = array[rear-1];
			if(rear>1){
				rear = rear -1;
			}else{
				rear = array.length-1;
			}
			
		}
		
		return deleteitem;
	}
	
	public void printQueue(){
		for(int i=front;i!=rear;i=((i+1)%array.length)){
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDoubleQueue dq = new TestDoubleQueue(8);
        dq.frontinto(8);
        dq.frontinto(6);
        dq.rearinto(7);
        dq.frontinto(3);
        dq.rearinto(9);
        dq.rearinto(5);
        dq.rearinto(11);
        dq.printQueue();
        System.out.println("***********");
        System.out.println("删除的元素是:"+dq.frontpop());
        System.out.println("删除的元素是:"+dq.rearpop());
        System.out.println("删除的元素是:"+dq.frontpop());
        System.out.println("删除的元素是:"+dq.rearpop());
        System.out.println("删除的元素是:"+dq.frontpop());
        System.out.println("删除的元素是:"+dq.rearpop());
        //System.out.println("删除的元素是:"+dq.rearpop()); //最后一个数，rearpop不对
        //dq.rearpop();
        dq.printQueue();
	}

}
