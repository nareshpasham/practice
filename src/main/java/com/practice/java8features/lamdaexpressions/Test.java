package com.practice.java8features.lamdaexpressions;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5,6,8,12);
		IntSummaryStatistics stats = numbers.stream().mapToInt(n->n).summaryStatistics();
		List list=numbers.stream().filter(n-> n%2==0).collect(Collectors.toList());
		System.out.println(list);
		System.out.println("Lowest number in List : " + stats.getMax());

	}

}
