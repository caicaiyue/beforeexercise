package exercise;

public class TestDoubleQueue {
	
	int[] array;
	int front;
	int rear;
	
	
	TestDoubleQueue(int capacity){
		array = new int[capacity];
	}
	
	//�Ӷ���β����������
	public void rearinto(int data){
		if(((rear+1)%array.length)==front){
			System.out.println("�������ˣ����ܲ�������");
			return;
		}
		
		array[rear]=data;
		rear = (rear+1)%array.length;
	}
	
	//�Ӷ���β����������
	public void frontinto(int data){
		if(((rear+1)%array.length)==front){
			System.out.println("�������ˣ����ܲ�������");
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
	
	//�Ӷ��׵���Ԫ��
	public int frontpop(){
		int deleteitem = 0;
		
		if(front==rear){
			System.out.println("����Ϊ�գ����ܵ�������");
			
		}else{
			deleteitem = array[front];
			front = (front+1)%array.length;
		}
		
		return deleteitem;
	}
	
	//�Ӷ�β����
	public int rearpop(){
		int deleteitem = 0;
		if(front==rear){
			System.out.println("����Ϊ�գ����ܵ�������");
			
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
        System.out.println("ɾ����Ԫ����:"+dq.frontpop());
        System.out.println("ɾ����Ԫ����:"+dq.rearpop());
        System.out.println("ɾ����Ԫ����:"+dq.frontpop());
        System.out.println("ɾ����Ԫ����:"+dq.rearpop());
        System.out.println("ɾ����Ԫ����:"+dq.frontpop());
        System.out.println("ɾ����Ԫ����:"+dq.rearpop());
        //System.out.println("ɾ����Ԫ����:"+dq.rearpop()); //���һ������rearpop����
        //dq.rearpop();
        dq.printQueue();
	}

}
