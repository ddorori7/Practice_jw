package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.*;

public class C {

	public C() { // A와 다른 패키지
		
		A a = new A(); // A객체생성
		a.field1 = 1;
//		a.field2 = 1; // 디폴트값인 경우에 사용 불가
//		a.field3 = 1; // private인 경우에 사용 불가
		
		a.method1();
//		a.method2(); // 디폴트값인 경우에 사용 불가
//		a.method3(); // private인 경우에 사용 불가
		
	}
	
}
