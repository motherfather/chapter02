package chapter02;

public class ArrayUtil {

	// int -> double
	public static double[] intToDouble(int[] a) {
		if (a == null) {
			return null;
		}
		int length = a.length;
		double[] result = new double[length];

		for (int i = 0; i < a.length; i++) {
			result[i] = a[i]; // 자동으로 double로 캐스팅됨!
		}
		return result;
	}

	// double -> int
	public static int[] doubleToInt(double[] a) {
		if (a == null) {
			return null;
		}
		int length = a.length;
		int[] result = new int[length];

		for (int i = 0; i < a.length; i++) {
			result[i] = (int) a[i];
		}
		return result;
	}

	// int + int
	public static int[] concat(int[] s1, int[] s2) {
		int length1 = (s1 == null) ? 0 : s1.length;
		int length2 = (s2 == null) ? 0 : s2.length;

		int length = length1 + length2;
		int[] result = new int[length];
		// int[] result = new int[s1.length + s2.length];

		int index = 0;
		for (int i = 0; i < length1; i++) {
			result[index] = s1[i];
			index++; // 배열루프
		}
		for (int i = 0; i < length2; i++) {
			result[index] = s2[i];
			index++;
		}

		
		// for (int i = s1.length; i < result.length; i++) {
		// 	result[i] = s2[i - s2.length];
		// }
		return result;

	}
}
