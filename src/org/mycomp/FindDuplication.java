package org.mycomp;

public class FindDuplication {

	public static void main(String[] args) {
		String s1 = "Java Selenium";
		
		char[] c = s1.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = i+1; j < c.length; j++) {
				
				if (c[i]==c[j]) {
					
					System.out.println(c[j]);
					
				}
				
				
				
			}
			
			
			
		}
	}}
