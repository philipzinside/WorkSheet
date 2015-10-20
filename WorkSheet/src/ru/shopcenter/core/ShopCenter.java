package ru.shopcenter.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class ShopCenter {
	public static void main(String[] args) {	
		ShopCenter sc = new ShopCenter();
		
		Random rand = new Random();
		int sc1 = 1;
		System.out.println("create shop center. total shop center: " + sc1);
		
		long i = 2_000_000_000;
		long j = 10_000_000_000L;
		long k = j++ + ++i;
		k /= i;
	
		ArrayList<Integer> floor = new ArrayList<Integer>();
		
			for(int i = 0; i < 4; i++) { 
				
				//return floor.size();
				System.out.println("with: " + floor.get(rand.nextInt(floor.size())) + " floors");
				//floor.length
				
			}
		// надо запомнить куда-то этажи (N)
		// создать боксы на каждом этаже
		// сообщить сколько боксов всего на каждом этаже
		// сообщить каких боксов на каждом N этаже
			
	
			
	}
}