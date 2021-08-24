package baecjoon.array;

import java.util.Scanner;

public class Q2577 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a >= 100 && a < 1000 && b >= 100 && b < 1000 && c >= 100 && c < 1000) {
			int result = a * b * c;
			String[] resultNums = Integer.toString(result).split("(?!^)");
			int[] nums = new int[resultNums.length];
			for (int i = 0; i <= 9; i++) {
				int count = 0;
				for (int j = 0; j < nums.length; j++) {
					nums[j] = Integer.parseInt(resultNums[j]);
					if (nums[j] == i) {
						count++;
					}
				}
				System.out.println(count);
			}
			sc.close();
		}
	}
}
