package com.stream.supereasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("jana","mahe");
		//1.List to Stream
		Stream<String> stream = names.stream();
		
		String[] arr = {"jana","mahe"};
		//2.Array -> stream
		Stream<String> stream2 = Arrays.stream(arr);
		
		//3.Stream of
		Stream<Integer> intStream = Stream.of(1,2,3);
		
		//4.Stream generator
		Stream<Double> doubleStream = Stream.generate(Math::random).limit(5);
	}

}
