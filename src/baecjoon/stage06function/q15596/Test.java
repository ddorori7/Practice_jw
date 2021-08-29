package baecjoon.stage06function.q15596;

import java.util.Arrays;

public class Test {

	long sum(int[] a) {
		long sum = 0;
		if (a.length >= 1 && a.length <= 3000000 && Arrays.stream(a).max().getAsInt() <= 1000000
				&& Arrays.stream(a).min().getAsInt() >= 0) {
			for (int i = 0; i < a.length; i++) {
				sum += a[i];
			}
		}
		return sum;
	}
}
