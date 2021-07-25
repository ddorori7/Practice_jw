package this_is_java.ch6;

public class PrinterEx {

	public static void main(String[] args) {
		
//		Printer printer = new Printer(); // static 으로 메소드 선언시
		// 클래스이름.메소드로 호출 가능
		
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");

	}

}
