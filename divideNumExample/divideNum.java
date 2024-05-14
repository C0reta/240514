package divideNumExample;

import java.util.Scanner;
import java.lang.ArithmeticException;

public class divideNum {
	public static int divideNum(int int1, int int2) {
		int result1;

		try {
			result1 = int1 / int2;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
		}
		return result1;
	}

	public static void main(String[] args) {
		int num1 = divideNum(1, 0);
		System.out.println(num1);
	}

}
