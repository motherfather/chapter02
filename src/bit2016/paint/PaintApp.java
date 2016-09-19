package bit2016.paint;

public class PaintApp {

	public static void main(String[] args) {
		Point point = new Point();
		point.setX(100);
		point.setY(1000);
		point.show();
		
		Point point2 = new Point(123, 1234);
		point2.show(true);
		
		point2.show(false);
	}

}
