package com.java.add;

public class NestedLoop {
	public static void main(String args[]) {
		int a = 3;
		int b  = 7;
		//outer loop
		for (int i = 1;i <= a;++i) {
			System.out.println("a:"+ i);
			//inner loop
			for (int j = 1;j <= b;++j) {
				System.out.println("b:"+j);
				
			}
		}
	}
}
	


