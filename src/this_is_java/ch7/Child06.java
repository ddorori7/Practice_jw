package this_is_java.ch7;

public class Child06 extends Parent06 {
	private String name;
	
	public Child06() {
		this("홍길동");
		System.out.println("Child06() call");
		
	
	}
	
	public Child06(String name) {
		this.name = name;
		System.out.println("Child06(String name) call");
		
	
	}

}
