package baecjoon.for_moon;

import java.util.Scanner;

public class Q11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int add[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			if (a[i] > 0 && b[i] < 10) {
				add[i] = a[i] + b[i];
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.printf("Case #%d: %d + %d = %d%n", (i + 1), a[i], b[i], add[i]);
		}
		sc.close();
	}
}
