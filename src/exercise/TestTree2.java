package exercise;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.UUID;

import javax.management.Query;

public class TestTree2 {
   Node root;
   
   List<Node> list = new ArrayList<Node>();

   TestTree2(int[] array){
	   for(int i:array){
		   Node n = new Node(i);
		   list.add(n);
	   }
	   
	   root = list.get(0);
	   for(int i=0;i<list.size()/2;i++){
		   Node temp = list.get(i);
		   if(i*2+1<list.size()){
			   temp.left = list.get(i*2+1);
		   }
		   if(i*2+2<list.size()){
			   temp.right = list.get(i*2+2);
		   }
		   
	   }
	   
   }
   
   //二叉树先序遍历，递归方法
   public void beforeorder(Node root){
	   if(root!=null){
		   System.out.println(root.data);
		   if(root.left!=null){
			   beforeorder(root.left);
		   }
		   
		   if(root.right!=null){
			  
			   beforeorder(root.right);
		   }
	   }
   }
   
 //二叉树先序遍历，递归方法
   public void beforeorder1(Node root){
	   Stack s = new Stack();
	   while(root!=null||!s.isEmpty()){
		   if(root!=null){
			   System.out.println(root.data);
			   if(root.right!=null){
				   s.push(root.right);
			   }
			   
				   root = root.left;
			   
		   }else{
			   root = (Node) s.pop();
		   }
		   
	   }
   }
   
   //二叉树中序遍历，递归方法
   public void inorder(Node root){
	   if(root!=null){
		   if(root.left!=null){
			   inorder(root.left);
		   }
		   System.out.println(root.data);
		   if(root.right!=null){
				  
			   inorder(root.right);
		   }
	   }
   }
 //二叉树中序遍历，非递归方法
   public void inorder1(Node root){
	   Stack s = new Stack();
	   while(root!=null||!s.isEmpty()){
		   if(root!=null){
			   s.push(root);
			   root = root.left;
		   }else{
			   root=(Node) s.pop();
			   System.out.println(root.data);
			   root = root.right;
		   }
	   }
   }
   
   
   //二叉树后续遍历，递归方法
   public void afterorder(Node root){
	   if(root!=null){
		   if(root.left!=null){
			   afterorder(root.left);
		   }
		   
		   if(root.right!=null){
				  
			   afterorder(root.right);
		   }
		   
		   System.out.println(root.data);
	   }
   }
   
   //二叉树后续遍历，非递归方法
   public void afterorder1(Node root){
	   Stack s = new Stack();
	   Node temp = null;
	   Node check = null;
	   while(root!=null||!s.isEmpty()){
		   if(root!=null&&root!=temp){
			   s.push(root);
			   root = root.left;
		   }else{
			   if(!s.isEmpty()){
				   temp = (Node) s.peek();
				   if(temp.right==null){
					   root = (Node) s.pop();
					   System.out.println(root.data);
				   }else{
					   if(temp.right!=check){
						   root = temp.right;
						   check = root;
					   }else{
						   root = (Node) s.pop();
						   System.out.println(root.data);
						   check = root;
					   }
				   }
			   }else{
				   break;
			   }
			   
		   }
	   }
   }
   
   public void layerorder(Node root){
	  Queue queue = new LinkedList();
	  queue.offer(root);
	  while(!queue.isEmpty()){
		  Node temp = (Node) queue.poll();
		  System.out.println(temp.data);
		  if(temp.left!=null){
			  queue.offer(temp.left);
		  }
		  
		  if(temp.right!=null){
			  queue.offer(temp.right);
		  }
	  }
   }
   
   private class Node{
	   int data;
	   Node right;
	   Node left;
	   Node(int data){
		   this.data = data;
	   }
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {4,7,6,5,3,2,8,1};
		//int[] array = {95,94,91,98,99,90,99,93,91,92};
		//int[] array = {99,5,36,2,19,1,46,12,7,22,25,28,17,92};
		TestTree2 tt2 = new TestTree2(array);
		/*UUID uuid1 = UUID.randomUUID();
		String s1 = uuid1.toString();
		System.out.println(s1);
		Date d = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat format2 = new SimpleDateFormat("HH:mm:ss");
		String d1 = format1.format(d);
		String d2 = format2.format(d);
		String dd = d1+"T"+d2;
		System.out.println(dd);*/
		
		Node root = tt2.root;
		//tt2.beforeorder(root);
		//tt2.beforeorder1(root);
		//tt2.inorder(root);
		//tt2.inorder1(root);
		//tt2.afterorder(root);
		//System.out.println("********");
		//tt2.afterorder1(root);
		tt2.layerorder(tt2.root);
	}

}
