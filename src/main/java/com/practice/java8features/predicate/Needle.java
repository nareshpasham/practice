package com.practice.java8features.predicate;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;




public class Needle {
    public static int count(String needle, InputStream haystack) throws Exception {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
    	 String str = new String(haystack.readAllBytes(), StandardCharsets.UTF_8);
         String a[] = str.replace("."," ").split(" ");
      
         int count = 1;
         for (int i = 0; i < a.length; i++)
         {
        	//System.out.println(a[i].substring(0,a[i].l )); needle.equals(a[i])
         if (needle.equals(a[i]) )
             count++;
         }
      
         return count;
        
    }
    
    public static void main(String[] args) throws Exception {
        String inMessage = "Hello, there!\nHow are you today?\nYes, you over there.there there there";

        try(InputStream inStream = new ByteArrayInputStream(inMessage.getBytes())) {
            System.out.println(Needle.count("there", inStream));
        }
    }
}
