package com.java.add;

public class WhileLoops {
	public static void main (String args[]) {
		//static variable creation
		int a = 10;
		int b = 15;
		show(a,b);//static method calling
	
	}
			private static void show(int a,int b) {
				while (a <= b) {
		
				System.out.println("Dad");
					a++;
				}
				
		
				System.out.println("Statement excuted");
	
			while(a>=b) {
				System.out.println("Mom");
				a--;
			}
			}
}

