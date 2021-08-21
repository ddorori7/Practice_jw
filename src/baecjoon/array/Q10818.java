package baecjoon.array;

import java.util.Scanner;

public class Q10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] ns = new int[n];

		if (n >= 1 && n <= 1000000) {
			int min=1000000;
			int max=-1000000;
			for (int i = 0; i < n; i++) {
				int num = sc.nextInt();
				if (num >= -1000000 && num <= 1000000) {
					ns[i] = num;
					if (ns[i] > max) {
						max = ns[i];
					} 
					if (ns[i] < min) {
						min = ns[i];
					}
				}
			}
			System.out.printf("%d %d", min, max);
		}
		sc.close();
	}
}
