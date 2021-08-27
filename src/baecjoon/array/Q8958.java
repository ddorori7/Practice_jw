package baecjoon.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q8958 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) { // 테스트 케이스 갯수만큼 문자열 값 받기
			int score = 0;
			String oxStr = br.readLine();
			String ox[] = oxStr.split("(?!^)");
			if (oxStr.length() > 0 && oxStr.length() < 80 
					&& oxStr.matches("^[O|X]*$")) {
				int plus = 1;
				for (int j = 0; j < ox.length; j++) {
					if (ox[j].equals("O")) {
						score += plus;
						plus++;
					} else {
						plus = 1;
					}
				}
				bw.write(Integer.toString(score) + "\n");
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
