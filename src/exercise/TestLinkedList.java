package exercise;

public class TestLinkedList {
	Node head;
	Node last;
	int size;
	
	static class Node{
		int data;
		Node Next;
		Node(int data){
			this.data = data;
		}
	}
	
	public Node get(int index){
		Node temp = head;
		for(int i=0;i<index;i++){
			temp = temp.Next;
		}
		return temp;
	}
	
	public void PrintLinkedList(){
		Node temp = head;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.Next;
		}
	}
	
	public void insert(int index,int data){
		if(index<0){
			System.out.println("请输入合理的索引数");
			return;
		}
		Node newNode = new Node(data);
		
		if(size==0){
			head = newNode;
			last = newNode;
		}else{
			head = get(0);
			last = get(size-1);
			if(index==0){
				newNode.Next = head;
				head = newNode;
			}else if(index==size-1){
				last.Next = newNode;
				last = newNode;
			}else{
				Node preNode = get(index-1);
				newNode.Next = preNode.Next;
				preNode.Next = newNode;
			}
		}
		size++;
	}
	
	public void remove(int index){
		if(size==0||index<0||index>=size){
			System.out.println("不能删除");
		}else if(size>0){
			Node delet ;
			if(index==0){
				delet = head;
				head = head.Next;
			}else if(index==size-1){
				delet = last;
				Node temp = get(index-1);
				temp.Next = null;
				last = temp;
			}else{
				Node preNode = get(index-1);
				delet = preNode.Next;
				Node newNode = delet.Next;
				preNode.Next = newNode;
			}
			size--;	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestLinkedList tl = new TestLinkedList();
		tl.insert(0,3);
		tl.insert(1, 7);
		tl.insert(2, 9);
		tl.insert(3, 5);
		tl.insert(1, 6);
		
		System.out.println("*******");
		tl.PrintLinkedList();
		System.out.println("*******");
		tl.remove(0);
		tl.remove(3);
		tl.remove(1);
		tl.PrintLinkedList();
		
	}

}
