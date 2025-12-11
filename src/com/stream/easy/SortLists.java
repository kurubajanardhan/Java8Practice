package com.stream.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortLists {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(23,6,2,3,4,6,7,1,9,74,42,2);
		
		System.out.println("======Ascending Order======");
		List<Integer> result = numbers.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(result);
		
		System.out.println("======Descending Order======");
		List<Integer> result2 = numbers.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
		System.out.println(result2);

	}

}
