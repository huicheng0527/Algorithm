package com.class8;

public class ShellSort {
	
	public static void sort(long[] arr) {
		
		int h=1;
		//find the max h
		while(h<arr.length/3) {
			h = h*3+1;
		}
		
		while(h>0) {
			
			System.out.println("enter loop");
			long temp=0;
			int pin = 0;
			for(int i=h; i<arr.length;i++) {
				temp=arr[i];
				pin = i;
				for(int j=i-h;j>=0;j=j-h) {
					if(arr[j]>temp) {
						arr[j+h]=arr[j];
						pin=j;
					}
				}
				arr[pin]=temp;
			}
			
			h=(h-1)/3;
		}
	}
		
	
}
