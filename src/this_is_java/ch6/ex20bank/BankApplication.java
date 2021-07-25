package this_is_java.ch6.ex20bank;

import java.util.*;

public class BankApplication {
	
	private static Account[] accountArray = new Account[100]; // 배열 참조 변수 객체 생성..?
	private static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");	
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
		
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
		
		// 계좌생성하기
		private static void createAccount() {
			
			//TODO: 풀어보기 꼭!! 20번 문제 챕터6
//			Account account = new Account(null, null, 0);
//			int i = 0;
//				
//			System.out.println("-------------");
//			System.out.println("계좌생성");	
//			System.out.println("--------------");
//		
//		
//			System.out.print("계좌번호: ");
//			accountArray[i].setAno(scanner.next());
//			
//			System.out.print("계좌주: ");
//			accountArray[i].setOwner(scanner.next());
//			
//			System.out.print("초기입금액: ");
//			accountArray[i].setBalance(scanner.nextInt());
//			
//			accountArray[i] = new Account(
//					accountArray[i].getAno(), accountArray[i].getOwner(), accountArray[i].getBalance());
//			
//			System.out.println(accountArray[i]);
//			System.out.println("결과: 계좌가 생성되었습니다.");
//			
//			i++;
			
		}
	
			
		
		
		// 계좌목록보기
		private static void accountList() {
			System.out.println("-------------");
			System.out.println("계좌목록");	
			System.out.println("--------------");
			
			for (int i = 0; i < accountArray.length; i++) {
				
			System.out.println(accountArray[i]);
			}
			
			
		
			
		}
		
		// 예금하기
		private static void deposit() {
			
		}
		
		// 출금하기
		private static void withdraw() {
			
		}
		
		// Account 배열에서 ano와 동일한 Account 객체 찾기
		private static Account findAccount(String ano) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
