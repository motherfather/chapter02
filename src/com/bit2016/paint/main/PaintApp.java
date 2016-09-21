package com.bit2016.paint.main;

import com.bit2016.paint.i.Drawable;
import com.bit2016.paint.i.Resizable;
import com.bit2016.paint.point.ColorPoint;
import com.bit2016.paint.point.Point;
import com.bit2016.paint.shape.Circle;
import com.bit2016.paint.shape.Pentagon;
import com.bit2016.paint.shape.Rectangle;
import com.bit2016.paint.shape.Shape;
import com.bit2016.paint.shape.Triangle;

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

		Drawable rectangle = new Rectangle();
		// rectangle.draw();
		draw(rectangle);
		// rectangle.getY1();
		// 참조변수가 부모라서 자식에게만 있는 메소드는 접근 불가!!

		// Drawable circle = new Circle();
		// circle.draw();
		draw(new Circle());

		// Drawable triangle = new Triangle();
		// triangle.draw();
		draw(new Triangle());

		draw(new Pentagon());

		draw(new ColorPoint(200, 100, "white"));

		resize(new Circle(10));

		// intstanceof test
		Circle c10 = new Circle();
		System.out.println(c10 instanceof Circle);
		// 오류!! instanceof는 상속관계에 있는 클래스만 확인할 수 있다.
		// System.out.println(c10 instanceof Rectangle); 상속관계가 아니라서 안됨
		System.out.println(c10 instanceof Shape);
		// instanceof는 모든 인터페이스에서 구현관계를 확인할 수 있다.
		System.out.println(c10 instanceof Drawable);
		System.out.println(c10 instanceof Resizable);

		System.out.println("-----------구분선------------");
		
		Rectangle rect = new Rectangle();
		System.out.println(rect instanceof Rectangle);
		System.out.println(rect instanceof Shape);
		System.out.println(rect instanceof Drawable);
		System.out.println(rect instanceof Resizable);
		resize2(new Rectangle());
	}

	public static void draw(Drawable drawable) {
		drawable.draw();
	}

	public static void resize2(Drawable drawable) {
		if (drawable instanceof Resizable == false) {
			return;
		}
		Resizable re = (Resizable) drawable;
		re.resize(0.8);
	}

	public static void resize(Resizable resizable) {
		Shape shape = (Shape) resizable;
		double area = shape.calculateArea();
		System.out.println(area);

		resizable.resize(0.5);
		area = shape.calculateArea();
		System.out.println(area);

	}

	// public static void draw(Shape shape) {
	// shape.draw();
	// }
}

// 1. 부모클래스와 자식클래스의 동일한 이름의 멤버변수가 있을 경우 참조변수의 멤버변수 값을 참조한다.
// 2. 부모클래스와 자식클래스의 동일한 이름의 메소드가 있을 경우 메소드 오버라이딩 되어 자식클래스의 메소드 결과를 출력한다. (상속관계에
// 있기 때문)
// 3. 부모클래스에는 없고 자식클래스에만 존재하는 메소드를 참조변수가 부모클래스타입인 변수고 접근 불가능 하다.
