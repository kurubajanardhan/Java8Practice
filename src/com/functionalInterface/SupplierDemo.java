package com.functionalInterface;

import java.util.function.Supplier;

//public class SupplierDemo implements Supplier<Integer>{
//
//	@Override
//	public Integer get() {
//		
//		return 6;
//	}
//	
//	public static void main(String[] args) {
//		
//		Supplier<Integer> supplier = new SupplierDemo();
//		System.out.println(supplier.get());
//	}
//}


public class SupplierDemo{

	
	public static void main(String[] args) {
		
		Supplier<Integer> supplier = () -> 6;
		Supplier<String> supplier1 = () -> "Jana";
				
		System.out.println(supplier.get());
		System.out.println(supplier1.get());
	}
}
