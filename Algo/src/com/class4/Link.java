package com.class4;

//LinkList, like a train

public class Link {
	
	private Node first;

	public Link() {
		first = null;
	}
	
	//insert behind the first node
	public void insertFirst(long value) {
		Node node = new Node(value);
		if(first == null) {
			first = node;
		}
		else{
			node.next = first;
			first = node;
		}
		
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first = temp.next;
		return temp;
	}
	
	public void display() {
		Node current = first;
		while(current != null) {
			current.display();
			current=current.next;
		}
	}
	
	public Node search(long value) {
		Node current = first;
		while(current.data != value) {
			if(current.next==null) {
				return null;
			}
			current = current.next;
		}
		return current;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
