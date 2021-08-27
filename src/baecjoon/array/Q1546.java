package baecjoon.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 테스트 케이스 갯수
		if (n <= 1000) {
			int scores[] = new int[n];
			double resultScore = 0;
			for (int i = 0; i < n; i++) { // 배열값 받아서 생성
				scores[i] = sc.nextInt();
			}
			int max = Arrays.stream(scores).max().getAsInt();
			int min = Arrays.stream(scores).min().getAsInt();

			if (max <= 100 && max != 0 && min >= 0) {
				resultScore = Arrays.stream(scores).average().getAsDouble() / max * 100;
			}
			System.out.println(resultScore);
			sc.close();
		}
	}
}
