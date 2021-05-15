package com.practice.java8features.predicate;

public class UniqueName {
    public static String firstUniqueName(String[] names) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
    	for (int i=0;i<names.length-1;i++) {
    		for (int j=i+1;j<names.length-1;j++) {
    			if(!names[i].equals(names[j])) {
    				System.out.println("------------"+names[i]);
    				
    			}
    		
    		}
		}
    	return "";
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueName(new String[] { "Abbi", "Adeline", "Abbi", "Adalia" }));
    }
}
