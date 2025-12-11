package com.functionalInterface;

import java.util.function.Consumer;

//public class ConsumerDemo implements Consumer<Integer>{
//
//	@Override
//	public void accept(Integer t) {
//		
//		System.out.println("Print :"+ t);
//		
//	}
//	
//	public static void main(String[] args) {
//		
//		Consumer<Integer> consumerDemo =  new ConsumerDemo();
//		consumerDemo.accept(10);
//	}
//
//}

public class ConsumerDemo{
	
	public static void main(String[] args) {
		
		Consumer<Integer> consumer = t -> System.out.println("Print :"+t);
		consumer.accept(20);
		
	}

}
