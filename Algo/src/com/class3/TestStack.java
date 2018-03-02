package com.class3;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyStack ms = new MyStack(4);
//		ms.push(23);
//		ms.push(12);
//		ms.push(1);
//		ms.push(90);
//		System.out.println(ms.isEmpty());
//		System.out.println(ms.isFull());
//		
//		System.out.println(ms.peek());
//		while(!ms.isEmpty())
//		{
//			System.out.print(ms.pop() + " ");
//			
//		}
//		System.out.println();
//		System.out.println(ms.isEmpty());
//		System.out.println(ms.isFull());
		
		MyCycleQueue mq = new MyCycleQueue(4);
		mq.insert(23);
		mq.insert(13);
		mq.insert(70);
		mq.insert(5);

		System.out.println(mq.isEmpty());
		System.out.println(mq.isFull());
		System.out.println(mq.peek());
		
		while(!mq.isEmpty())
		{
			System.out.print(mq.remove() + " ");
		}
		
		mq.insert(23);
		mq.insert(13);
		mq.insert(70);
		mq.insert(5);

		System.out.println(mq.isEmpty());
		System.out.println(mq.isFull());
		System.out.println(mq.peek());
		
		while(!mq.isEmpty())
		{
			System.out.print(mq.remove() + " ");
		}
	}

}
