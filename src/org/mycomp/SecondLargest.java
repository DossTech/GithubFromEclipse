package org.mycomp;

public class SecondLargest {

	public static void main(String[] args) {
		
		int a[] = {2,4,6,8,1};
		int b ;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i]>a[j]) {
				b=a[i];
				a[i]=a[j];
				a[j]=b;
				
				}}}
				
		
			System.out.println(a[a.length-2]);
		
		
		
		}
		
		
	}

