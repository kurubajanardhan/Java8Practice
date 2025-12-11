package com.functionalInterface;

import java.util.function.Predicate;

//public class PredicateDemo implements Predicate<Integer>{
//	
//	@Override
//	public boolean test(Integer t) {
//		
//		return t%2 == 0;
//	}
//
//	public static void main(String[] args) {
//		
//		Predicate<Integer> predicate = new PredicateDemo();
//		System.out.println(predicate.test(7));
//
//	}
//
//}

public class PredicateDemo{
	
	public static void main(String[] args) {
		
		Predicate<Integer> predicate = t -> t%2 == 0;
		System.out.println(predicate.test(7));

	}

}
