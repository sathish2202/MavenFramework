package org.pattern;

public class Pattern2 {
	public void empId() {
		System.out.println("2217");
	}

	public static void main(String[] args) {
		int rows = 5;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
