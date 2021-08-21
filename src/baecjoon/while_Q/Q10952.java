package baecjoon.while_Q;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10952 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b;

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		do {
			a = sc.nextInt();
			b = sc.nextInt();

			if (a > 0 && b < 10) {
				numbers.add(a + b);
			}
		} while (!(a == 0 && b == 0));

		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		sc.close();
	}
}
