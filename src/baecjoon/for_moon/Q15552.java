package baecjoon.for_moon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q15552 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		// BufferedReader는 enter만 경계로 인식하고 
		// 데이터가 String으로 고정되기 때문에 int로 형변환을 시켜줌.
		
		if (t <= 1000000) { // 테스트 케이스 갯수 제한
			for (int i = 0; i < t; i++) { // 입력받은 테스트 케이스 만큼 반복
				String nums = br.readLine(); // br은 enter경계, 한라인을 받음
				StringTokenizer st = new StringTokenizer(nums, " "); 
				// StringTokenizer를 사용하여 공백 단위로 받은 한라인의 문자열을 분리시킴
				
				// 계산을 위해 int로 변수를 선언하고 나누어진 문자열을 int로 형변환해서 하나씩 배정
				int a = Integer.parseInt(st.nextToken()); 
				int b = Integer.parseInt(st.nextToken());
				
				if (a >= 1 && a <= 1000 && b >= 1 && b <= 1000) { // 입력숫자 크기 제한
					String result = String.valueOf(a+b); 
					// 더해서 다시 출력을 위해 문자형으로 변환
					bw.write(result + "\n"); // 개행을 추가해 보기화면과 같이 출력
				}
			}
			bw.flush(); // 값 내보내기
			
			// 입출력 스트림 닫기
			bw.close(); 
			br.close();
		}
	}
}
