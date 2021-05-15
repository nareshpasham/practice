package com.practice.java8features.lamdaexpressions;

@FunctionalInterface
interface Interf {
	public void m1(int a, int b);
}

public class lamda00 {

	public static void main(String[] args) {
		Interf d = (a, b) -> System.out.println(a + b);
		d.m1(10, 20);
		d.m1(100, 120);

	}

}
