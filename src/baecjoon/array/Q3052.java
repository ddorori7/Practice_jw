package baecjoon.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q3052 {

	public static void main(String[] args) {
		// TODO
		Scanner sc = new Scanner(System.in);
		int[] remains = new int[10];

		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			if (num <= 1000 && num >= 0) {
				remains[i] = num % 42;
			}
		}
		int[] resultRemains = Arrays.stream(remains).distinct().toArray();
		System.out.println(resultRemains.length);
		sc.close();
	}
}
