package this_is_java.ch8;

public class ActionEx {

	public static void main(String[] args) {
		Action action = new Action() {
			
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		
		action.work();
		
	}

}