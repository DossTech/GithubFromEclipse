package org.mycomp;
//#1) Write a Java Program to reverse a string without using String inbuilt function.
public class TingReverse {
	String s1 = "TestLeaf";
	
	public void method1() {
		System.out.println("Before Reversing: "+s1);
		System.out.print("After Reversing: "+" ");
		for (int i = s1.length()-1; i >=0; i--) {
			
			char c = s1.charAt(i);
			System.out.print(c);
		}
	}	
		public void method2() {
			System.out.println();
				System.out.println("Before Reversing: "+s1);
			System.out.print("After Reversing: "+" ");
			char[] ca = s1.toCharArray();
			
			for (int i = ca.length-1; i >=0; i--) {
				char c = ca[i];
				System.out.print(c);
			}
			
		}
		
		public void method3() {
			System.out.println();
			System.out.println("Before Reversing: "+s1);
			System.out.print("After Reversing: "+" ");
			String[] sp = s1.split("");
			
			for (int i = sp.length-1; i>=0; i--) {
				String s = sp[i];
				System.out.print(s);
			}

		}
		
		public static void main(String[] args) {
			TingReverse m1 = new TingReverse();
			m1.method1();
			m1.method2();
			m1.method3();
		}
		
	}

