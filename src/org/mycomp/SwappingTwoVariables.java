package org.mycomp;

import java.util.Scanner;

public class SwappingTwoVariables {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter value for a no: ");
		int n1 = s.nextInt();
		System.out.println("Please enter value for b no: ");
		int n2 = s.nextInt();
		
		int c = 0;
		
		c= n1;
		n1=n2;
		n2=c;
		System.out.println("Value for a no: "+n1);

		System.out.println("Value for b no: "+n2);
		
	}
}
