package com.bridgelab.linklist.in;

public class Uc5_DeleteFirstNode {
	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	
	public void insertElement(int data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
		}
		else {
			 newnode.next = head;
			 head = newnode;
		}
	}
	
	public void delFirst() {
		if(head == null) {
			System.out.println("List is empty");
		}
		
		head = head.next;
		
	}
	
	public void display() {
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			Node currentnode = head;
			while(currentnode !=null) {
				System.out.print(currentnode.data + " -> ");
				currentnode = currentnode.next;
			}
			System.out.println("");
		}
		
	}
	
	public static void main(String[] args) {
		Uc5_DeleteFirstNode list = new Uc5_DeleteFirstNode();
		System.out.println("Original list");
		list.insertElement(70);
		list.insertElement(30);
		list.insertElement(56);
		list.display();
		
		System.out.println("Delete 1st element");
		list.delFirst();
		list.display();
	}

}
