package com.class9;

public class QuickSort {
	
	public static void partition(long[] arr, int left, int right, int point) {
		int leftPtr=left-1;
		int rightPtr=right+1;
		while(true) {
			
			while(leftPtr<rightPtr && arr[++leftPtr]<point);
		}
		
	}
}
