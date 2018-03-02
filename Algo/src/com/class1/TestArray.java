package com.class1;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArray ma = new MyArray();
		ma.insert(7);
		ma.insert(13);
		ma.insert(15);
		ma.insert(12);
		ma.insert(2);
		ma.insert(200);
		ma.diplay();
		System.out.println(ma.search(2));
		System.out.println(ma.getValue(4));
		ma.modify(2, -29);
		ma.diplay();
		
		OrderArray oa = new OrderArray();
		oa.insert(7);
		oa.diplay();
		oa.insert(33);
		oa.diplay();
		oa.insert(15);
		oa.diplay();
		oa.insert(22);
		oa.diplay();
		oa.insert(2);
		oa.insert(200);
		oa.diplay();
		oa.insert(123);
		oa.diplay();
		oa.insert(78);
		oa.diplay();
		oa.insert(3333);
		oa.diplay();
		
		
		System.out.println(oa.binarySearch(77));
//		ma.modify(-5, -269);
//		ma.diplay();
//		ma.delect(0);
//		ma.diplay();
//		ma.delect(3);
//		ma.diplay();
//		ma.delect(2);
//		ma.diplay();
//		long[] arr = new long[2];
//		arr[0] = 12;
//		arr[1] = 11;
//		for(long x: arr)
//		{System.out.println(x);}
//		for(int i =0; i<arr.length; i++)
//		{System.out.println(arr[i]);}
	}

}
