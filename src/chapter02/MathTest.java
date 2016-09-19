package chapter02;

public class MathTest {

	public static void main(String[] args) {
		// 10 <- abs(-10)
		// Math math = new Math();
		// math.abs(-10);
		int i = Math.abs(-10); // 유틸리티 메소드 = 객체를 생성하지 않고 접근할 수 있다 Math...
		int j = Math.max(10, 20); // 유틸리티 메소드

		MathTest.max(10, 20);

		max(10, 20);

	}

	static int max(int i, int j) {
		if (i > j) {
			return i;
		}
		return j;
	}

}
