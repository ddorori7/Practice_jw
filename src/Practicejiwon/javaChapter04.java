package Practicejiwon;

import java.util.Scanner;

public class javaChapter04 {

	public static void main(String[] args) {
//		ex3();
//		ex4();
//		ex5();
//		ex6();
		ex7();
	}
	
	private static void ex7() {
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			
			System.out.println("------------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			int num = scanner.nextInt();
			int input;
			
			if (num == 1) {
				System.out.print("예금액>");
				input = scanner.nextInt();
				balance += input;
			}
			if (num == 2) {
				System.out.print("출금액>");
				input = scanner.nextInt();
				balance -= input;
			}
			if (num == 3) {
				System.out.println("잔고>" + balance);
			}
			if (num == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
	
	private static void ex6() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	private static void ex5() {
		
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4*x + 5*y == 60) {
					System.out.printf("(%d, %d)%n", x, y);
				}
			}
		}
		
	}
	
	
	private static void ex4() {
		
		int num1 = 0, num2 = 0;
		
		while (num1 + num2 != 5) {
			num1 = (int)(Math.random()*6) + 1;
			num2 = (int)(Math.random()*6) + 1;
			System.out.printf("(%d, %d)%n",num1,num2);
		}
		
	}
	
	private static void ex3() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합: " + sum);
	}

	
}
