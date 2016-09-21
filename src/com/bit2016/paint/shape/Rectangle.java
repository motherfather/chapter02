package com.bit2016.paint.shape;

import com.bit2016.paint.i.Drawable;

public class Rectangle extends Shape implements Drawable {
	private int x1;
	private int y1;
	private int x2;
	private int y2;

	public Rectangle() {
//		super();			이것이 생략되어있음!
	}

	public Rectangle(int x1, int y1, int x2, int y2) { // 생성자를 하나라도 만들면 기본 생성자를 따로 만들어줘야한다
//		super();			이것이 생략되어있음!
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	// @Override
	// ***부분재정의 (부모부분의 super.draw();와 자신의 System.out.~을 사용)***
	// public void draw() {
	// super.draw();
	// System.out.println("draw");
	// }

	@Override
	// ***재정의 (자신의 draw()를 사용)***
	public void draw() {
		System.out.println("사각형을 그렸습니다.");
	}
	
	@Override
	public double calculateArea(){
		return (x2 - x1) * (y2 - y1);
	}

}
