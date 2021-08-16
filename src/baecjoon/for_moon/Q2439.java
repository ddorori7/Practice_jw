package baecjoon.for_moon;

import java.util.Scanner;

public class Q2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n >= 1 && n <= 100) {
			for (int i = 0; i < n; i++) {

				for (int j = 1; j < n - i; j++) {
					System.out.print(" ");
				}
				for (int a = 0; a <= i; a++) {
					System.out.print("*");
				}

//				for (int j = 1; j <= n; j++) {
//					if(j < n - i) {
//						System.out.print(" ");
//					} else {
//						System.out.print("*");
//					}
//				}

				System.out.println();
			}
		}
		sc.close();
	}
}
