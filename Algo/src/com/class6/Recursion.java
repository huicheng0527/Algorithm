package com.class6;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(test1(4));
		System.out.println(Fibon(20));
	}
	
	public static void test(int n) {
		System.out.println("hello world " +n+ " times");
		if(n==10)return;
		test(n+1);
	}
	
	public static int test1(int n) {
		if(n==1)return 1;
		else return n+test1(n-1);
		
	}
	
	
	public static int Fibon(int n) {
		if(n==1)return 0;
		else if(n==2)return 1;
		else return Fibon(n-1)+Fibon(n-2);
		
	}
}	
