package bit2016.paint;

public class PaintApp {

	public static void main(String[] args) {
		Point point = new Point(); // 기본생성자
		point.setX(100);
		point.setY(1000);
		point.show();
		
		Point point2 = new Point(123, 1234); // 생성자
		point2.show(true);
		
		point2.show(false);
		
		Point point3 = new ColorPoint(50, 50, "red");
		point3.show();
		point3.show(false);
		point3.show(true);
		
		Shape rectangle = new Rectangle();
//		rectangle.draw();
		draw(rectangle);
//		rectangle.getY1();
//		참조변수가 부모라서 자식에게만 있는 메소드는 접근 불가!!
		
		Shape circle = new Circle();
//		circle.draw();
		draw(circle);
		
		Shape triangle = new Triangle();
//		triangle.draw();
		draw(triangle);
		
		draw(new Pentagon());
	}

	public static void draw(Shape shape) {
		shape.draw();
	}
}

//1. 부모클래스와 자식클래스의 동일한 이름의 멤버변수가 있을 경우 참조변수의 멤버변수 값을 참조한다.
//2. 부모클래스와 자식클래스의 동일한 이름의 메소드가 있을 경우 메소드 오버라이딩 되어 자식클래스의 메소드 결과를 출력한다. (상속관계에 있기 때문)
//3. 부모클래스에는 없고 자식클래스에만 존재하는 메소드를 참조변수가 부모클래스타입인 변수고 접근 불가능 하다.

