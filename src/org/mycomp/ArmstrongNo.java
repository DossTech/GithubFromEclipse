package org.mycomp;

public class ArmstrongNo {
public static void main(String[] args) {
	
	int n1 = 152;
	int n4 = 152;
	int  n2,n3=0;
	
	
	while (n1>0) {
		
		n2 = n1%10;
		n3 = n3 + (n2*n2*n2);
		n1 = n1/10;
	}
	if (n3==n4) {
		System.out.println("ArmStrong");
	} else {
		System.out.println("Not ArmStrong");
	}
}
}
