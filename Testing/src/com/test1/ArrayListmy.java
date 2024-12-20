package com.test1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListmy {

	public static void main(String[] args) {
		
		
		List<Integer>list=new ArrayList<>();
		list.add(50);
		list.add(80);
		list.add(40);
		list.add(60);

//		List<Integer>listSort=list.stream()
//		     .sorted((a,b)->a.compareTo(b))
//		     .collect(Collectors.toList());
		list.sort((a,b)->a.compareTo(b));
		System.out.println(list.toString());
//		System.out.println(listSort.toString());
		
	}
}
