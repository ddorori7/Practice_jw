		package this_is_java.ch6.ex20bank;

import java.util.*;

public class BankApplication02 {
	
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
			
			
			
			System.out.println("-------------");
			System.out.println("계좌생성");	
			System.out.println("-------------");
		
		
			System.out.print("계좌번호: ");
			String ano = scanner.next();
			
			System.out.print("계좌주: ");
			String owner = scanner.next();
			
			System.out.print("초기입금액: ");
			int balance = scanner.nextInt();
			
			Account newAccount =  new Account(ano, owner, balance);
			
			for (int i = 0; i < accountArray.length; i++) {
				if (accountArray[i] == null) {
					accountArray[i] = newAccount;
					System.out.println("결과 : 계좌가 생성되었습니다");
					break;
				}
			
			}
		}
			
		
		
		// 계좌목록보기
		private static void accountList() {
			
			System.out.println("-------------");
			System.out.println("계좌목록");
			System.out.println("-------------");
			
			for (int i = 0; i < accountArray.length; i++) {
				
				Account account = accountArray[i];
				if(accountArray[i] != null) {
					System.out.print(account.getAno());
					System.out.printf("\t\t");
					System.out.print(account.getOwner());
					System.out.printf("\t\t");
					System.out.print(account.getBalance());
					System.out.println();

				}
			}
		}
		
		// 예금하기
		private static void deposit() {
			
			System.out.println("-------------");
			System.out.println("예금");	
			System.out.println("-------------");
			System.out.print("계좌번호: ");
			String ano = scanner.next();
			System.out.print("예금액: ");
			int money = scanner.nextInt();
			
//			findAccount(ano).setBalance(findAccount(ano).getBalance() + money);
			
//			Account account = findAccount(ano);
//			if (account != null) {
//				int balance = account.getBalance() + money;
//				account.setBalance(balance);
//				System.out.println("결과: 예금이 성공되었습니다.");
//			} else {
//				System.out.println("결과: 계좌번호를 확인해주세요.");
//			}
			try {
				Account account = findAccount(ano);
				int balance = account.getBalance() + money;
				account.setBalance(balance);
				System.out.println("결과: 예금이 성공되었습니다.");
			} catch (Exception e) {
//				e.printStackTrace();
				System.err.println("계좌번호를 확인해주세요");
			} 
			

		}
		
		// 출금하기
		private static void withdraw() {
			
			System.out.println("-------------");
			System.out.println("출금");	
			System.out.println("-------------");
			System.out.print("계좌번호: ");
			String ano = scanner.next();	
			System.out.print("출금액: ");
			int money = scanner.nextInt();
			
			try {
				Account account = findAccount(ano);
				int balance = account.getBalance() - money;
				account.setBalance(balance);
				System.out.println("결과: 출금이 성공되었습니다.");
			} catch (Exception e) {
//				e.printStackTrace();
				System.err.println("계좌번호를 확인해주세요");
			} 
			
//			findAccount(ano).setBalance(findAccount(ano).getBalance() - money);
//			System.out.println("결과: 출금이 성공되었습니다.");
			
		}
		
		
		// Account 배열에서 ano와 동일한 Account 객체 찾기
		
		private static Account findAccount(String ano) {
			Account find = null;
			for (int i = 0; i < accountArray.length; i++) {
				find = accountArray[i];
				
				if (find != null && ano.equals(find.getAno())){
					return find;
				}
				
//				if (ano == find.getAno()) {return find;}
				
			}
		return null;
			
		}
		
		
		
		
}
