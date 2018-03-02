package com.class7;

public class HanoiTower {
	
	public static void main(String[] args) {
		
		doTower(3, 'a', 'b', 'c');
		
	}
	
	public static void doTower(int topN, char from, char inter, char to) {
		if(topN==1) {
			System.out.println("palte 1, from " + from + " tower " + to + " tower ");
		}else {
			doTower(topN-1,from,to,inter);
			System.out.println("plate " + topN + ", from "+from+" tower "+to+" tower ");
			doTower(topN-1,inter,from,to);
		}
	}
}
