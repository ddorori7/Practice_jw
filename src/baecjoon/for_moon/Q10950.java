package baecjoon.for_moon;

import java.util.Scanner;

public class Q10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] a = new int[count];
		int[] b = new int[count];
		for (int i = 0; i < count; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < count; i++) {
			System.out.println(a[i] + b[i]);
		}
	}
}
