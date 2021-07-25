package sec11.exam01_final;

public class Person {
	
	// 필드선언
	final String nation = "Korea";
	final String ssn;
	String name;
	
	// 생성자
	public Person(String ssn, String name) {
		this.ssn = ssn; // 외부에서 받은 값으로 초기화
		this.name = name;
//		nation = "America" // final필드에서 값을 줬기 때문에 에러
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
