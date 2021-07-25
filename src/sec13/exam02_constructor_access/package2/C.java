package sec13.exam02_constructor_access.package2;

import sec13.exam02_constructor_access.package1.*;

public class C { // A 와 다른 패키지
	A a1 = new A(true); // public 인 경우에만 사용 가능
//	A a2 = new A(); // 디폴트 생성자는 다른 패키지에서 접근 불가
//	A a3 = new A("문자열"); // private 도 마찬가지
}
