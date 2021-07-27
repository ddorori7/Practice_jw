package this_is_java.ch7;

public class Parent06 {

	
	public String nation;
	
	public Parent06() {
		this("대한민국");
		System.out.println("Parent06() call");
	}
	
	public Parent06(String nation) {
		this.nation = nation;
		System.out.println("Parent06(String nation) call");
	}
}
