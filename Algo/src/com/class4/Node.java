package com.class4;

//cargo

public class Node {
	
	public long data;
	//point to next cargo
	public Node next;
	
	public Node(long value) {
		this.data=value;
	}
	
	public void display() {
		System.out.print(data + " ");
	}

}
