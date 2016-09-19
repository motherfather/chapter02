package chapter02;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	public Song() {
		System.out.println("새 노래를 추가하였습니다.");
	}
	
	public Song(String artist, String title) {
//		this.artist = artist;
//		this.title = title;
//		System.out.println("새 노래를 추가하였습니다.");
		this(null, artist, null, title, 0, 0); // 파라미터가 다른 자신의 생성자를 소환할때 this 키워드를 사용한다!!
	}

	public Song(String album, String artist, String composer, String title, int track, int year) {
		this.album = album;
		this.artist = artist;
		this.composer = composer;
		this.title = title;
		this.track = track;
		this.year = year;
		System.out.println("새 노래를 추가하였습니다.");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public void show() {
		System.out.println(
				artist + " " + title + "( " + album + ", " + year + ", " + track + "번 track, " + composer + "작곡 )");
	}
}
