package baecjoon.for_moon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q15552 {
// TODO: 여기 다시하기
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		int count = Integer.parseInt(num);

		StringTokenizer st = new StringTokenizer(num);

		int[] a = new int[count];
		int[] b = new int[count];
		int[] result = new int[count];


		if (count <= 1000000 && br.read() <= 1000 && br.read() >= 1) {
			for (int i = 0; i < count; i++) {
				a[i] = br.read();
				b[i] = br.read();
			}
		}

	}

}
