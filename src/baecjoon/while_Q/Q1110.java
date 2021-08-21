package baecjoon.while_Q;

import java.util.Scanner;

public class Q1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int num = sc.nextInt();
		int result = 0;
		int count = 0;
		if (num < 10) {
			result = num * 11;
			count++;
		} else {
			result = (num % 10) * 10 + (num / 10 + num % 10) % 10;
			count++;
		}
		while (num - result != 0) {
			result = (result % 10) * 10 + (result / 10 + result % 10) % 10;
			count++;
		}
		System.out.println(count);
		sc.close();
	}
}
