package com.class2;

public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr = new long[] {1211,292,533,144,200,35,87};
		for(long x : arr)
		{
			System.out.print(x + " ");
		}
		System.out.println();
		
		
//		BubbleSort bs = new BubbleSort();
//		bs.sort(arr);
//		SelectionSort ss = new SelectionSort();
//		ss.sort(arr);
		long[] arr1 = new long[] {3,6,8,13,56,-2,7};
		for(long x : arr1)
		{
			System.out.print(x + " ");
			
		}
		System.out.println();
		InsertSort is = new InsertSort();
		is.sort(arr1);
		
		for(long x : arr1)
		{
			System.out.print(x + " ");
		}
		
		
		
	}

}
