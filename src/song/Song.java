package song;

public class Song {
	// 필드 선언
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	// 생성자
	public Song(String title, String artist,
			String album, int year, String composer, String track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
		
	}
	
	// getter/setter
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public String getComposer() {
		return composer;
	}
	
	public int getYear() {
		return year;
	}
	public String getTrack() {
		return track;
	}
	
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
