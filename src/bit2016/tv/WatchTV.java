package bit2016.tv;

public class WatchTV {
	public static void main(String[] args) {
		TV tv = new TV(7, 20, false);

		tv.status();

		tv.power(true);
		tv.volume(120);
		tv.status();

		tv.volume(false);
		tv.status();

		tv.channel(0);
		tv.status();

		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();

		tv.power(false);
		tv.status();
		
//		Object의 메소드!
//		tv.hashCode();
//		tv.toString();
//		자동으로 최상위 클래스 Object를 상속한다
	}

}
