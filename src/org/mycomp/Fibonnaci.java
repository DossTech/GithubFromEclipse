package org.mycomp;

import java.util.Scanner;

//1 1 2 3 5 8 13
public class Fibonnaci {

	public static void main(String[] args) {
			int a = 0;
			int b = 1;
		    int c = 0;
			int count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a no: ");
		int no = s.nextInt();
		
		for (int i = 0; i <no; i++) {
			System.out.println(a+" ");
			c = a +b;
			a = b;
			b = c;
			count++;
		}
		
		System.out.println("The count: "+count);
		
		
		
	}
}
