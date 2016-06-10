package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testMethodPassing {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(1);
		list.add(6);
		
		Collections.sort(list, (a,b)-> {
		System.out.println(a);
		System.out.println(b);
		return a.compareTo(b);
		});
		
		list.forEach(System.out::println);
		printing p = a -> Integer.parseInt(a);
		addHello(p);
		p.print1("Pallavi");
	}
	

	private static void addHello(printing p) {
		System.out.println("hello " + p.print("5"));
	}


	interface printing {
		int print(String a);
		default void print1(String a) {
			System.out.println(a);
		}
	}
	
	
	
	
}
