package baecjoon.array;

import java.util.Scanner;

public class Q2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[9];
		int max = 0;
		int n = 0; // 배열 몇번째 수인지
		for (int i = 0; i < 9; i++) {
			int num = sc.nextInt();

			if (num < 100 && num >= 0) {
				nums[i] = num;
				if (max < nums[i]) {
					max = nums[i];
					n = i + 1;
				}
			}
		}
		System.out.println(max);
		System.out.println(n);
		sc.close();
	}
}
