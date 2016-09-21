package com.bit2016.paint.shape;

import com.bit2016.paint.i.Drawable;

public class Pentagon extends Shape implements Drawable {

	@Override
	public void draw() {
		System.out.println("오각형을 그렸습니다.");
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}


}
