package baecjoon;

import java.util.Scanner;

public class Main { // 입출력과 사칙연산

	public static void main(String[] args) {
//		ex1000();
//		ex1001();
		ex2588();
	}
	
//	public static void ex1000() {
//		Scanner sc = new Scanner(System.in);
//		int inputNum1 = sc.nextInt();
//		int inputNum2 = sc.nextInt();
//		System.out.println(inputNum1+inputNum2);
//		
//	}
	
//	public static void ex1001() {
//		Scanner sc = new Scanner(System.in);
//		int inputNum1 = sc.nextInt();
//		int inputNum2 = sc.nextInt();
//		System.out.println(inputNum1-inputNum2);
//		
//	}

	
	public static void ex2588() {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		String num2 = sc.next();
		int result = num1 * Integer.parseInt(num2); // String을 int로 형변환
//		Integer.parseInt(num2); > String을 int로 형변환
		char[] num2char = new char[3]; // 문자열인 숫자를 따로담을 char배열 생성
		for (int i = 0; i < num2.length(); i++) { // 할당
			num2char[i] = num2.charAt(i);
		}
	
		
		// char타입을 int 타입으로 변환(예시)
//		char c1 = '9';
//		Character.getNumericValue(c1) // 9 
		
		System.out.println(num1 * Character.getNumericValue(num2char[2])); 
		System.out.println(num1 * Character.getNumericValue(num2char[1]));
		System.out.println(num1 * Character.getNumericValue(num2char[0]));
		System.out.println(result);
		
	}
	
	
}
