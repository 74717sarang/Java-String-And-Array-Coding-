package tric;

import java.util.stream.Stream;

public class Stream_para {

	
	
	public static void main(String[] args) {
		
		String[] s= {"i","want", "data", "a10"};
		
//       Stream.of(s).forEach(i->System.out.println(i));
       Stream.of(s).forEach(System.out::println);   //only println not()

       System.out.println(); 
       
       Stream.of(s).map(String::length).forEach(System.out::println);	
	
       System.out.println("After sort");
	   Stream.of(s).sorted().forEach(System.out::println);
	   
	   
	   
	   
	}
}
