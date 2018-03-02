package com.class8;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		long[] arr1 = new long[] {3,6,8,13,56,-2,7};
		for(long x : arr1)
		{
			System.out.print(x + " ");
			
		}
		System.out.println();
		ShellSort ss = new ShellSort();
		ss.sort(arr1);
		
		for(long x : arr1)
		{
			System.out.print(x + " ");
		}
	}

}
