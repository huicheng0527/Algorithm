package com.class4;

public class TestLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Link lk=new Link();
			lk.insertFirst(34);
			lk.insertFirst(23);
			lk.insertFirst(30);
			lk.insertFirst(10);
			
//			lk.display();
//			System.out.println();
////			lk.deleteFirst();
////			lk.display();
////			System.out.println();
//			
			Node node = lk.search(23);
			node.display();
	}

}
