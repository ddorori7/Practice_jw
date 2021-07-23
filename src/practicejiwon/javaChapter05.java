package practicejiwon;

import java.util.Scanner;

public class javaChapter05 {

	public static void main(String[] args) {
//		ex7();
//		ex8();
		ex9();

	}
	
	private static void ex9() {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				 for (int i = 0; i < scores.length; i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = scanner.nextInt();
				 }
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores["+i+"]> " + scores[i]);
				}
			} else if (selectNo == 4) {
				double avg;
				int max = scores[0];
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					if (scores[i] > max) { // 최고점수
						max = scores[i];
					}
				}
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				avg = (double)sum / scores.length;
				
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if (selectNo == 5) {
				run = false;
			}
			
		}
		
		System.out.println("프로그램 종료");
		
		scanner.close();
		
	}
	
	
	private static void ex8() {
		
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		double count = 0;
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				sum = sum + array[row][col];
				count++;
			}
			avg = sum / count ;
		}
		
		System.out.println("sum: " +sum);
		System.out.println("avg: " + avg);
		
	}
	
	
	
	private static void ex7() {
		
		int max = 0;
		int[] array = {1,5,3,8,2};
		max = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) 
				max = array[i];
		}
		
		System.out.println("max: " + max);
	}
	

	
}
