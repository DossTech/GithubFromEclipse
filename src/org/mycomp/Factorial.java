package org.mycomp;

import java.util.Scanner;

public class Factorial {

	private void method1(int no) {
		int n1=1;
		for (int i = no; i >0; i--) {
			
			n1 = n1*i;
			
		}
System.out.println("The Factorial of  "+ no + " : "+ n1);
	}
	
	public static void main(String[] args) {
		
		Factorial f = new Factorial();
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a no: ");
		int no = s.nextInt();
		f.method1(no);
		
	}
}
