package com.class1;

public class OrderArray {
	//array default initilize is null
	private long[] arr;
	//the other is 0
	private int index;
	
	public OrderArray()
	{
		arr=new long[50];
	}
	
	public OrderArray(int maxsize)
	{
		arr=new long[maxsize];
	}
	
	public void insert(long value)
	{
		int i;
		
			for(i=0;i<index;i++)
			{
				if(arr[i]>value)
				{
					break;
				}
			}
		
		
		for(int j = index; j>i;j--)
		{
			arr[j]=arr[j-1];
		}
		
		arr[i]=value;
		index++;
	}
	
	public void diplay()
	{
		System.out.print("[");
		for(int i=0; i < index; i++)
		{
			System.out.print(arr[i] + ",");
		}
		System.out.println("]");

	}
	
	public int search(long value)
	{
		int i;
		for(i =0; i<index;i++)
		{
			if(value == arr[i])
			{
				break;
			}
			
		}
		
		if(i<index)
		{
			return i;
		}
		else
		{
			return -1;
		}
		
	}
	
	
	
	public int binarySearch(long value)
	{
		int middle = 0;
		int low = 0;
		int up = index;
		
		while(true)
		{
			middle=(low + up)/2;
			if(arr[middle]==value) {
				return middle;
			}else if(low > up) {
				return -1;
			}else {
				if(arr[middle]>value) {
					up = middle -1;
				}
				else {
					low = middle+1;
				}
			}
			
		}
		
	}
	
	public long getValue(int ind)
	{
		if(ind>=index || ind<0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		{
			return arr[ind];
		}
		
	}
	
	
	public void delect(int ind)
	{
		if(ind>=index || ind<0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		{
			for(int i = ind; i<index;i++)
			{
				arr[i]=arr[i + 1];
			}
			index--;
		}
	}
	
	public void modify(int ind, long newvalue)
	{
		if(ind>=index || ind<0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		{
			arr[ind]= newvalue;
		}
	}
	
}
