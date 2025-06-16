package universe;

import java.util.*;

public class Linkedlist {
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	 static Node head=null;  /// pointers
	Node tail=null;
	
	void addNode(int data)
	{
		Node newNode=new Node(data);
		
		if (head==null)
		{
		//	System.out.println("Linked List is empty");
			head=newNode;
			tail=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	static void displayNode()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	
	public static void main(String[] args)
	{
		Linkedlist l=new Linkedlist();
		l.addNode(8);
		l.addNode(21);
		l.addNode(2);
		l.addNode(32);
		l.addNode(21);
		
		displayNode();
	}

}
