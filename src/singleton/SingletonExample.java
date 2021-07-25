package singleton;

public class SingletonExample {

	public static void main(String[] args) {
		
//		Singleton obj1 = new Singleton(); 
//		Singleton obj2 = new Singleton(); 
		// 외부에서 객체생성을 못하도록 private으로 막아놔서 오류가 남.
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1==obj2) { // 딱 한개의 객체를 사용하고 있기 때문에 주소값이 같음.
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");

		}
	}

}
