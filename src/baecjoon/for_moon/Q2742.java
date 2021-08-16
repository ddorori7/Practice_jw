package baecjoon.for_moon;

import java.util.Scanner;

public class Q2742 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ns[] = new int[n];
		if (n <= 100000) {
			for (int i = n; i >= 1; i--) {
				ns[i-1] = i;
				System.out.println(ns[i-1]);
			}
		}
		sc.close();
	}
}
