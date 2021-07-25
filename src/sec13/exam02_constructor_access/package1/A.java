package sec13.exam02_constructor_access.package1;

public class A {
	
	A a1 = new A(true);
	A a2 = new A();
	A a3 = new A("문자열");
	// 자기자신의 클래스 안에서는 어떤 생성자라도 호출 가능
	
	public A(boolean b) {} // public 생성자
	A() {} // 생성자 오버로딩 디폴트 생성자
	private A(String s) {} // private 생성자
}
