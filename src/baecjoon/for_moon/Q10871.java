package baecjoon.for_moon;

import java.util.Scanner;

public class Q10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 수열을 이루는 정수의 갯수
		int a[] = new int[n];
		int x = sc.nextInt();
		// x보다 작은수를 입력받은 순서대로 공백으로 구분해 출력

		if (n >= 1 && n <= 10000 && x >= 1 && x <= 10000) {
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				if (a[i] < x) {
					System.out.printf("%d ", a[i]);
				}
			}
		}
		sc.close();
	}
}
