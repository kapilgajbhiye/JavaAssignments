package com.bridgelab.linklist.in;


public class Uc3_AppendData {
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
	public void append(int data) {
		Node new_node = new Node(data);
		if(head == null) {
			head = new_node;
		}
		else {
			Node currentNode = head;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = new_node;
		}
		
	}	
		
	public void display() {
		
		if(head== null) {
			System.out.println("List is empty");
		}
		else {
		Node currentNode = head; // for traversing node
		while(currentNode != null) { //traverse untill last node
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
			}
			System.out.println();
		}	
	}
		
	public static void main(String args[]) {
		 Uc3_AppendData list = new  Uc3_AppendData();
		 System.out.println("Origninal List");
		 	list.addData(56);
			list.display();	
			System.out.println("Append data");
			list.append(30);
			list.display();
			System.out.println("Append data");
			list.append(70);
			list.display();
			
			//list.addNthPos(56, 1);
			//list.display();
	}
}
