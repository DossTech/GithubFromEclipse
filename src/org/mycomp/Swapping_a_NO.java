package org.mycomp;

import java.util.Scanner;

public class Swapping_a_NO {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Please enter value for a : ");
	int n1 = s.nextInt();
	System.out.println("Please enter value for b : ");
	int n2 = s.nextInt();
	
	int n3 = 0;
	
	n3 = n1+n2;
	n1=n3-n1;
	n2=n3-n1;
	System.out.println("Value for a : "+n1);
	
	System.out.println("Value for b : "+n2);
}
}
