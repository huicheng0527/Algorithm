package com.class2;

public class SelectionSort {
	
	public static void sort(long[] arr) {
		int min =0;
		long temp=0;
		for(int i = 0; i<arr.length-1;i++)
		{
			min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
				
			}
			
			temp=arr[i];
			arr[i] = arr[min];
			arr[min] =temp;
			
			for(long x : arr)
			{
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
		
		}
	
}
