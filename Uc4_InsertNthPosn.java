package com.bridgelab.linklist.in;

public class Uc4_InsertNthPosn {
	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void addElement(int data) {
		Node newnode = new Node(data);
		if(head == null) {
			 head = newnode;
		}
		else {
			newnode.next = head;
			head = newnode;
		}
	
	}
	public void insertInPosition(int data,int pos) {
		Node newnode = new Node(data);
		if(pos == 0) {
			newnode.next = head;
			head = newnode;
			return;
		}
		Node currentnode = head;
		for(int i =0; i<pos-1;i++) {
			currentnode =currentnode.next;
		}
		newnode.next = currentnode.next;
		currentnode.next = newnode;
	}
	
	public void display() {
		Node currentnode = head;
		while(currentnode != null) {
			System.out.print(currentnode.data +" -> ");
			currentnode = currentnode.next;
		}
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		Uc4_InsertNthPosn insertposin = new Uc4_InsertNthPosn();
		System.out.println("Origninal List");
		insertposin.addElement(70);
		insertposin.addElement(56);
		insertposin.display();
		System.out.println("Insert 2nd Position");
		insertposin.insertInPosition(30,1);
		insertposin.display();
		
	}

}
