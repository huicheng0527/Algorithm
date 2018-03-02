package com.class2;

public class InsertSort {
	
	public static void sort(long[] arr) {
		
		long temp=0;
		int pin = 0;
		for(int i=1; i<arr.length;i++) {
			temp=arr[i];
			pin = i;
			for(int j=i-1;j>=0;j--) {
				if(arr[j]>temp) {
					arr[j+1]=arr[j];
					pin=j;
				}
			}
			arr[pin]=temp;
		}
		
	
//		for(int i=1; i<arr.length;i++) {
//			temp = arr[i];
//			int j =i;
//			while(j>0 && arr[j]>=temp)
//			{
//				arr[j]=arr[j-1];
//				j--;
//			}
//			arr[j]=temp;
//		}
		
	}
	
}
