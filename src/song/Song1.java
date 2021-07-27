package song;

public class Song1 {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	
	public Song1() {
	} // 기본 생성자
	

	public Song1(String title, String artist) { // 생성자 오버로딩
//		this(title, artist, null, 0, "3번 track", "이민수 작곡"); // 다른 생성자 호출
		this.title = "아이유";
		this.artist = "좋은날";
	}
	
//	public Song1(String title, String artist) { // 생성자 오버로딩 똑같이 하면 에러생김
//		this(title, artist, null, 0, null, null);
//	}

	
	public Song1(String title, String artist,
			String album, int year, String composer, String track) {
		this(title, artist);
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	} // 모든 필드 초기화 생성자?
	
	
	public void showInfo() {
		System.out.printf("%s, %s ( %s, %d, %s, %s )%n", 
				artist, 
				title, 
				album, 
				year,
				track,
				composer);
	}
	
	
	
	
	
}
