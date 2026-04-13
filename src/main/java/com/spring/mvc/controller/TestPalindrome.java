package com.spring.mvc.controller;

public class TestPalindrome {

	public static void main(String[] args) {
		
		
		String s="Was it a car or a cat I saw?";
		
		
		StringBuilder newStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }
		
         newStr.toString().equals(newStr.reverse().toString());
		
		
		s.replace(" ", "");
		
		StringBuffer ba= new StringBuffer(s);
        ba.reverse().toString();
        
        System.out.println(ba);
		

	}

}
