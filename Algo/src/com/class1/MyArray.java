package com.class1;

public class MyArray {
	//array default initilize is null
	private long[] arr;
	//the other is 0
	private int index;
	
	public MyArray()
	{
		arr=new long[50];
	}
	
	public MyArray(int maxsize)
	{
		arr=new long[maxsize];
	}
	
	public void insert(long value)
	{
		arr[index]=value;
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
