package baecjoon.array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Q4344 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int c = sc.nextInt(); // 테스트 케이스 개수
		
		for (int i = 0; i < c; i++) {
			int n = sc.nextInt(); // 각 테스트 케이스 학생수
			int scores[] = new int[n]; // 학생 점수를 담을 배열 선언
			if (n >= 1 && n <= 1000) { // 학생 수 제한
				for (int studentCount = 0; studentCount < n; studentCount++) {
					int score = sc.nextInt();
					if (score >= 0 && score <= 100) { // 점수 범위 설정
						scores[studentCount] = score;
					}
				} // 배열안에 점수 배정
			}
			// 평균 구하기
			double average = Arrays.stream(scores).average().getAsDouble();
			int overAverageCount = 0; // 평균을 넘는 점수 count
			for (int j = 0; j < n; j++) {
				if (scores[j] > average) {
					overAverageCount++;
				}
			}
			double result = (double) overAverageCount / n * 100;
			bw.write(String.format("%1.3f", result) + "%\n");
		}
		bw.flush();
		bw.close();
		sc.close();
	}

}
