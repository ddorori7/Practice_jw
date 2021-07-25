package singleton;

public class Singleton {
	
	private static Singleton singleton = new Singleton(); 
	// 필드 자기자신의 타입으로 private static Singleton 선언하고
	// 초기화는 자기자신의 객체 하나를 만들어서 new 하고 생성자 호출
	// 자기자신 내부에서는 private 생성자 사용 가능

	private Singleton() { 
	// 생성자 >  private이라 외부에서 절대 new 연산자로 호출 불가
		
	}
	
	static Singleton getInstance() { 
		// 정적타입 메소드 > 외부에서 singleton객체를 호출할 때 쓰임
		
		return singleton;
	}
}
