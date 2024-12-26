package com.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StudentMain {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student(5, "Edward", "S005", 3300.10));
		list.add(new Student(6, "Fiona", "S006", 3100.25));
		list.add(new Student(3, "Charlie", "S003", 2800.00));
		list.add(new Student(4, "Diana", "S004", 3500.20));
		list.add(new Student(8, "Hannah", "S008", 2900.65));
		list.add(new Student(9, "Ivan", "S009", 3600.00));
		list.add(new Student(10, "Jenny", "S010", 3000.00));
		list.add(new Student(7, "George", "S007", 3400.80));
		list.add(new Student(1, "Alice", "S001", 3000.50));
		list.add(new Student(2, "Bob", "S002", 3200.75));

//		System.out.println("all Students...");
//		for (Student s : list) {
//			System.out.println(s.toString());
//		}

//		System.out.println("Normal Sort ID...");
//		list.sort((a,b) ->Integer.compare(a.getId(), b.getId()));
//		list.forEach(System.out::println); 

//		System.out.println("Using Stream Sort ID...");
//		list.stream().sorted(Comparator.comparing(Student::getId))//.sorted(Comparator.comparing(Student::getFee))
//		.forEach(System.out::println);

//		System.out.println("Using index/ID...");
//		int index=5;//
//		list.stream().filter(i->i.getId()==index)
//		.forEach(System.out::println);

//		System.out.println("remove using Index...");
//		int index = 5;// using index
//		System.out.println(list.remove(index));

		
//		System.out.println("remove using ID...");
//		int ID = 5;// using ID
//		Optional<Student> s = 
//				list.stream().filter(i -> i.getId() == ID)
//				.findFirst();
//		
//		Student ss = s.get();  //we also check s.isPresent() else id not found 
//		System.out.println(list.remove(ss));

		
		System.out.println("Update Using id...");
		int ID=5;
		Student newstd=new Student(15, "New", "S0050", 7300.80);
		Optional<Student>std=list.stream()
				.filter(i->i.getId()==ID)
				.findFirst();
		if(std.isPresent()) {
			Student s=std.get();
			s.setId(newstd.getId());
			s.setName(newstd.getName());
			s.setNo(newstd.getNo());
			s.setFee(newstd.getFee());
			System.out.println("All data change Successfuly ...");
			list.forEach(System.out::println)
			;
		}
		else {
			System.out.println("ID Not Found...");
		}
		
		
	}

}
