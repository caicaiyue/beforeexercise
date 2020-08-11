package exercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinTree {
    public BinTree root;
    public BinTree left;
    public BinTree right;
    private Object data;
    public List<BinTree> datas;
    
    BinTree(BinTree left,BinTree right,Object data){
    	this.left = left;
    	this.right = right;
    	this.data = data;
    }
    
    BinTree(Object data){
    	this.data = data;
    }
    
    BinTree(){
    	
    }
	
    //创建二叉树
	public void create(Object[] objs){
		datas = new ArrayList<BinTree>();
		for(Object o:objs){
			datas.add(new BinTree(o));
		}
		
		root = datas.get(0);
		
		for(int i=0;i<(objs.length/2);i++){
			BinTree b = datas.get(i);
			b.left = datas.get(i*2+1);
			if(i*2+2<objs.length){
				b.right = datas.get(i*2+2);
			}
		}
	}
	
	//递归的先序遍历
	public void preorder(BinTree root){
		if(root!=null){
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	//不递归的先序遍历
	public void preorder2(BinTree root){
		Stack s1 = new Stack();
		if(root!=null){
			s1.push(root);
		}
		
		while(!s1.isEmpty()){
			root = (BinTree) s1.pop();
			System.out.println(root.data);
			
			if(root.right!=null){
				s1.push(root.right);
			}
			if(root.left!=null){
				s1.push(root.left);
			}
		}
	}
	
	//中序遍历
	public void inorder(BinTree root){
		if(root!=null){
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	
	//不递归的中序遍历
	
	//递归的后续遍历
	public void afterorder(BinTree root){
		if(root!=null){
			afterorder(root.left);
			afterorder(root.right);
			System.out.println(root.data);
		}
	}
	
	//不递归的后续遍历
	public void afterorder2(BinTree root){
		Stack s = new Stack();
		BinTree b = null;
		Boolean leftcheck = false;
		Boolean rightcheck = false;
		
		while(root!=null&&!s.isEmpty()){
			if(root!=null){
				s.push(root);
				if(root.left==null&&root.right==null){
					root = (BinTree) s.pop();
					System.out.println(root.data);
				}else{
					if(root.right!=null){
						if(root!=b){
							b = root;
						    s.push(b);
							root = root.right;
						}else{
							if(root.left!=null){
								
							}
						}
							
					}else {
						
					}
				}
			}else{
				root = (BinTree) s.pop();
			}
		}
			
		}
	
	//按层查询
	public void layerorder(BinTree root){
		LinkedList<BinTree> list = new LinkedList<BinTree>();
		list.offer(root);
		int count = 0;
		while(!list.isEmpty()){
			root = list.poll();
			count++;
			if(root.left!=null){
				list.offer(root.left);
			}
			if(root.right!=null){
				list.offer(root.right);
			}
			System.out.println(root.data);
		}
		System.out.println(count);
	}
	
	public int parentdata(int n){
		return (n-1)/2;
	}
	
	public int leftdata(int n){
		return n*2+1;
	}
	
	public int rightdata(int n){
		return n*2+2;
	}
	
	public void buildMinHeap(int[] data){
		
		for(int i=1;i<data.length;i++){
			int t = i;
			while(t!=0&&(data[parentdata(t)]>data[t])){
				int temp = data[parentdata(t)];
				data[parentdata(t)]=data[t];
				data[t]=temp;
				t=parentdata(t);
			}
		}
	}
	
	public void insertHeap(int[] data,int num){
		if(num<data[0]){
			return;
		}else{
			data[0]=num;
		}
		
		int i = 0;
		while(i<data.length&&(data[i]>data[leftdata(i)]||data[i]>data[rightdata(i)])){
			if(data[leftdata(i)]<data[rightdata(i)]){
				int temp = data[i];
				data[i] = data[leftdata(i)];
				data[leftdata(i)]=temp;
				if(leftdata(i)<data.length){
					i = leftdata(i);
				}else{
					break;
				}
			}else{
				int temp = data[i];
				data[i] = data[rightdata(i)];
				data[rightdata(i)]=temp;
				if(rightdata(i)<data.length){
					i = rightdata(i);
				}else{
					break;
				}
			}
		}
	}
	public void printdata(int[] data){
		for(int i:data){
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BinTree b = new BinTree();
        Object []a={2,4,5,7,1,6,12,32,51,22,77,18};
        int []a1={99,5,36,7,22,17,92,12,2,19,25,28,1,46};
        b.buildMinHeap(a1);
        b.insertHeap(a1,29);
        b.printdata(a1);
        //b.create(a);
        //b.preorder(b.root);
        //b.layerorder(b.root);
        //b.preorder(b.root);
        //System.out.println("**************");
        //b.preorder2(b.root);
        //b.inorder(b.root);
        //b.afterorder(b.root);
        //b.layerorder(b.root);
	}

}
