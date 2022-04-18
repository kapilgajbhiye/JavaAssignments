package com.bridgelab.linklist.in;

public class Uc6_DeleteLastElement {
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
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
		}
		else {
			newnode.next = head;
			head = newnode;
		}
	}
	
	public void delLast() {
		if(head == null) {
			System.out.println("List is empty");
		}
		if(head.next == null) {
			head = null;
		}
		else {
			
			Node secondLast = head;
			Node lastNode = head.next;
			while(lastNode.next != null){
				lastNode = lastNode.next;
				secondLast = secondLast.next;
			}
			secondLast.next = null;
		}
	}

	
	public void display() {
		if(head == null) {
			System.out.println("List is empty");
		}
		Node currentnode = head;
		while(currentnode != null) {
			System.out.print(currentnode.data + " -> ");
			currentnode = currentnode.next;
		}
		System.out.println("");
		
	}
	
	public static void main(String[] args) {
		Uc6_DeleteLastElement list = new Uc6_DeleteLastElement();
		System.out.println("Original List");
		list.addData(70);
		list.addData(30);
		list.addData(56);
		list.display();
		
		System.out.println("Delete last Element");
		list.delLast();
		list.display();
		
	}

}
