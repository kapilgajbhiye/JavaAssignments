package com.bridgelab.linklist.in;

public class Uc2_addElements {
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}	
	public void addData(int data) {
		Node new_node = new Node(data);	
		if(head == null) {
			head=new_node;
			return;
		}
		else {
				new_node.next = head;
				head = new_node;				
		}
			
	}
	public void display() {
		
		if(head== null) {
			System.out.println("List is empty");
		}
		else {
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
			}
			//System.out.println("null");
		}	
	}
		
	public static void main(String args[]) {
		Uc2_addElements list = new Uc2_addElements();
			list.addData(70);
			list.addData(30);
			list.addData(56);
			list.display();
	}
	
	
}