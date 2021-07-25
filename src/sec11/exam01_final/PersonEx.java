package sec11.exam01_final;

public class PersonEx {

	public static void main(String[] args) {
		
		Person p1 = new Person("123456-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// 수정해보기
		// final 필드는 에러가 나지만 > 수정불가임
//		p1.nation = "usa";
//		p1.ssn = "654321-3216549";
		// 일반 필드는 값 수정 가능
		p1.name = "을지문덕";
	}

}
