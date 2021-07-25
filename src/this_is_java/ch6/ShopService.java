package this_is_java.ch6;

public class ShopService { // 싱글톤 문제

	private static ShopService singleton = new ShopService();
	// 클래스 자신의 타입으로 정적 필드를 선언하고, 자신의 객체를 생성해 초기화 한다.
	// private 접근 제한자를 붙여 외부에서 필드값을 변경할 수 없도록 막는다.
	
	
	private ShopService() {}
	// 외부에서 new 연산자로 생성자를 호출할 수 없도록 막는다(private)
	
	
	static ShopService getInstance() {
		return singleton;
	}
	// 외부에서 호출할 수 있는 정적 메소드인 getInstance()를 선언한다.
	// 정적 필드에서 참조하고 있는 자신의 객체를 리턴하도록 한다.
	
	
}
