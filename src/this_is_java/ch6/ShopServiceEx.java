package this_is_java.ch6;

public class ShopServiceEx {

	public static void main(String[] args) { // 싱글톤 문제
	

		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		// 정적 메소드 호출로 객체를 호출
		
		if(obj1==obj2) {
			System.out.println("같은 ShopService의 객체입니다.");
		} else {
			System.out.println("다른 ShopService의 객체입니다.");
		}
		
		// 같은 객체주소를 가지고 있음. 같은 객체.
		
		
		
	}

}
