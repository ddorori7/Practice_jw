package sec13.exam01_class_access.package2;

import sec13.exam01_class_access.package1.*;

public class C {
//	A a; // A는 디폴트 접근제한자라 다른 패키지에서는 접근이 불가 > 컴파일 오류
	B b; // B는 public접근제한자 이기 때문에 다른패키지에서도 사용이 가능
	//import sec13.exam01_class_access.package1.*; 추가해주면!
	
	
	
}
