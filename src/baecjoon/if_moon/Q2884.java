package baecjoon.if_moon;

import java.util.Scanner;

public class Q2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if (h >= 0 && h <= 23 && m >= 0 && m <= 59) {
			if ( m < 45) {
				m = 60 - 45 + m;
				h = h - 1;
				if (h < 0) {
					h = 23;
				} 
				System.out.println(h);
				System.out.println(m);
			} else {
				m = m - 45;
				System.out.println(h);
				System.out.println(m);
			}
		}
		
	}

}
