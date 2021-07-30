
public class Jeon {

	public static void main(String[] args) {
	
		
		String j = new String("mossol");
		String mossol = new String("mossol");
		
	
		String haha = j  == "mossol" ? "모쏠입니다.." : "모쏠이 아닙니다!";
		System.out.println(haha);
		haha = j.equals(mossol) ? "모쏠입니다.." : "모쏠이 아닙니다!";
		System.out.println(haha);
	}

}
