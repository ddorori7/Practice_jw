package song;

public class SongAPP {

	public static void main(String[] args) {
//		Song song1 = new Song("아이유", "좋은날", "Real", 2010, "3번 track", "이민수 작곡");
//		Song song2 = new Song("BIGBANG", "거짓말", "Always", 2007, "2번 track", "G-DRAGON 작곡");
//		Song song3 = new Song("버스커버스커", "벚꽃엔딩", "버스커버스커1집", 2012, "4번 track", "장범준 작곡");
//		
//		
//		song1.showInfo();
//		song2.showInfo();
//		song3.showInfo();
		
		Song1 song1 = new Song1();
		song1.showInfo(); // 기본 생성자 테스트
		
		Song1 song2 = new Song1("아이유", "좋은날", "Real", 
				2010, "3번 track", "이민수 작곡");
		song2.showInfo(); // 모든 필드 초기값 생성자 테스트
		
		Song1 song3 = new Song1("아이유", "좋은날");
		song3.showInfo(); // 생성자 호출 테스트
		
		
	}

}
