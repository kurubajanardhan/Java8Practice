package com.functionalInterface;

import java.util.function.Function;

//public class FunctionDemo implements Function<Integer, String>{
//
//	@Override
//	public String apply(Integer t) {
//		
//		return "Hi Janardhan";
//	}
//	
//	 public static void main(String[] args) {
//		
//		 Function<Integer, String> function = new FunctionDemo();
//		 System.out.println(function.apply(3));
//	}
//
//}


public class FunctionDemo{

	 public static void main(String[] args) {
		
		 Function<Integer, String> function = t -> "Hi Janardhan";
		 System.out.println(function.apply(3));
		 
		 Function<String, String> function1 = t -> "Hi Janardhan, How are you";
		 System.out.println(function1.apply("Hello"));
	}

}