package com.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArraySortBySum {

	public static void main(String[] args) {

		int[] arr = { 23, 45, 56, 90 };
		int a ;
		int b ;

		Map<Integer, Integer>map=new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			a = arr[i] / 10;
			b = (arr[i])%10;
			System.out.println(a+" " +b);
           map.put(i, (a+b));
		   list.add((a + b));
		}
		list.sort((i,j)->i.compareTo(j));
		System.out.print(list);
		System.out.println();
		map.values().stream().sorted().forEach(i->System.out.print(i+" "));
	}

}
