package chapter02;

public class SongTest {

	public static void main(String[] args) {
		Song song = new Song();
		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setAlbum("Real");
		song.setComposer("이민수");
		song.setYear(2010);
		song.setTrack(3);
		song.show();

		Song song2 = new Song("Real", "아이유", "이민수", "좋은날", 3, 2010);
		song2.show();

		Song song3 = new Song("임창정", "내가 저지른 사랑");
		song3.show();
		
		Song song4 = new Song("유재석 & EXO", "Dancing King");
		song4.show();
	}

}
