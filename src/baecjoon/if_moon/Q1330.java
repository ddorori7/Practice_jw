package baecjoon.if_moon;

import java.util.Scanner;

public class Q1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(">");
		} else if(num2 > num1) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}

	}

}
