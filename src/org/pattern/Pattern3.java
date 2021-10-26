package org.pattern;

public class Pattern3 {
	public static void main(String[] args) {
		int rows = 5;
		for (int i = 0; i <= 5  ; i++) {
			for (int j = 5-1 ; j > i; j--) {
				System.out.print(" ");
			}
			for (int s = 0; s <= i ; s++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
